package implementedwithbuilder;

import model.MapLegend;
import model.SpecialCharacters;

import java.util.List;

public interface MapBuilder {

    List<SpecialCharacters> createSpecialCharacters();

    MapLegend createMapLegend();

    Map build();
}
