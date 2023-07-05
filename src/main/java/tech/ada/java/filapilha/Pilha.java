package tech.ada.java.filapilha;

import tech.ada.java.linkedlist.ListaLigada;

public class Pilha<T extends Comparable> {

    private ListaLigada<T> lista;

    public Pilha(){
        this.lista = new ListaLigada<>();
    }

    public boolean inserir(T dado){
        lista.adicionarNoComeco(dado);
        return true;
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
