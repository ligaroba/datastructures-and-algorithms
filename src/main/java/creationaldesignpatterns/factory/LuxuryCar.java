package creationaldesignpatterns.factory;

public class LuxuryCar extends Car {
    public LuxuryCar() {
        super(Cartype.LUXURY);
        construct();
    }

    @Override
    public void construct() {
        System.out.println("Building Luxury Car");

    }


}
