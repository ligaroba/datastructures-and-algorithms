package structuraldesignpatterns.decorator;

public class DecoratorSandwichDemo {
    public static void main(String[] args) {
        Sandwich sandwich = new DressingDecorator(new MeatDecorator(new SimpleSandWich()));
        System.out.println(sandwich.make());
    }
}
