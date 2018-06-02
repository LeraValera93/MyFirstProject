package ru.lera;

import java.util.Arrays;
import ru.lera.apples.Apple;
import ru.lera.apples.Color;
import ru.lera.apples.Shape;

public class Metod {

  public static void main(String[] args) {
        /*Объявили переменную "apple1" , которая пренадлежит к классу Apple.
        Затем, указали параметры переменной "apple1" (Color.RED, Shape.SPHERE)
         */
    Apple apple1 = new Apple(Color.RED, Shape.SPHERE);
         /*Объявили переменную "apple2" , которая пренадлежит к классу Apple.
        Затем, указали параметры переменной "apple1" (Color.GREEN, Shape.SPHERE)
         */
    Apple apple2 = new Apple(Color.GREEN, Shape.SPHERE);
    boolean x = compareApples(apple1, apple2); /*объявили переменную типа "x" boolean, которая будет сравнивать
        apple1 & apple2  по текущим параметрам 1)Color; 2) Shape.
        */

    System.out.println(x);//Выводим на экран результат сравнения apple1 & apple2.
    Apple[] apples = new Apple[3]; /* Объявили новый массив класса Apple имя которого apples,
           данный массив вмещает в себя 3 элемента [0], [1], [2].
        */
    apples[0] = apple1;//положили в массив переменную apple1 с ёё параметрами
    apples[1] = apple2;//положили в массив переменную apple2 с ёё параметрами
    System.out.println(Arrays.toString(apples));//Выводим на экран содержимое массива
  }


  private static void appleTest(Apple apple) {
    if (apple.color == Color.BLUE || apple.shape != Shape.SPHERE) {
      System.out.println("Это яблоко - странное!");
    }
    if (apple.color == Color.RED && apple.shape == Shape.SPHERE) {
      System.out.println("Это яблоко не голд!");
    }
    if (apple.color == Color.GREEN && apple.shape == Shape.SPHERE) {
      System.out.println("Это яблоко сорта - голд! ");
    }
  }

  private static boolean compareApples(Apple apple1, Apple apple2) {
    if (apple1.color == apple2.color && apple1.shape == apple2.shape) {
      return true;
    } else {
      return false;
    }
  }

}

//public static void main(String[] args) {
//   int a = 10;//ThreadLocalRandom.current().nextInt(1000); // верхняя гр-ца диап-на чисел
//    System.out.println("a = " + a); // Выводим на экран значение верхней гр-цы диап-на чисел
//   int sum = 1;// сумма чисел от 0 до а
//   int i = 1; // инкремент
//   while (i <= a) { //проверка того, что инкремент не превышает max диапазон (а)
//       sum = sum * i; //сумма всех чисел, которая будет увеличиваться на значение инкремента
//       i = i + 2;
//   }
//    System.out.println("i = " + i);
//    System.out.println("sum = " + sum);
//  }
//   }
