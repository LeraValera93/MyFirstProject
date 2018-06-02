package ru.lera.practice;

public class Food {

  public static void main(String[] args) {
    String name = "Шарик";
    Object obj = new Dog(name);
  }

  public static class Dog {

    public Dog(String name) {
    }
  }
}

