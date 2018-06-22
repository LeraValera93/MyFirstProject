package ru.lera.pcg.words.java;

import java.util.Scanner;

public class Bubble {

  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Введите любое слово: ");

    String word = sc.nextLine();
    System.out.println("Содержимое строки до сортировки: " + word);

    System.out.println("Cортировка строки по возрастанию: " + function_increase(word));
    System.out.println("Cортировка строки по убыванию: " +function1_decrease(word));
}


  private static String function_increase(String word) {
    char[] ch1;
    ch1 = word.toCharArray();

    for (int i = ch1.length - 1; i > 0; i--) {
      for (int j = 0; j < i; j++) {

        if (ch1[j] > ch1[j + 1]) {
          int c = ch1[j];
          ch1[j] = ch1[j + 1];
          ch1[j + 1] = (char) c;
        }
      }
    }
    String word1 = new String(ch1);
    return word1;
  }

  private static String function1_decrease(String word) {
    char[] ch2;
    ch2 = word.toCharArray();
    for (int y = ch2.length - 1; y > 0; y--) {
      for (int z = 0; z < y; z++) {

        if (ch2[z] < ch2[z + 1]) {
          int c = ch2[z];
          ch2[z] = ch2[z + 1];
          ch2[z + 1] = (char) c;

        }
      }
    }
    String word2 = new String(ch2);
    return word2;
  }
}


