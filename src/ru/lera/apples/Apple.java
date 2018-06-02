package ru.lera.apples;

/**
 * Класс представляющий собой яблоко
 */
public class Apple {
    /** цвет яблока */
    public final Color color;
    /** Форма яблока */
    public final Shape shape;

    /**
     * Конструктор яблока
     * @param color цвет яблока
     * @param shape форма яблока
     */
    public Apple(Color color, Shape shape) {//Это конструктор
        this.color = color;
        this.shape = shape;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "color=" + color +
                ", shape=" + shape +
                '}';
    }
}
