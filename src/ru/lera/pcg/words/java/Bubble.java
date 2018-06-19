package ru.lera.pcg.words.java;

import java.util.Arrays;
import java.util.Scanner;

public class Bubble {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Введите любое слово: ");

    String word = sc.nextLine();

    char[] ch;
    ch = word.toCharArray();

    System.out.println("Содержимое строки до сортировки: " + word);
   // Arrays.sort(ch);

   // String sorted = new String(ch);
    //System.out.println("Содержимое строки после сортировки: " + sorted);

    for (int i = ch.length - 1; i > 0; i--) {
      for (int j = 0; j < i; j++) {

        if (ch[j] > ch[j + 1]) {
          int c = ch[j];
          ch[j] = ch[j + 1];
          ch[j + 1] = (char) c;

        }
      }
    }
    System.out.println(ch);
  }
}

