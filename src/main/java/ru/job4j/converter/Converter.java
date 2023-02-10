package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        int rubPerEuro = 70;
        return value / rubPerEuro;
    }

    public static float rubleToDollar(float value) {
        int rubPerDollar = 60;
        return value / rubPerDollar;
    }

    public static void main(String[] args) {
        float euro = rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");

        float dollars = rubleToDollar(300);
        System.out.println("300 rubles are " + dollars + " dollars.");
    }
}
