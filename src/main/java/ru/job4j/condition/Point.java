package ru.job4j.condition;
import java.util.Scanner;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return rsl;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        double result = Point.distance(x1, y1, x2, y2);
        System.out.println("result (" + x1 + "," + x2 + ") to (" + y1 + "," + y2 + ") " + result);
    }
}
