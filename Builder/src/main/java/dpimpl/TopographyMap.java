package dpimpl;

import nodpimpl.MapLegend;
import nodpimpl.SpecialCharacters;

import java.util.List;

public class TopographyMap extends Map implements MapBuilder {

    private List<SpecialCharacters> specialCharacters;
    private MapLegend legend;

    public TopographyMap(String name, Double width, Double height, Double scale, Double pitch) {
        super(name, width, height, scale, pitch);
    }

    @Override
    public List<SpecialCharacters> createSpecialCharacters() {
        SpecialCharacters char1 = new SpecialCharacters(1L, "character1");
        SpecialCharacters char2 = new SpecialCharacters(2L, "character2");
        this.specialCharacters = List.of(char1, char2);
        return specialCharacters;
    }

    @Override
    public MapLegend createMapLegend() {
        this.legend = new  MapLegend("rightUpCorner","topographic");
        return legend;
    }

    @Override
    public Map build() {
        return this;
    }

    @Override
    public String toString() {
        return "TopographyMap{" +
                "specialCharacters=" + specialCharacters +
                ", legend=" + legend +
                super.toString() +
                '}';
    }
}
