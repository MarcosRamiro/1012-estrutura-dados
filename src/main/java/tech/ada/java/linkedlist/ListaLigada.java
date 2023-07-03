package tech.ada.java.linkedlist;

public class ListaLigada<T extends Comparable> {

    private No inicio;
    private No ultimo;

    public ListaLigada(){
        this.inicio = null;
        this.ultimo = null;
    }

    public void adicionar(T dado){

        No<T> novoNo = new No(dado);

        if(this.inicio == null){
            this.inicio = novoNo;
            this.ultimo = novoNo;
        } else {
            No ultimoElemento = this.ultimo;
            ultimoElemento.setProximo(novoNo);
            this.ultimo = novoNo;
        }
    }

    public T remover(T dado){

        if(this.inicio == null)
            return null;

        if(this.inicio.getDado().compareTo(dado) == 0){
            No inicioAnterior = this.inicio;
            this.inicio = this.inicio.getProximo();
            inicioAnterior.setProximo(null);
            inicioAnterior.setDado(null);
            return dado;
        }

        No elementoAnterior = this.inicio;
        No elementoAtual = this.inicio.getProximo();

        while (elementoAtual != null){

            if (elementoAtual.getDado().compareTo(dado) == 0){
                elementoAnterior.setProximo(elementoAtual.getProximo());
                elementoAtual.setProximo(null);
                elementoAtual.setDado(null);
                return dado;
            }

            elementoAnterior = elementoAtual;
            elementoAtual = elementoAtual.getProximo();
        }

        return null;

    }

    public void display(){
        System.out.println("[");

        No elementoAtual = this.inicio;

        while (elementoAtual != null){
            System.out.println("\t" + elementoAtual.getDado() + " ");
            elementoAtual = elementoAtual.getProximo();
        }
        System.out.println("]");

    }
}
