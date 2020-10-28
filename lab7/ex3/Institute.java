package lab7.ex3;

import java.util.Arrays;

public class Institute {
    private String name;
    private Department[] departments;

    public Institute(String name, Department[] departments){
        setName(name);
        setDepartments(departments);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department[] getDepartments() {
        return departments;
    }

    public void setDepartments(Department[] departments) {
        this.departments = departments;
    }

    @Override
    public String toString() {
        String str="Name: "+getName()+"\n\nDepartments:";

        for(int i=0;i<departments.length;i++){
            if(departments[i]!=null)
                str+=departments[i];
        }

        return str;
    }

    public int getTotalStudents(){
        int count=0;
        Student[] students;

        for(int i=0; i<departments.length; i++){
            if(departments[i]!=null){
                students=departments[i].getStudents();

                for(int j=0; j<students.length; j++){
                    if(students[j]!=null)
                        count++;
                }
            }
        }

        return count;
    }
}
