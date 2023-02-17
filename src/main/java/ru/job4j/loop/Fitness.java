package ru.job4j.loop;

public class Fitness {
    public static int calc(int ivan, int nik) {
        int month = 0;
        int ivanProgressPerMonth = 3;
        int nikProgressPerMonth = 2;
        while (ivan <= nik) {
            ivan *= ivanProgressPerMonth;
            nik *= nikProgressPerMonth;
            month++;
        }
        return month;
    }
}
