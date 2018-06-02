package ru.lera;

import java.util.ArrayList;
import java.util.List;
import ru.lera.apples.Apple;
import ru.lera.apples.Color;
import ru.lera.apples.Shape;


public class X {

  public static void x(String[] args) {
    List<Apple> apples = new ArrayList<>();
    apples.add(new Apple(Color.GREEN, Shape.SPHERE));
    apples.add(new Apple(Color.RED, Shape.SPHERE));
    System.out.println(apples);

    // ?(Утверждение, ЕслиДа, ЕслиНет)
    // Утверждение ? ЕслиДа : ЕслиНет

    apples.forEach(apple -> {//Лямбда
      String textAboutColor =
          apple.color.equals(Color.GREEN) ? "Яблоко зеленое" : "Яблоко не зеленое";
      String text = apple.toString() + ": " + textAboutColor;
      System.out.println(text);
    });

    for (Apple apple : apples) {
      String textAboutColor =
          apple.color.equals(Color.GREEN) ? "Яблоко зеленое" : "Яблоко не зеленое";
      String text = apple.toString() + ": " + textAboutColor;
      System.out.println(text);
    }

    for (int i = 0; i < apples.size(); i++) {
      Apple apple = apples.get(i);
      String textAboutColor =
          apple.color.equals(Color.GREEN) ? "Яблоко зеленое" : "Яблоко не зеленое";
      String text = apple.toString() + ": " + textAboutColor;
      System.out.println(text);
    }
  }
}


