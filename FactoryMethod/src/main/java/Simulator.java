import factoryMethod.RouteFactory;
import factoryMethod.RouteFinder;

public class Simulator {

    public static void main(String[] args) {
        RouteFactory routeFactory = new RouteFactory();
        RouteFinder bikeRouteFinder = routeFactory.createRouteFinder("bike");
        bikeRouteFinder.findDestinationRoute();

        RouteFinder carRoouteFinder = routeFactory.createRouteFinder("car");
        carRoouteFinder.findDestinationRoute();
    }
}
