package ru.lera;

import ru.lera.animals.Animal;
import ru.lera.animals.CityPigeon;
import ru.lera.animals.Creature;
import ru.lera.animals.WildPigeon;

public class Main {

  public static void main(String[] args) {
    //Object -> Fruit -> Apple -> AppleGold
    //                         -> AppleRanetka
    //                -> Orange
    //                -> Banana
    // WildPigeon wildPigeon = new WildPigeon("Синий с белым");
    // wildPigeon.move(1, 2, 3);

    // Animal animal = new Animal("Рычащий большой");
    // animal.move(1, 2, 10);

    // Creature creature = new CityPigeon("Серое с клювом");
    // veterinar(creature);
    // System.out.println(creature.getName());

    // private static void veterinar(Creature creature) {
    //.....
    //  creature.setName(creature.getName() + " и ворует печеньки");
    // }



   /* // от меньшего к большему
    byte q = (byte) 1000;
    System.out.println(q);
    short w = q;
    System.out.println(w);
    int e = w;
    System.out.println(e);
    long r = e;
    System.out.println(r);

    // от больлего к меньшему
    long l = 1000;
    System.out.println(l);
    int i = (int) l;
    System.out.println(i);
    short s = (short) i;
    System.out.println(s);
    byte b = (byte) s;
    System.out.println(b);

    int d = 2_147_483_647;
        d = 2_147_483_647 + 1;
    System.out.print(d);
    */

    for (int x = 4; x <= 200; x += 2){
      double b =  2.5;
      int c = (int) (x / b);
      double d = (x % b);
        if (x % b == 0)
          System.out.println("Число разделилось без остатка. Результат :" + c);
        else {
          System.out.println("Число разделилось с остатком : " + d);
      }
    }
  }
}
