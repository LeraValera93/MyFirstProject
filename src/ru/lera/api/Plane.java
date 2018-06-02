package ru.lera.api;

public interface Plane {
  void takeoff();
  void fly(int x, int y);
  void land();
  void land(BattleShip ship);
}
