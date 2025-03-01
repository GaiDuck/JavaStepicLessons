package org.javaguru.student.lesson_2;

public class Calculations
{
    public static void main(String[] agrs)
    {
        var firstNumber = 10;
        var secondNumber = 15;

        System.out.println(Sum(firstNumber, secondNumber));
        System.out.println(Sub(firstNumber, secondNumber));
        System.out.println(Mult(firstNumber, secondNumber));
        System.out.println(Div(firstNumber, secondNumber));
    }

    static int Sum(int firstNumber, int secondNumber)
    {
        return firstNumber + secondNumber;
    }

    static int Sub(int firstNumber, int secondNumber)
    {
        return firstNumber - secondNumber;
    }

    static int Mult(int firstNumber, int secondNumber)
    {
        return firstNumber * secondNumber;
    }

    static double Div(int firstNumber, int secondNumber)
    {
        return (double) firstNumber / secondNumber;
    }
}