package models;

import java.util.Scanner;

public class Ships extends Players {

    static int[][] battlefield1 = new int[10][10];
    static int[][] battlefield2 = new int[10][10];

    public void placeShips(Scanner scanner) {

        int deck = 4;
        int deckCounter = deck;

        while (deck >= 1) {

            System.out.println(playerName1 + ", please place your " + deck + "-deck ship on the battlefield.");

            drawField(battlefield1);

            System.out.println("Please enter OX coordinate:");
            int x = scanner.nextInt();
            System.out.println("Please enter OY coordinate:");
            int y = scanner.nextInt();

            System.out.println("Choose direction:");
            System.out.println("1. Vertical:");
            System.out.println("2. Horizontal:");
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

    public void drawField(int[][] battlefield) {
        System.out.println("  0 1 2 3 4 5 6 7 8 9");
        for (int i = 0; i < battlefield.length; i++) {

            System.out.print(i + " ");

            for (int j = 0; j < battlefield[1].length; j++) {
                if (battlefield[i][j] == 0) {
                    System.out.print("- ");
                } else {
                    System.out.print("X ");
                }

            }
            System.out.println(i + " - - - - - - - - - -");
        }
    }
}
