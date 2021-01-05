package implementedwithbuilder;

public abstract class Map {

    private String name;
    private Double width;
    private Double height;
    private Double scale;
    private Double pitch;

    public Map(String name, Double width, Double height, Double scale, Double pitch) {
        this.name = name;
        this.width = width;
        this.height = height;
        this.scale = scale;
        this.pitch = pitch;
    }

    public Double getScale() {
        return scale;
    }

    public Double getPitch() {
        return pitch;
    }


    public String getName() {
        return name;
    }

    public Double getWidth() {
        return width;
    }

    public Double getHeight() {
        return height;
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
