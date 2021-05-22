import models.Players;
import models.Ships;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        Players players = new Players();
        Ships ships = new Ships();

        players.inputPlayersName(scanner);
        players.outputPlayersName();

        ships.placeShips(scanner);

    }
}
