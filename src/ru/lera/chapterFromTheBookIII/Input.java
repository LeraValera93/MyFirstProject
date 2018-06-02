package ru.lera.chapterFromTheBookIII;

// Игра в угадывание букв
public class Input {
  public static void main(String args [])
  throws java.io.IOException{

    char ch, answer = 'S';

    System.out.println("Задумана буква из диапазона A-Z");
    System.out.print("Попытайтесь её угадать: ");

    ch = (char) System.in.read(); // получить символ с клавиатуры

    if (ch == answer) System.out.println("** Правильно!**");
    else {
      System.out.print("...Извините, нужная буква находится ");

      // вложенный оператор if
      if (ch < answer)
        System.out.println("ближе к концу алфавита");
      else System.out.println("ближе к началу алфавита");
    }
  }
}

