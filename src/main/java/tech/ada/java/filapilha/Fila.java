package tech.ada.java.filapilha;

import tech.ada.java.linkedlist.ListaLigada;
import tech.ada.java.linkedlist.No;

public class Fila<T extends Comparable> {

    private ListaLigada<T> lista;

    public Fila(){
        this.lista = new ListaLigada<>();
    }

    public void inserir(T dado){
        lista.adicionar(dado);
    }

    public T remover(){
        T primeiroElemento = lista.getInicio();

        if(primeiroElemento != null) {
            return this.lista.remover(primeiroElemento);
        }
        return null;
    }

    public void visualizar(){
        this.lista.display();
    }

}
