package org.javaguru.student.lesson_2;

import java.util.Scanner;

public class Greetings
{
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("Введите имя пользователя:");
        String userName = scanner.nextLine();
        System.out.println("Добрый день, " + userName + "!");
    }
}
