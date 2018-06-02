package ru.lera.animals;

public class Animal extends Creature {

  public Animal(String name) {
    super(name);
  }

  @Override
  public void move(int x, int y, int z) {
    if (z > 0) {
      System.out.println("Животные не умеют летать");
    } else {
      super.move(x, y, z);
    }
  }
}
