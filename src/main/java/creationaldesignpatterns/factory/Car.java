package creationaldesignpatterns.factory;

public abstract class Car {

    protected Cartype model= null;
    public Car(Cartype model){
        this.model=model;
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
}
