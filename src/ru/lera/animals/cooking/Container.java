package ru.lera.animals.cooking;

/**
 * Емкость для приготовления пищи
 */
public interface Container {

  /**
   * Добавляет в емкость продукт {@link Product}
   * @param product Добавляемый продукт
   */
  void put(Product product);

  /**
   * Готовит содержимое
   * @return Полученное блюдо
   */
  String cook();
}
