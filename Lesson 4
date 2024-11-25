package Lesson4;

import java.util.Arrays;

public class Lesson4 {

    /*
     * Создайте метод printThreeWords(),
     * который при вызове должен отпечатать в столбец три слова: Orange, Banana, Apple.
     */

    public static void printThreeWords() {
        System.out.println("Orange\nBanana\nApple");
    }

    /*
     * Создайте метод checkSumSign(), в теле которого объявите две int переменные a и b,
     * и инициализируйте их любыми значениями, которыми захотите.
     * Далее метод должен просуммировать эти переменные, и если их сумма больше или равна 0,
     * то вывести в консоль сообщение “Сумма положительная”, в противном случае - “Сумма отрицательная”;
     */

    public static void checkSumSign() {
        int a = -11;
        int b = 5;

        if ((a + b) >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    /*
     * Создайте метод printColor() в теле которого задайте int переменную value и инициализируйте ее любым значением.
     * Если value меньше 0 (0 включительно), то в консоль метод должен вывести сообщение “Красный”,
     * если лежит в пределах от 0 (0 исключительно) до 100 (100 включительно), то “Желтый”,
     * если больше 100 (100 исключительно) - “Зеленый”;
     */

    public static void printColor() {
        int value = 150;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 100) {
            System.out.println("̆Зеленый");
        } else {
            System.out.println("Желтыи");
        }
    }

    /*
     * Создайте метод compareNumbers(), в теле которого объявите две int переменные a и b,
     * и инициализируйте их любыми значениями, которыми захотите. Если a больше или равно b,
     * то необходимо вывести в консоль сообщение “a >= b”, в противном случае “a < b”;
     */

    public static void compareNumbers() {
        int a = 5;
        int b = 11;

        if (a >= b) {
            System.out.println(a + " >= " + b);
        } else {
            System.out.println(a + " < " + b);
        }

    }

    /*
     * Напишите метод, принимающий на вход два целых числа и проверяющий,
     * что их сумма лежит в пределах от 10 до 20 (включительно),
     * если да – вернуть true, в противном случае – false.
     */

    public static void check() {
        int a = 6;
        int b = 32;
        int c = a + b;

        if ((c >= 10) && (c <= 20)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    /*
     * Напишите метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
     *  положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
     */

    public static void checkNumber(int number) {

        if (number >= 0) {
            System.out.println(number + " - число положительное");
        } else {
            System.out.println(number + " - число отрицательное");
        }
    }


    /*
     * Напишите метод, которому в качестве параметра передается целое число.
     * Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
     * Замечание: ноль считаем положительным числом.
     */

    public static void checkNumber2(int number) {

        if (number >= 0) {
            System.out.println("false");
        } else System.out.println("true");
    }

    /*
     * Напишите метод, которому в качестве аргументов передается строка и число,
     * метод должен отпечатать в консоль указанную строку, указанное количество раз;
     */

    public static void task8(int number, String word) {
        for (int i = 1; i <= number; i++) {
            System.out.println(word);
        }
    }

    /*
     * Напишите метод, который определяет, является ли год високосным,
     * и возвращает boolean (високосный - true, не високосный - false).
     * Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
     */

    public static void yearCheck(int year) {

        if (!(year % 4 == 0) || ((year % 100 == 0) && !(year % 400 == 0))) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    /*
     *  Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
     *  С помощью цикла и условия заменить 0 на 1, 1 на 0;
     */

    public static void invert() {
        int[] arr = {0, 1, 0, 1, 1, 0, 1, 0, 0,};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    /*
     * Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 ... 100;
     */

    public static void fillArrey() {
        int[] arr = new int[100];
        for (int i = 0; i < 100; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
    }

    /*
     * Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
     * пройти по нему циклом, и числа меньшие 6 умножить на 2;
     */

    public static void task12() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    /*
     * Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
     * и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей,
     * если обе сложно). Определить элементы одной из диагоналей можно по следующему принципу:
     * индексы таких элементов равны, то есть [0][0], [1][1], [2][2], ..., [n][n];
     */

    public static void task13(int size, int value) {

        int[][] matrix = new int[size][size];

        for (int i = 0; i < size; i++) {

            matrix[i][i] = value;

            matrix[i][i] = value;

            System.out.println(Arrays.toString(matrix[i]));
        }
    }


    /*
     *  Написать метод, принимающий на вход два аргумента:
     *  len и initialValue, и возвращающий одномерный массив типа int длиной len,
     *  каждая ячейка которого равна initialValue.
     */

    public static int[] task14(int len, int initialValue) {
        int[] matrix = new int[len];
        for (int i = 0; i < len; i++) {
            matrix[i] = initialValue;
        }
        return matrix;
    }
}
