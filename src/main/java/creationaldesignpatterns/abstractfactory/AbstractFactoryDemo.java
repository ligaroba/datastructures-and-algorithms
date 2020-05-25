package creationaldesignpatterns.abstractfactory;

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        System.out.println(CarFactory.buildCar(Cartype.SMALL));
        System.out.println(CarFactory.buildCar(Cartype.SEDAN));
        System.out.println(CarFactory.buildCar(Cartype.LUXURY));
    }
}
