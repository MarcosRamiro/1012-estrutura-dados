package tech.ada.java.array;

import java.util.Scanner;

public class EntradaDeDados implements AutoCloseable {

    private Scanner scanner;

    public EntradaDeDados(){
        scanner = new Scanner(System.in);
    }

    public String obterEntrada(){
        return scanner.nextLine();
    }

    @Override
    public void close() {
        scanner.close();
    }
}
