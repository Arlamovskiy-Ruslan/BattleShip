package models;

import io.IPrint;

import java.util.Scanner;

public class Ships extends Players {

    static int[][] battlefield1 = new int[10][10];
    static int[][] battlefield2 = new int[10][10];

    public void chooseCoordinate(Scanner scanner, IPrint printer) {

        int deck = 4;
        int deckCounter = deck;

        while (deck >= 1) {

            System.out.println(playerName1 + ", please place your " + deck + "-deck ship on the battlefield.");

            printer.print("Please enter OX coordinate:");
            int x = scanner.nextInt();
            printer.print("Please enter OY coordinate:");
            int y = scanner.nextInt();

            printer.print("Choose direction:");
            printer.print("1. Vertical:");
            printer.print("2. Horizontal:");
            int direction = scanner.nextInt();

            for (int i = 0; i < deck; i++) {
                if (direction == 1) {
                    battlefield1[x][y + i] = 1;
                } else {
                    battlefield1[x + i][y] = 1;
                }
            }

            deck--;

        }

    }

    public void placeShips() {
        for (int i = 0; i < battlefield1.length; i++) {
            for (int j = 0; j < battlefield1.length; i++) {
                int a = battlefield1[i][j];
            }
        }
    }

}
