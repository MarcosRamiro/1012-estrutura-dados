package tech.ada.java.map;

import tech.ada.java.linkedlist.ListaLigada;

import java.util.Iterator;

public class Mapa<K, V> {

    private int tamanho;

    private ListaLigada<NoMap<K,V>>[] tabela;

    public Mapa(){
        this.tamanho = 1_000;
        this.tabela = new ListaLigada[tamanho];
        for (int i = 0; i < tamanho; i++) {
            this.tabela[i] = new ListaLigada<>();
        }
    }

    public void add(K chave, V valor){
        int indice = calcularIndice(chave);
        inserirValor(indice, new NoMap<>(chave, valor));
    }

    private void inserirValor(int indice, NoMap<K,V> novoChaveValor) {

        ListaLigada lista = tabela[indice];

        if(lista.isListaVazia()){
            lista.adicionar(novoChaveValor);
        } else {

            boolean encontrouNaLista = false;

            for (Iterator iter = lista.iterator(); iter.hasNext();){
                NoMap<K,V> valorAtual = (NoMap<K, V>) iter.next();
                if(valorAtual.equals(novoChaveValor)){
                    lista.remover(valorAtual);
                    lista.adicionar(novoChaveValor);
                    encontrouNaLista = true;
                }
            }
            if(!encontrouNaLista){
                lista.adicionar(novoChaveValor);
            }
        }

    }

    private int calcularIndice(K chave) {
        int hashCode = chave.hashCode();
        int indice = Math.abs(hashCode % this.tamanho);
        return indice;
    }

    public V get(K chave){
        int indice = calcularIndice(chave);
        ListaLigada lista = tabela[indice];

        for (Iterator iter = lista.iterator(); iter.hasNext();){
            NoMap<K,V> valorAtual = (NoMap<K, V>) iter.next();
            if(valorAtual.getChave().equals(chave))
                return valorAtual.getValor();
        }
        return null;

    }

}
