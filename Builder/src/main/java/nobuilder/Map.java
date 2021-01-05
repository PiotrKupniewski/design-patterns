package nobuilder;

import java.util.List;

public class Map {

    public enum MapType{
        TOPOGRAPHIC, THEMATIC, WHEATER, GENERAL_REFERENCE
    }

    Long id;
    String name;
    Double width;
    Double height;
    MapType type;
    Double scale;
    Double pitch;
    MapLegend legend;
    List<SpecialCharacters> specialCharactersList;

    public Map(Long id, String name, Double width, Double height, MapType type, Double scale, Double pitch, MapLegend legend, List<SpecialCharacters> specialCharactersList) {
        this.id = id;
        this.name = name;
        this.width = width;
        this.height = height;
        this.type = type;
        this.scale = scale;
        this.pitch = pitch;
        this.legend = legend;
        this.specialCharactersList = specialCharactersList;
    }

    public String getName() {
        return name;
    }

    public Double getWidth() {
        return width;
    }

    public Double getHeight() {
        return height;
    }

    public MapType getType() {
        return type;
    }

    public Double getScale() {
        return scale;
    }

    public Double getPitch() {
        return pitch;
    }

    public MapLegend getLegend() {
        return legend;
    }
}
