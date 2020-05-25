package creationaldesignpatterns.abstractfactory;

public class USCarFactory {
    public static Car buildCar(Cartype model) {
        switch (model) {
            case SMALL:
                return new SmallCar(Location.US);
            case LUXURY:
                return new LuxuryCar(Location.US);
            case SEDAN:
                return new SedanCar(Location.US);
            default:
                // throw Exceprion
                return null;
        }
    }
}
