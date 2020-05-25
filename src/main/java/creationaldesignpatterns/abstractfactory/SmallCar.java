package creationaldesignpatterns.abstractfactory;

public class SmallCar extends Car {
    public SmallCar(Location location){
        super(Cartype.SMALL,location);
        construct();
    }

    @Override
    public void construct() {
        System.out.println("Building Small car");
    }
}
