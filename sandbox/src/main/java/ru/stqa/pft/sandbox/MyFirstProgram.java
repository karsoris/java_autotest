package ru.stqa.pft.sandbox;

public class MyFirstProgram {
    public static void main(String[] args) {
        hello();
        Point p1 = new Point();
        p1.x = 5;
        p1.y = 4;
        Point p2 = new Point();
        p2.x = 5;
        p2.y = 0;
        System.out.println("Расстояние между точками p1 и p2 равно " + distance(p1, p2));
    }
    public static void hello() {
        System.out.println("Hello, World!");
    }
    public static double distance(Point p1, Point p2) {
        return Math.sqrt((p2.x - p1.x) * (p2.x - p1.x) + (p2.y - p1.y) * (p2.y - p1.y));

    }

}
