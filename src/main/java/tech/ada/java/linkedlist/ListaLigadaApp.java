package tech.ada.java.linkedlist;

public class ListaLigadaApp {

    public static void main(String... args){
        ListaLigada lista = new ListaLigada();
        lista.adicionar("A");
        lista.adicionar("B");
        lista.adicionar("C");
        lista.adicionar("D");
        lista.adicionar("E");
        lista.adicionar("F");
        lista.display();

        lista.remover("F");
        lista.remover("X");
        lista.display();

    }


}
