package factorymethod2;


public class SourceFactory {
    public Source createSourceByType(String type) {
        if (type.equalsIgnoreCase("cinema")) {
            return new CinemasSource();
        } else {
            return new RoadSource();
        }
    }

    //here is also possible to do ii , like that ,  this approach is cleaner for me

    public Source createRoadSource(){
        return new RoadSource();
    }
    public Source createCinemaSource(){
        return new CinemasSource();
    }
}
