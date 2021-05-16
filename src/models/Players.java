package models;

import java.util.Scanner;

public class Players {
    String playerName1;
    String playerName2;
    String hack = "\n\n";

    public void inputPlayersName(Scanner scanner){
        System.out.println("Player#1, please enter your name:");
        playerName1 = scanner.nextLine();
        System.out.println("Player#2, please enter your name:");
        playerName2 = scanner.nextLine();
    }

    public void outputPlayersName(){

        System.out.println(hack + "Player#1 name :" + playerName1);
        System.out.println(hack + "Player#2 name :" + playerName2);
    }
}
