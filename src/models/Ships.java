package models;

import io.IPrint;

import java.util.Scanner;

public class Ships {

    public void placeShips(Scanner scanner, IPrint printer){
        printer.print("Please enter OX coordinate:");
        int x = scanner.nextInt();
        printer.print("Please enter OY coordinate:");
        int y = scanner.nextInt();

        printer.print("Choose direction:");
        printer.print("1. Vertical:");
        printer.print("2. Horizontal:");
        int rotation = scanner.nextInt();
    }
}
