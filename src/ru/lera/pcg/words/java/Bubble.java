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
    Arrays.sort(ch);

    String sorted = new String(ch);
    System.out.println("Содержимое строки после сортировки: " + sorted);
  }
}


