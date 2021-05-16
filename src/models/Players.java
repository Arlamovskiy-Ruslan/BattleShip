package models;

import io.IPrint;

import java.util.Scanner;

public class Players {
    String playerName1;
    String playerName2;
    String gap = "\n\n";

    private IPrint printer;

    public void inputPlayersName(Scanner scanner){
        System.out.println("Player#1, please enter your name:");
        playerName1 = scanner.nextLine();
        System.out.println("Player#2, please enter your name:");
        playerName2 = scanner.nextLine();
    }

    public void outputPlayersName(){

        System.out.println(gap + "Player#1 name :" + playerName1);
        System.out.println(gap + "Player#2 name :" + playerName2 + gap);
    }
    
}
