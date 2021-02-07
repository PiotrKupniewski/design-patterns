import factorymethod2.Source;
import factorymethod2.SourceFactory;
import uglyjava.BikeRouteFinder;
import uglyjava.CarRouteFinder;

public class Simulator {

    public static void main(String[] args) {

        //without design pattern
        uglyjava.RouteFinder bikeRouteFinder = new BikeRouteFinder();
        bikeRouteFinder.findDestinationRoute();

        CarRouteFinder carRouteFinder = new CarRouteFinder();
        carRouteFinder.findDestinationRoute();

        /*
            withing the factory, we have encapsulated object constructors, so we cannot create class strictly by the 'new' keyword - package private object classes
            developers knows from the beginning they should create object, but they gave no impact on the creation process, so they are able to screw up less
        */

        //implementations after Tomeks advieses

        SourceFactory factory = new SourceFactory();
        Source cinemaSource = factory.createSourceByType("cinema");
        Source roadSource = factory.createSourceByType("road");

        Source cinemaSource2 = factory.createCinemaSource();
        Source roadSource2 = factory.createRoadSource();

        System.out.println("Cinema  " + cinemaSource.printWhoAmI());
        System.out.println("Road  " + roadSource.printWhoAmI());

        System.out.println("Cinema2  " + cinemaSource2.printWhoAmI());
        System.out.println("Road2  " + roadSource2.printWhoAmI());

    }
}
