package probsolv6;

public class TestEmployee {
    public static void main(String[] args) {
        Insurance e1Insurance = new Insurance("Irish Life Excel 500",5468292);
        Employee e1 = new Employee("Joseph Bloggs III",536272,new Address("123 Hyde Road","Ballydehob","Cork","Ireland","R54HT7D"),e1Insurance);

        Insurance e2Insurance = new Insurance("AXA Superlative Life",9374633);
        Employee e2 = new Employee("Marie O Connell",982111,new Address("Boreen na dTonnta","Connemara","Galway","Ireland","PG52K3B"),e2Insurance);

        Insurance e3Insurance = new Insurance("LA Brokers Golden Goose",7372642);
        Employee e3 = new Employee("Mark Mc Manus",352723,new Address("87 Racecourse Lawn","Tralee","Kerry","Ireland","AH78P36"),e3Insurance);

        Employee[] allEmployees = new Employee[5];
        allEmployees[0]=e1;
        allEmployees[1]=e2;
        allEmployees[2]=e3;

        System.out.println("Displaying the state of the "+allEmployees.length+" Employee objects at this point");

        for(int i=0; i< allEmployees.length; i++){
            System.out.println("\n\nEmployee "+(i+1)+"\n\n"+allEmployees[i]);
        }

        System.out.println("\n\nNow searching through the array of Employee objects to find any employees whose name contains the word 'joseph'");

        String listJoseph="";
        int subJoseph=-1;

        for(int i=0; i< allEmployees.length;i++){
            if(allEmployees[i]!=null){
                if(allEmployees[i].getName().toLowerCase().contains("joseph")){
                    listJoseph+="\n\n"+allEmployees[i];
                    subJoseph=i;
                }
            }
        }

        System.out.println("\n\nThe details of all employees whose name contains the word 'joseph' is:"+listJoseph);

        System.out.println("\n\nNow changing the address of Joseph Bloggs III");

        allEmployees[subJoseph].setAddress(new Address("56 Main Street","Thurles","Tipperary","Ireland","Ireland"));

        System.out.println("\n\nDisplaying the state of the 'Joseph Bloggs III' employee now gives\n\n"+allEmployees[subJoseph]);

        System.out.println("\n\nNow removing the insurance details completely for the second employee object");

        e2.setInsurance(null);

        System.out.println("\n\nDisplaying the state of the second employee now gives\n\n"+e2.toString());

        System.out.println("\n\nDisplaying the state of the second employee now gives\n\n"+e2Insurance.toString());

        System.out.println("\n\nDisplaying the state of all employees who hail from county Kerry");

        String kerryList="";

        for(int i=0;i< allEmployees.length;i++){
            if(allEmployees[i]!=null)
                if(allEmployees[i].getAddress().getCounty().toLowerCase().equals("kerry"))
                    kerryList+="\n\n"+allEmployees[i];
        }

        System.out.println(kerryList);

        Employee e4 = new Employee("Jaimie O Toole",234234,new Address("2 Rock St","Mallow","Cork","Ireland","YU67R34"),e3Insurance);
        Employee e5 = new Employee("Lara Connolly",568554,new Address("12 Westbrook Drive","Trim","Meath","Ireland","78TYMDS"),e3Insurance);

        allEmployees[3]=e4;
        allEmployees[4]=e5;

        sortEmployeesByName(allEmployees);

        System.out.println("\n\nDisplaying the state of the 5 Employee objects at this point in alphabetical order by name");

        for(int i=0; i< allEmployees.length; i++){
            System.out.println("\n\nEmployee "+(i+1)+"\n\n"+allEmployees[i]);
        }
    }

    private static void sortEmployeesByName(Employee[] all){
        Employee temp;
        String smallest;
        int sub;

        for(int i=0;i<all.length-1;i++){
            smallest=all[i].getName();
            sub=i;

            for(int j=i+1;j< all.length;j++){
                if(all[j].getName().compareTo(smallest)<0){
                    smallest=all[j].getName();
                    sub=j;
                }
            }

            temp=all[i];
            all[i]=all[sub];
            all[sub]=temp;
        }
    }
}
