
import models.Players;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        Players players = new Players();

        players.inputPlayersName(scanner);
        players.outputPlayersName();

    }
}
