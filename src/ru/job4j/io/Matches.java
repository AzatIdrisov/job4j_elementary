package ru.job4j.io;

import java.util.Scanner;

public class Matches {

    public static void main(String[] args) {
        int matches = 11;
        Scanner input = new Scanner(System.in);
        System.out.println("Количество спичек : " + matches);
        boolean player = true;
        while (matches > 0) {
            System.out.println(String.format("Ходит %s игрок. Тяните спички", player ? "первый" : "второй"));
            matches -= Integer.valueOf(input.nextLine());
            if (matches <= 0 && player) {
                System.out.println("Первый игрок выйграл!");
                break;
            }
            if (matches <= 0 && !player) {
                System.out.println("Второй игрок выйграл!");
                break;
            }
            System.out.println("Спичек осталось : " + matches);
            player = !player;
        }
        System.out.println("Игра окончена!");
    }

}
