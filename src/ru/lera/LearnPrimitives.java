package ru.lera;

public class LearnPrimitives {
    static {
        //Примитивы
        //  Числа
        //      Целые
        //<тип переменной> <имя переменной> <оператор присваивания> <значение>
        byte                amountByte      =                       -3; // От -128 до +127; 2^8 = 1 байт
        short amountShort = 1; // От -32768 до 32767; 2^16 = 2 байта
        int amountInt = 3; // 2^32 = 4 байта
        long amountLong; // 2^64 = 8 байт

        amountLong = amountInt; // Расширение
        amountInt = (int) amountLong; // Сужение типа, требуется указать преобразование - cast

        //      С плавающей точкой (вещественные)
        float amountFloat = 1.3f;
        double amountDouble = 1.33242342344;
        amountLong = (long) amountFloat;
        amountDouble = amountInt;

        amountDouble = amountFloat; // Расширение
        amountFloat = (float) amountDouble; // Сужение, cast

        //  Символы
        char symbol = 'f'; // 2 байта, от 0 до 2 байт
        amountInt = symbol;
        amountShort = (short) symbol;
        symbol = (char) amountLong;
        symbol = (char) amountByte;

        //  Логический
        boolean value = false;
    }
}
