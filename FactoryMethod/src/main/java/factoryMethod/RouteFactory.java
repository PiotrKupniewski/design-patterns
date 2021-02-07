package factoryMethod;

public class RouteFactory {
    public RouteFinder createRouteFinder(String type) {
        if (type.equalsIgnoreCase("bike")) {
            return new BikeRouteFinder();
        } else {
            return new CarRouteFinder();
        }
    }
}
