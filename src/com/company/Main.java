package com.company;

public class Main {

    private static Object String;

    public static void main(String[] args) {
        String weatherInBishkek;
        final int NUM = 26;
        String word = "Градусов на улице";
        weatherInBishkek = (NUM + word);
        System.out.print(NUM + ", ");
        System.out.print(word + ", ");
        System.out.println(weatherInBishkek);

        if (NUM >= 1) {
            System.out.println(" Вы сохранили положительное число");
        } else if (NUM <= -1) {
            System.out.println("Вы сохранили отрицательное число");

        } else if (NUM == 0) {
            System.out.println("Вы сохранили нуль");
        }
    }
}