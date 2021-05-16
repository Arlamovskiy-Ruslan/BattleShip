package models;

import io.IPrint;

public class Map {

    IPrint print;

    public Map(IPrint print) {
        this.print = print;
    }

    public void map(IPrint printer){
        printer.print("  0 1 2 3 4 5 6 7 8 9");
        printer.print("0 - - - - - - - - - -");
        printer.print("1 - - - - - - - - - -");
        printer.print("2 - - - - - - - - - -");
        printer.print("3 - - - - - - - - - -");
        printer.print("4 - - - - - - - - - -");
        printer.print("5 - - - - - - - - - -");
        printer.print("6 - - - - - - - - - -");
        printer.print("7 - - - - - - - - - -");
        printer.print("8 - - - - - - - - - -");
        printer.print("9 - - - - - - - - - -");

    }
}
