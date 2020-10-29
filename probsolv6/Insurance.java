package probsolv6;

public class Insurance {
    private String policyName;
    private int policyID;

    public Insurance(String policyName, int policyID){
        setPolicyName(policyName);
        setPolicyID(policyID);
    }

    public String getPolicyName() {
        return policyName;
    }

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    public int getPolicyID() {
        return policyID;
    }

    public void setPolicyID(int policyID) {
        this.policyID = policyID;
    }

    @Override
    public String toString() {
        return "Policy Name: "+getPolicyName()+" Policy ID: "+getPolicyID();
    }
}
