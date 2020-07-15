package ru.job4j.io;

import java.util.Scanner;

public class Matches {

    public static void main(String[] args) {
        int matches = 11;
        Scanner input = new Scanner(System.in);
        System.out.println("Количество : " + matches);
        while (matches > 0) {
            System.out.println("Ходит первый игрок. Тяните спички");
            matches -= Integer.valueOf(input.nextLine());
            if (matches <= 0) {
                System.out.println("Первый игрок выйграл!");
                break;
            }
            System.out.println("Спичек осталось : " + matches);
            System.out.println("Ходит второй игрок. Тяните спички");
            matches -= Integer.valueOf(input.nextLine());
            if (matches <= 0) {
                System.out.println("Второй игрок выйграл!");
                break;
            }
            System.out.println("Спичек осталось : " + matches);
        }
        System.out.println("Игра окончена!");
    }

}
