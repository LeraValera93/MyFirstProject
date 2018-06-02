package ru.lera.battles;

import ru.lera.api.BattleShip;
import ru.lera.api.Plane;

public class SuperPlane implements Plane {

  @Override
  public void takeoff() {
    System.out.println("Самолет взлетел.");
  }

  @Override
  public void fly(int x, int y) {
    String format = String.format("Самолет летит в точку (%s, %s)", x, y);
    System.out.println(format);
  }

  @Override
  public void land() {
    System.out.println("Самолет приземлился.");
  }

  @Override
  public void land(BattleShip ship) {

  }
}
