package implementedwithbuilder;

public class MapDirector {

    public Map createTopographyMap(MapBuilder builder){
        builder.createMapLegend();
        builder.createSpecialCharacters();
        return builder.build();
    }
}
