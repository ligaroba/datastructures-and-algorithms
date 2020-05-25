package creationaldesignpatterns.abstractfactory;

public class CarFactory {
    public CarFactory(){

    }
    public static Car buildCar(Cartype model) {
        Location location=Location.AFRICA;
        Car car=null;
        switch (location) {
            case AFRICA:
                return AfricaCarFactory.buildCar(model);
            case US:
                return USCarFactory.buildCar(model);
            case DEFAULT:
                return DefaultCarFactory.buildCar(model);
            default:
                // throw Exceprion
                return null;
        }
    }
}
