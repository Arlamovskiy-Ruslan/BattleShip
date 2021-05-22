package io;

public class Print implements IPrint {

    @Override
    public void print(String text) {
        System.out.println(text);
    }
}
