import implementedwithbuilder.Map;
import implementedwithbuilder.MapBuilder;
import implementedwithbuilder.MapDirector;
import implementedwithbuilder.TopographyMap;
import implementedwithbuilder.innerstatic.MapWithInnerBuilder;
import model.MapLegend;
import model.SpecialCharacters;
import nobuilder.MapWithoutBuilder;

import java.util.List;

public class Simulator {

    public static void main(String[] args) {

        //tiwhout builder
        MapLegend topographicLegen = new MapLegend("rightDownCorner", "topographic");
        MapLegend wheaterLegend = new MapLegend("rightUpCorner", "wheater");

        MapWithoutBuilder topographic = new MapWithoutBuilder(1L, "Topographic-1", 300.0, 400.0, MapWithoutBuilder.MapType.TOPOGRAPHIC, 0.000001, 10.0, topographicLegen, List.of(new SpecialCharacters(2L, "char2")));
        MapWithoutBuilder weather = new MapWithoutBuilder(1L, "Wheater-1", 500.0, 500.0, MapWithoutBuilder.MapType.WHEATER, 0.0001, 0.1, wheaterLegend, List.of(new SpecialCharacters(1L, "char1")));


        System.out.println(topographic);
        System.out.println(weather);


        //with builder
        MapBuilder topographyMapBuilder = new TopographyMap("Topography-1D", 300.0, 200.0, 0.00003, 10.0);
        MapDirector director = new MapDirector();
        Map topographic2 = director.createTopographyMap(topographyMapBuilder);

        System.out.println(topographic2.toString());

        //with statis fluent builder

        MapWithInnerBuilder map = new MapWithInnerBuilder.MapBuilder()
                .id(1L)
                .name("Topography")
                .width(300.0)
                .height(300.0)
                .scale(0.0001)
                .pitch(0.0002)
                .specialCharacters(List.of(new SpecialCharacters(1L, "kiosk")))
                .legend(new MapLegend("rightUp", "topoLegend"))
                .build();

        System.out.println("map with inner " + map.toString());
    }
}
