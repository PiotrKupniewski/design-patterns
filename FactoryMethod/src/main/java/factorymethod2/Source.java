package factorymethod2;

public interface Source {

    static Source createRoadSource(){
        return  new RoadSource();
    }

    static Source createCinemasSource(){
        return new CinemasSource();
    }
}
