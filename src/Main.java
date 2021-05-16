
import io.IPrint;
import io.Print;
import models.Map;
import models.Players;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        IPrint printer = new Print();

        Players players = new Players();
        Map map = new Map(printer);

        players.inputPlayersName(scanner);
        players.outputPlayersName();
        map.map(printer);

    }
}
