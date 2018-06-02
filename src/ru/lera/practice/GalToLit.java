package ru.lera.practice;

public class GalToLit {
    public static void main(String args[]){
        double gallons; /* в этой переменной хранится значение,
                        выражающее объём житкости в галлонах*/
        double liters; /* в этой переменной хранится значение,
                       выражающее объем жидкости в литрах*/
        gallons = 10;
        liters = gallons * 3.7854; // перевести в литры
        System.out.println(gallons+ " галлонам соответствует " + liters + " литров");

        if (10<15) System.out.println("10 меньше 15");

        /* Упражнение к главе учебника #1*/
        double mass = 54.5;
        double graviteTheMoon = 0.17;
        double whaitOnTheMon = mass * graviteTheMoon;
        System.out.println(whaitOnTheMon);
    }
}
