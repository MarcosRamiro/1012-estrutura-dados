package tech.ada.java.linkedlist;

public class ListaLigadaApp {

    public static void main(String... args){
        ListaLigada lista = new ListaLigada();
        lista.add("A");
        lista.add("B");
        lista.add("C");
        lista.add("D");
        lista.add("E");
        lista.add("F");
        lista.display();

        lista.remover("F");
        lista.remover("X");
        lista.display();

    }


}
