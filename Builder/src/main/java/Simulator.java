package nodpimpl;

public class Simulator {

    public static void main(String[] args) {
        MapLegend topographicLegen = new MapLegend("rightDownCorner");
        MapLegend wheaterLegend = new MapLegend("rightUpCorner");

        Map topographic = new Map(1L, "Topographic-1", 300.0, 400.0, Map.MapType.TOPOGRAPHIC, 0.000001, 10.0 , topographicLegen);
        Map wheater = new Map(1L, "Wheater-1", 500.0, 500.0, Map.MapType.WHEATER, 0.0001, 0.1, wheaterLegend);

    }
}
