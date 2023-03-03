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
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);
        in = 180;
        expected = 3;
        out = Converter.rubleToDollar(in);
        passed = expected == out;
        System.out.println("180 rubles are 3. Test result : " + passed);
    }
}
