package factoryMethod;

public class Route {

    private final Double distance;

    public Route(Double distance) {
        this.distance = distance;
    }

    public Double getDistance() {
        return distance;
    }

    @Override
    public String toString() {
        return "Route{" +
                "distance=" + distance +
                '}';
    }
}
