package ru.lera.pcg.words.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Syllables {

  private static final List<Character> SYLLABLES = Arrays.asList(
      'а', 'е', 'ё', 'и', 'о', 'у', 'ы', 'э', 'ю', 'я',
      'А', 'Е', 'Ё', 'И', 'О', 'У', 'Ы', 'Э', 'Ю', 'Я');


  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Введите любое слово: ");
    String word1 = sc.nextLine();
    showFirstChars(word1);
  }

  private static void showFirstChars(String word) {
    List<Character> vowel = new ArrayList<>();
    List<Character> consonant = new ArrayList<>();

    for (int i = 0; i < word.length(); i++) { //Цикл, для перебора всех символов в слове, от 0 до (размер слова - 1)
      char symbol = word.charAt(i); // Получаем символ по его индексу в цикле
      boolean isSyllable = SYLLABLES.contains(symbol); //Проверяем полученный в этой итерации цикла на его наличие в списке гласных букв
        if (isSyllable) { //Если символ был гласный
        vowel.add(symbol); //Тогда кладем символ в List<Character> vowel
        }else consonant.add(symbol); // Если нет, тогда в List<Character> consonant
      }
      System.out.print(vowel + " "); //Выводим гласные
      System.out.print("- " + consonant); //Выводим согласные
    }
}


