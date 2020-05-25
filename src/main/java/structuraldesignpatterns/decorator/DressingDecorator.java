package structuraldesignpatterns.decorator;

public class DressingDecorator extends SandWichDecorator{
    public DressingDecorator(Sandwich customSandwich) {
        super(customSandwich);
    }

    public String make(){
        return customSandwich.make()+addDressing();
    }
    private String addDressing(){
        return " + mustard ";
    }
}
