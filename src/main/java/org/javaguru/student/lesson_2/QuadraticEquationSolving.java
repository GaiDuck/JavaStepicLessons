package org.javaguru.student.lesson_2;

import java.util.Scanner;

public class QuadraticEquationSolving
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите коэффициенты квадратного уравнения:");

        double aNumber = scanner.nextDouble();
        double bNumber = scanner.nextDouble();
        double cNumber = scanner.nextDouble();

        System.out.println("Введенное квадратное уравнение:");
        System.out.println(aNumber + "*x^2 + " + bNumber + "*x +" + cNumber);

        double discriminant = Math.pow(bNumber, 2) - (4 * aNumber * cNumber);
        double firstRoot = ((-1 * bNumber) + Math.sqrt(discriminant)) / (2 * aNumber);
        double secondRoot = ((-1 * bNumber) - Math.sqrt(discriminant)) / (2 * aNumber);

        System.out.println("Корни уравнения: " + firstRoot + " и " + secondRoot);
    }
}
