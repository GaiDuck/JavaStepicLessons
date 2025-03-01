package org.javaguru.student.lesson_2;

public class Calculations
{
    public static void main(String[] agrs)
    {
        var firstNumber = 10;
        var secondNumber = 15;

        int sum = Sum(firstNumber, secondNumber);
        System.out.println(firstNumber + "+" + secondNumber + "=" + sum);
    }

    static int Sum(int firstNumber, int secondNumber)
    {
        return firstNumber + secondNumber;
    }
}