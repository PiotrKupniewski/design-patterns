package implementedwithbuilder;

public abstract class Map {

    private final String name;
    private final Double width;
    private final Double height;
    private final Double scale;
    private final Double pitch;


    public Map(String name, Double width, Double height, Double scale, Double pitch) {
        this.name = name;
        this.width = width;
        this.height = height;
        this.scale = scale;
        this.pitch = pitch;
    }

    @Override
    public String toString() {
        return "Map{" +
                "name='" + name + '\'' +
                ", width=" + width +
                ", height=" + height +
                ", scale=" + scale +
                ", pitch=" + pitch +
                '}';
    }
}
