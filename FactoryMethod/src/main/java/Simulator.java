import factoryMethod.BikeRouteFinder;
import factoryMethod.CarRouteFinder;
import factoryMethod.RouteFactory;
import factoryMethod.RouteFinder;

public class Simulator {

    public static void main(String[] args) {

        //without design pattern
        RouteFinder bikeRouteFinder = new BikeRouteFinder();
        bikeRouteFinder.findDestinationRoute();

        CarRouteFinder carRouteFinder = new CarRouteFinder();
        carRouteFinder.findDestinationRoute();


        //with desing patter
        RouteFactory routeFactory = new RouteFactory();
        RouteFinder bikeRouteFinderWithFactory = routeFactory.createRouteFinder("bike");
        bikeRouteFinderWithFactory.findDestinationRoute();

        RouteFinder carRouteFinderWithFactory = routeFactory.createRouteFinder("car");
        carRouteFinderWithFactory.findDestinationRoute();
    }
}
