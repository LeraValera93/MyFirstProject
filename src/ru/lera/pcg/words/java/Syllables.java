package ru.lera.pcg.words.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Syllables {

  private static final List<Character> VOWELS = Arrays.asList(
      'а', 'е', 'ё', 'и', 'о', 'у', 'ы', 'э', 'ю', 'я',
      'А', 'Е', 'Ё', 'И', 'О', 'У', 'Ы', 'Э', 'Ю', 'Я');


  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Введите любое слово: ");
    String word1 = sc.nextLine();
    splitChars(word1);
  }

  private static void splitChars(String word) {
    List<Character> vowel = new ArrayList<>();
    List<Character> consonant = new ArrayList<>();
    int counter = 0;

    for (int i = 0; i < word.length(); i++) {
      char symbol = word.charAt(i);
      boolean isSyllable = VOWELS.contains(symbol);
      if (isSyllable) {
        vowel.add(symbol);
      } else {
        consonant.add(symbol);
        ++counter;
      }
    }
    System.out.print(vowel + " - " + consonant + " Количество согласных букв в слове: " + counter);
  }
}


