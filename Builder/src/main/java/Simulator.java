import dpimpl.MapBuilder;
import dpimpl.MapDirector;
import dpimpl.TopographyMap;
import nodpimpl.Map;
import nodpimpl.MapLegend;
import nodpimpl.SpecialCharacters;

import java.nio.MappedByteBuffer;
import java.util.List;

public class Simulator {

    public static void main(String[] args) {

        //tiwhout builder
        MapLegend topographicLegen = new MapLegend("rightDownCorner", "topographic");
        MapLegend wheaterLegend = new MapLegend("rightUpCorner", "wheater");

        Map topographic = new Map(1L, "Topographic-1", 300.0, 400.0, Map.MapType.TOPOGRAPHIC, 0.000001, 10.0 , topographicLegen, List.of(new SpecialCharacters(2L, "char2")));
        Map wheater = new Map(1L, "Wheater-1", 500.0, 500.0, Map.MapType.WHEATER, 0.0001, 0.1, wheaterLegend, List.of(new SpecialCharacters(1L, "char1")));



        //with builder
        MapBuilder builder = new TopographyMap("name", 300.0, 200.0, 0.00003, 10.0);
        MapDirector director = new MapDirector();
        dpimpl.Map topographic2 = director.createTopographyMap(builder);

        System.out.println(topographic2.toString());




    }
}
