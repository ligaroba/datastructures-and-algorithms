package creationaldesignpatterns.abstractfactory;

public class AfricaCarFactory {
    public static Car buildCar(Cartype model) {
        switch (model) {
            case SMALL:
                return new SmallCar(Location.AFRICA);
            case LUXURY:
                return new LuxuryCar(Location.AFRICA);
            case SEDAN:
                return new SedanCar(Location.AFRICA);
            default:
                // throw Exceprion
                return null;
        }
    }
}
