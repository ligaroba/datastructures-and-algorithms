package creationaldesignpatterns.abstractfactory;

public class DefaultCarFactory {
    public static Car buildCar(Cartype model) {
        switch (model) {
            case SMALL:
                return new SmallCar(Location.DEFAULT);
            case LUXURY:
                return new LuxuryCar(Location.DEFAULT);
            case SEDAN:
                return new SedanCar(Location.DEFAULT);
            default:
                // throw Exceprion
                return null;
        }
    }
}
