package org.javaguru.student.lesson_2;

import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.Scanner;

public class MultiplicationTable
{
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("Введите целое число:");
        int number = scanner.nextInt();

        for(int i = 0; i <= 10; i++)
        {
            System.out.println(number + " * " + i + " = " + Multiplication(number, i));
        }
    }

    static int Multiplication(int firstNumber, int secondNumber)
    {
        return firstNumber * secondNumber;
    }
}
