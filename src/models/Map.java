package models;

import io.IPrint;

public class Map {

    IPrint print;

    public Map(IPrint print) {
        this.print = print;
    }

    public void map(IPrint printer){
        printer.print("  0 1 2 3 4 5 6 7 8 9");
        for (int counter = 0; counter < 10; counter++)
        printer.print(counter + " - - - - - - - - - -");
    }
}
