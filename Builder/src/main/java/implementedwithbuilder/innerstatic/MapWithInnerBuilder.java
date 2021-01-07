package implementedwithbuilder.innerstatic;

import model.MapLegend;
import model.SpecialCharacters;

import java.util.List;

public class MapWithInnerBuilder {

    private Long id;
    private String name;
    private Double width;
    private Double height;
    private Double scale;
    private Double pitch;
    private List<SpecialCharacters> specialCharacters;
    private MapLegend legend;

    @Override
    public String toString() {
        return "MapWithInnerBuilder{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", width=" + width +
                ", height=" + height +
                ", scale=" + scale +
                ", pitch=" + pitch +
                ", specialCharacters=" + specialCharacters +
                ", legend=" + legend +
                '}';
    }

    public static final class MapBuilder{

        private Long id;
        private String name;
        private Double width;
        private Double height;
        private Double scale;
        private Double pitch;
        private List<SpecialCharacters> specialCharacters;
        private MapLegend legend;

        public MapBuilder id (Long id){
            this.id = id;
            return this;
        }
        public MapBuilder name (String name){
            this.name = name;
            return this;
        }
        public MapBuilder width (Double width){
            this.width = width;
            return this;
        }
        public MapBuilder height (Double height){
            this.height = height;
            return this;
        }
        public MapBuilder scale (Double scale){
            this.scale = scale;
            return this;
        }
        public MapBuilder pitch (Double pitch){
            this.pitch = pitch;
            return this;
        }
        public MapBuilder specialCharacters (List<SpecialCharacters> specialCharacters){
            this.specialCharacters = specialCharacters;
            return this;
        }
        public MapBuilder legend (MapLegend legend){
            this.legend = legend;
            return this;
        }


        public MapWithInnerBuilder build(){
            MapWithInnerBuilder map = new MapWithInnerBuilder();
            map.id = this.id;
            map.name = this.name;
            map.width = this.width;
            map.height = this.height;
            map.scale = this.scale;
            map.pitch = this.pitch;
            map.specialCharacters = this.specialCharacters;
            map.legend = this.legend;

            return map;
        }

    }

}
