package probsolv5.exA;

public class Class {
    private String name;
    private String location;
    private int enrollment;
    private Time startTime;
    private Time finishTime;

    public Class (String name,String location,int enrollment,Time startTime,Time finishTime){
        setName(name);
        setLocation(location);
        setEnrollment(enrollment);
        setStartTime(startTime);
        setFinishTime(finishTime);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getEnrollment() {
        return enrollment;
    }

    public void setEnrollment(int enrollment) {
        this.enrollment = enrollment;
    }

    public Time getStartTime() {
        return new Time(startTime.getHour(),startTime.getMinute(),startTime.getSecond());
    }

    public void setStartTime(Time startTime) {
        this.startTime = new Time(startTime.getHour(),startTime.getMinute(),startTime.getSecond());
    }

    public Time getFinishTime() {
        return new Time(finishTime.getHour(),finishTime.getMinute(),finishTime.getSecond());
    }

    public void setFinishTime(Time finishTime) {
        this.finishTime = new Time(finishTime.getHour(),finishTime.getMinute(),finishTime.getSecond());
    }

    @Override
    public String toString() {
        return "Name: " + getName() + "\nLocation: " +getLocation()+"\nEnrollment: "+getEnrollment()+"\nStart time: "+getStartTime()
                +"\nFinish time: "+getFinishTime();
    }
}
