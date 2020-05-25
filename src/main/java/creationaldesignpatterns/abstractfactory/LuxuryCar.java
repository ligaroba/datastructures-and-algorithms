package creationaldesignpatterns.abstractfactory;

public class LuxuryCar extends Car {
    public LuxuryCar(Location location) {
        super(Cartype.LUXURY,location);
        construct();
    }

    @Override
    public void construct() {
        System.out.println("Building Luxury Car");

    }


}
