package creationaldesignpatterns.factory;

public class CarFactory {
    public static Car buildCar(Cartype model) {
        switch (model) {
            case SMALL:
                return new SmallCar();
            case LUXURY:
                return new LuxuryCar();
            case SEDAN:
                return new SedanCar();
            default:
                // throw Exceprion
                return null;
        }
    }
}
