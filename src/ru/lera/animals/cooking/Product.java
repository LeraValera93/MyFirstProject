package ru.lera.animals.cooking;

/**
 * Продукт для приготовления еды
 */
public interface Product {

  /**
   * Проверить срок годности
   * @return true - продукт употребим в пищу, false - продукт просрочен
   */
   boolean check();

}
