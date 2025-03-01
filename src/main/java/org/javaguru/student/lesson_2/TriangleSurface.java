package org.javaguru.student.lesson_2;
import java.util.Scanner;

public class TriangleSurface
{
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("Введите три стороны трегугольника:");

        double aSide = scanner.nextInt();
        double bSide = scanner.nextInt();
        double cSide = scanner.nextInt();

        double perimetr = aSide + bSide + cSide;
        double halfPerimetr = perimetr / 2;
        double underRootExpression = halfPerimetr * ( halfPerimetr - aSide ) * ( halfPerimetr - bSide ) * ( halfPerimetr - cSide );

        double square = Math.sqrt(underRootExpression);

        System.out.println("Стороны треугольника: А = " + (int)aSide + " B = " + (int)bSide + " C = " + (int)cSide);
        System.out.println("Площадь треугольника: " + square);
    }
}
