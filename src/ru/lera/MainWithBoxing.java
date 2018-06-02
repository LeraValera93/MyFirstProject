package ru.lera;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class MainWithBoxing {

  public static void main(String[] args) {
    int[] a = new int[10];
    for (int i = 0; i < 10; i++) {
      a[i] = ThreadLocalRandom.current().nextInt();
    }

    System.out.println(Arrays.toString(a));

    int[] b = new int[11];
    for (int i = 0; i < a.length; i++) {
      b[i] = a[i];
    }
    b[10] = 30;
    a = b;

    System.out.println(Arrays.toString(a));

    //Коллекции
    List<Integer> list = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
      list.add(ThreadLocalRandom.current().nextInt());
    }
    System.out.println(list);
    list.add(30);
    System.out.println(list);
    list.remove(10);
    System.out.println(list);
  }

  /**
   * Этот метод не делает ничего полезного.
   */
  private static void doSmthing() {

  }
}
