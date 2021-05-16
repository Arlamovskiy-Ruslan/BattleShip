package models;

import java.util.Scanner;

public class PlayersO {
    String playerName1;
    String playerName2;

    public void outputPlayersName(Scanner scanner){
        System.out.println("Player#1, please enter your name:");
        playerName1 = scanner.nextLine();
        System.out.println("Player#2, please enter your name:");
        playerName2 = scanner.nextLine();
    }
}
