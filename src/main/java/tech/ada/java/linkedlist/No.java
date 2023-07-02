package tech.ada.java.linkedlist;

public class No {
    private String dado;
    private No proximo;

    public No(String dado){
        this.dado = dado;
        this.proximo = null;
    }

    public String getDado() {
        return dado;
    }

    public void setDado(String dado) {
        this.dado = dado;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }
}
