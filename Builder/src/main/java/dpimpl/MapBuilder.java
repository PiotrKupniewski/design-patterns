package dpimpl;

import nodpimpl.MapLegend;
import nodpimpl.SpecialCharacters;

import java.util.List;

public interface MapBuilder {

   List<SpecialCharacters> createSpecialCharacters();
   MapLegend createMapLegend();
   Map build();
}
