package factorymethod2;

class RoadSource implements Source {
    @Override
    public String printWhoAmI() {
        return "Im Road source";
    }
}
