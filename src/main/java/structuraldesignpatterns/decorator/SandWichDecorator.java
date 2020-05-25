package structuraldesignpatterns.decorator;

public abstract  class SandWichDecorator implements Sandwich {
    protected Sandwich customSandwich;

    public SandWichDecorator(Sandwich customSandwich){
        this.customSandwich=customSandwich;
    }
    public String make(){
        return customSandwich.make();
    }
}
