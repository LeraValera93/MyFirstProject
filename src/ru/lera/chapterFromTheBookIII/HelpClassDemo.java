package ru.lera.chapterFromTheBookIII;

public class HelpClassDemo {
  void helpon(int what){
      System.out.println("Справка:");
      System.out.println("1. if");
      System.out.println("2. switch");
      System.out.println("Выберите: ");

      char choise;

      switch (what) {
        case '1':
          System.out.println("Оператор if:\n");
          System.out.println("if (условие) оператор;");
          System.out.println("else оператор;");
          break;
        case '2':
          System.out.println("Оператор switch:\n");
          System.out.println("switch (выражение) {");
          System.out.println(" case константа:");
          System.out.println(" последовательность операторов");
          System.out.println(" break;");
          System.out.println(" //...");
          System.out.println("}");
          break;
        default:
          System.out.print("Запрос не найден.");
      }
    }
  }


