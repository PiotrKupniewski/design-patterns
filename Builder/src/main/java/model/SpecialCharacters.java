package model;

public class SpecialCharacters {
    Long id;
    String name;

    public SpecialCharacters(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
