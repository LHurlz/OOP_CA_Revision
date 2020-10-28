package probsolv5.exB;

public class Computer {
    private Case caseDetails;
    private String monitor;
    private String motherboard;

    public Computer(Case caseDetails, String monitor, String motherboard){
        setCaseDetails(caseDetails);
        setMonitor(monitor);
        setMotherboard(motherboard);
    }

    public Case getCaseDetails() {
        return caseDetails;
    }

    public void setCaseDetails(Case caseDetails) {
        this.caseDetails = caseDetails;
    }

    public String getMonitor() {
        return monitor;
    }

    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }

    public String getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(String motherboard) {
        this.motherboard = motherboard;
    }

    @Override
    public String toString() {
        return "Case Details: " + getCaseDetails() + "\nMonitor: "+getMonitor()+"\nMotherboard: "+getMotherboard();
    }
}
