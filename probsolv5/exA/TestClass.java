package probsolv5.exA;

public class TestClass {
    public static void main(String[] args) {
        Class c1 = new Class("Yoga for Beginners", "Community Centre, Ballyheigue", 23, new Time(19, 30, 0), new Time(20, 45, 0));
        Class c2 = new Class("Intermediate Zumba", "Caherciveen Sports Hall", 18, new Time(18, 45, 0), new Time(19, 30, 0));
        Class c3 = new Class("Object Oriented Programming", "S306", 22, new Time(9, 0, 0), new Time(11, 0, 0));


        Class[] allClasses = new Class[3];
        allClasses[0] = c1;
        allClasses[1] = c2;
        allClasses[2] = c3;

        System.out.println("Displaying the state of the 3 Class objects at this point\n\n");

        for (int i = 0; i < allClasses.length; i++) {
            System.out.println("Class " + (i + 1) + "\n\n" + allClasses[i].toString() + "\n\n");
        }

        c3.setStartTime(new Time(11, 60, -12));
        c3.setFinishTime(new Time(-2, 58, 61));

        System.out.println("Attempting to change start+finish times of OOP class to dodgy values\n\nState of OOP class is now\n\n");

        System.out.println(c3.toString());

        Time yogaStartTime = new Time(19, 45, 0);
        c1.setStartTime(yogaStartTime);

        System.out.println("\n\nAttempting to change start time of Yoga class to 19:45 using referenced Time object\n\nState of Yoga class is now\n\n");

        System.out.println(c1.toString());

        yogaStartTime.setHour(18);
        yogaStartTime.setMinute(50);
        yogaStartTime.setSecond(0);

        System.out.println("\n\nNow changing the time of referenced Time object to 18:50\n\nThe state of yogaStartTime is now " + yogaStartTime.toString());

        System.out.println("\n\nState of Yoga class is now\n\n");

        System.out.println(c1.toString());

        Time c2FinishTime = c2.getFinishTime();

        System.out.println("\n\nNow called getFinishTime() to return finish time of the Zumba class - this is stored in a Time object called c2FinishTime" + "" +
                "\n\nThe state of c2FinishTime is currently " + c2FinishTime.toString());

        System.out.println("\nNow trying to change the zumba class finish time to 19:50 by altering the c2FinishTime object");
        c2FinishTime.setHour(19);
        c2FinishTime.setMinute(50);

        System.out.println("\n\nThe state of c2FinishTime is now " + c2FinishTime.toString() + "\n\nThe state of the zumba class is now \n\n" + c2.toString());
    }
}
