package org.javaguru.student.lesson_2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ArithmeticMean
{
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        int numbersCount = 3;
        int summ = 0;

        System.out.println("Введите " + numbersCount + " числа:");

        for (int i = 0; i < numbersCount; i++)
        {
            summ += scanner.nextInt();
        }

        System.out.println((double)summ / numbersCount);
    }
}
