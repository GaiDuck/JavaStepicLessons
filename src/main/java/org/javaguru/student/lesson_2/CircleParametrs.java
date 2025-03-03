package org.javaguru.student.lesson_2;

import java.util.Scanner;

public class CircleParametrs
{
    static Scanner scanner = new Scanner(System.in);

    static double pi = 3.14;

    public static void main(String[] args)
    {
        System.out.println("Введите радиус круга: ");
        double radius = scanner.nextDouble();
        System.out.println("Периметр круга: " + CirclePerimetrCalculate(radius));
        System.out.println("Площадь круга: " + CircleSquareCalculate(radius));
    }

    protected static double CirclePerimetrCalculate(double radius)
    {
        double perimetr = 2 * pi * radius;
        return perimetr;
    }
    protected static double CircleSquareCalculate(double radius)
    {
        double square = pi * Math.pow(radius, 2);
        return square;
    }
}
