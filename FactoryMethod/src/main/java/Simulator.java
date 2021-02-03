import factoryMethod.BikeRouteFinder;
import factoryMethod.CarRouteFinder;
import factoryMethod.RouteFactory;
import factoryMethod.RouteFinder;
import factorymethod2.Source;

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


        // with design pattern 2
        Source routeSource = Source.createRoadSource();
        Source cinemasSource = Source.createCinemasSource();

        System.out.println("route source " + routeSource);
        System.out.println("route cinemasSource " + cinemasSource);

    }
}
