package lab7.ex3;

public class TestCollegeApp {
    public static void main(String[] args) {
        Student student1 = new Student(154345,"Jake","Computing");
        Student student2 = new Student(234532,"Mary","Creative Media");
        Student student3 = new Student(453726,"Tommy","Computing");
        Student student4 = new Student(623456,"Peter","Creative Media");

        Student[] computingStudents = new Student[10];
        computingStudents[0]=student1;
        computingStudents[1]=student3;

        Student[] mediaStudents = new Student[10];
        mediaStudents[0]=student2;
        mediaStudents[1]=student4;

        Department Computing = new Department("Computing",computingStudents);
        Department Media = new Department("Media",mediaStudents);

        Department[] allDepartments = new Department[5];
        allDepartments[0]=Computing;
        allDepartments[1]=Media;

        Institute institute = new Institute("Institute of Technology, Tralee",allDepartments);

        System.out.println(institute);

        System.out.println("\n\nTotal students in institute: " + institute.getTotalStudents());

        System.out.println("\n\nNow moving Jake to Creative Media dept");

        int compSub=-1, mediaSub=-1;

        for(int i=0; i<allDepartments.length; i++){
            if(allDepartments[i]!=null && allDepartments[i].getName().equals("Computing")){
                compSub=i;
            }
            if(allDepartments[i]!=null && allDepartments[i].getName().equals("Media")){
                mediaSub=i;
            }
        }

        if(compSub!=-1 && mediaSub!=-1){
            Student[] studentSearch = allDepartments[compSub].getStudents();

            for(int j=0; j<studentSearch.length; j++){
                if(studentSearch[j]!=null){
                    if(studentSearch[j].getId()==154345){
                        System.out.println("\n\nJake Found!!!");
                        studentSearch[j].setDepartment("Creative Media");
                        mediaStudents[2]=studentSearch[j];
                        computingStudents[0]=null;
                        break;
                    }
                    else
                        System.out.println("\n\nJake Not Found");

                }
            }
        }

        System.out.println("\n\n"+institute);
    }
}
