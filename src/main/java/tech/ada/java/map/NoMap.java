package tech.ada.java.map;

public class NoMap<K, V> {
    private K chave;
    private V valor;

    public NoMap(K chave, V valor){
        this.chave = chave;
        this.valor = valor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NoMap<?, ?> noMap = (NoMap<?, ?>) o;

        return chave.equals(noMap.chave);
    }

    @Override
    public int hashCode() {
        return chave.hashCode();
    }

    public K getChave() {
        return chave;
    }

    public V getValor() {
        return valor;
    }
}
