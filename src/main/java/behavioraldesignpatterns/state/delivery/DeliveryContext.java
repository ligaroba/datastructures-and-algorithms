package behavioraldesignpatterns.state.delivery;

public class DeliveryContext {
    private PackageState currentState;
    private String packageID;

    public DeliveryContext(PackageState currentState,String packageID){
        this.currentState=currentState;
        this.packageID=packageID;

        if(currentState==null)
            this.currentState=Acknowledged.getInstance();
    }


    public PackageState getCurrentState() {
        return currentState;
    }

    public void setCurrentState(PackageState currentState) {
        this.currentState = currentState;
    }

    public String getPackageID() {
        return packageID;
    }

    public void setPackageID(String packageID) {
        this.packageID = packageID;
    }

    public void update(){
        currentState.updateState(this);
    }
}
