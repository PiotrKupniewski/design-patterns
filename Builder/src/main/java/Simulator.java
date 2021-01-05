import implementedwithbuilder.MapBuilder;
import implementedwithbuilder.MapDirector;
import implementedwithbuilder.TopographyMap;
import model.MapLegend;
import model.SpecialCharacters;
import nobuilder.Map;

import java.util.List;

public class Simulator {

    public static void main(String[] args) {

        //tiwhout builder
        MapLegend topographicLegen = new MapLegend("rightDownCorner", "topographic");
        MapLegend wheaterLegend = new MapLegend("rightUpCorner", "wheater");

        Map topographic = new Map(1L, "Topographic-1", 300.0, 400.0, Map.MapType.TOPOGRAPHIC, 0.000001, 10.0, topographicLegen, List.of(new SpecialCharacters(2L, "char2")));
        Map weather = new Map(1L, "Wheater-1", 500.0, 500.0, Map.MapType.WHEATER, 0.0001, 0.1, wheaterLegend, List.of(new SpecialCharacters(1L, "char1")));

        System.out.println(topographic);
        System.out.println(weather);


        //with builder
        MapBuilder topographyBuilder = new TopographyMap("name", 300.0, 200.0, 0.00003, 10.0);
        MapDirector director = new MapDirector();
        implementedwithbuilder.Map topographic2 = director.createTopographyMap(topographyBuilder);

        System.out.println(topographic2.toString());


    }
}
