package ru.lera.battles;

import ru.lera.api.BattleShip;

public class SuperShip implements BattleShip {

  @Override
  public void swim(int x, int y) {
    String format = String.format("Корабль плывет в точку (%s, %s)", x, y);
    System.out.println(format);
  }
}
