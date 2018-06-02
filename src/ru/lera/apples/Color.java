package ru.lera.apples;

import ru.lera.practice.Food;

public enum Color {
  RED, GREEN, BLUE;

  static {
    Food.Dog dog = new Food.Dog("Барборс");
  }
}
