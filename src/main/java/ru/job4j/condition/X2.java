package ru.job4j.condition;

public class X2 {
    public static int calc(int a, int b, int c, int x) {
        return a * x * x + b * x + c;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int c = 0;
        int x = 2;
        int rsl = X2.calc(a, b, c, x);
        System.out.println(rsl);
        System.out.println(calc(1, 1, 0, 1));
        System.out.println(calc(1, 1, 1, 0));
    }
}
