package implementedwithbuilder;

import nobuilder.MapLegend;
import nobuilder.SpecialCharacters;

import java.util.List;

public interface MapBuilder {

   List<SpecialCharacters> createSpecialCharacters();
   MapLegend createMapLegend();
   Map build();
}
