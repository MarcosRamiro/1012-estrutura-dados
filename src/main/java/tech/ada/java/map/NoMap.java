package tech.ada.java.map;

public class NoMap<K, V> {
    private K chave;
    private V valor;

    public NoMap(K chave, V valor){
        this.chave = chave;
        this.valor = valor;
    }

    public K getChave() {
        return chave;
    }

    public V getValor() {
        return valor;
    }
}
