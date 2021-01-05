package nodpimpl;

public class MapLegend {
    String place;
    String name;

    public MapLegend(String place, String name){
        this.place = place;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getPlace() {
        return place;
    }
}
