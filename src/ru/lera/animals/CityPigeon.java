package ru.lera.animals;

public class CityPigeon extends Pigeon {
    public CityPigeon(String name) {
        super(name);
    }

    public void setName(String name) {
        this.setNameInner(name);
    }
}
