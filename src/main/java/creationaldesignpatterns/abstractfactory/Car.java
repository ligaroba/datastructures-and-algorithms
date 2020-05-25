package creationaldesignpatterns.abstractfactory;

public abstract class Car {

    protected Cartype model= null;
    protected Location location = null;
    public Car(Cartype model,Location location){
        this.model=model;
        this.location=location;
        arrangeParts();

    }

    private void arrangeParts(){
        // Do processing here
    }

    //Do subclass level processing in this method
    public abstract void construct();

    public Cartype getModel() {
        return model;
    }

    public void setModel(Cartype model) {
        this.model = model;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
    public String toString(){
        return " Model - " + model + " built in " + location;
    }
}
