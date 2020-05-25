package creationaldesignpatterns.factory;

public class SmallCar extends Car{
    public SmallCar(){
        super(Cartype.SMALL);
        construct();
    }

    @Override
    public void construct() {
        System.out.println("Building Small car");
    }
}
