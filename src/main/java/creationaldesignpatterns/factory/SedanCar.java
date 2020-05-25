package creationaldesignpatterns.factory;

public class SedanCar extends Car{
   public SedanCar(){
       super(Cartype.SEDAN);
       construct();
    }

    @Override
    public void construct() {
        System.out.println("Building a Sedan car ");
    }
}
