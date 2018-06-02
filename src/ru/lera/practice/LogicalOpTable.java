package ru.lera.practice;

// Упражнение 2.2
// Отображение таблицы истинности для логической операций
public class LogicalOpTable {
  public static void main (String args[]) {
    boolean p;
    boolean q;

    System.out.println(
        " P " + "\t" + "   Q  " + "\t" + " AND " + "\t" + " OR " + "\t" + " XOR  " + "\t"
            + "NOT  ");

    p = true;
    q = true;

    System.out.print(p + "\t" + q + "\t");
    System.out.print((p & q) + "\t" + (p | q) + "\t");
    System.out.println((p ^ q) + "\t" + (!p));

    p = true;
    q = false;

    System.out.print(p + "\t" + q + "\t");
    System.out.print((p & q) + "\t" + (p | q) + "\t");
    System.out.println((p ^ q) + "\t" + (!p));

    p = false;
    q = true;
    System.out.print(p + "\t" + q + "\t");
    System.out.print((p & q) + "\t" + (p | q) + "\t");
    System.out.print((p ^ q) + "\t" + (!p));

    //System.out.printf();
    //String.format();
    boolean i, y;
    StringBuilder format = new StringBuilder();
    for (int j = 0; j < 6; j++) {
      format.append("| %-4s");
    }
    System.out.printf("\n" + format + "\n", "P", "Q", "AND", "OR", "XOR", "NOT");

    i = true;
    y = false;
    System.out.printf(format.toString(), boolAsInt(i), boolAsInt(y), boolAsInt(i & y),
                                         boolAsInt(i | y), boolAsInt(i ^ y), boolAsInt(!i));
  }

  private static String boolAsInt(boolean b) {
    return b ? "1" : "0";
  }
}

