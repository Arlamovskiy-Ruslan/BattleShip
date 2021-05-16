
import models.PlayersO;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        PlayersO players = new PlayersO();

        players.outputPlayersName(scanner);

    }
}
