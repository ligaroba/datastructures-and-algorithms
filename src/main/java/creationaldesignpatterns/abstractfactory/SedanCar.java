package creationaldesignpatterns.abstractfactory;

public class SedanCar extends Car {
   public SedanCar(Location location){
       super(Cartype.SEDAN,location);
       construct();
    }

    @Override
    public void construct() {
        System.out.println("Building a Sedan car ");
    }
}
