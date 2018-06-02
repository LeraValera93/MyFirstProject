package ru.lera.animals;

public class Creature {
    private String name;

    public Creature(String name) {

        this.name = name;
    }

    public void move(int x, int y, int z) {
        String format = "(%s) переместился на (%s,%s,%s)";
        String text = String.format(format, name, x, y, z);
        System.out.println(text);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("Извините, но менять имя извне - нельзя");
    }

    protected void setNameInner(String name) {
        this.name = name;
    }
}
