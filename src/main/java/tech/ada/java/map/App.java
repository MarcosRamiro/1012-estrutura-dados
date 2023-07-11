package tech.ada.java.map;

import tech.ada.java.Funcionario;
import tech.ada.java.linkedlist.ListaIterator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {

    public static void main(String[] args) {

        Mapa<Integer, Funcionario> mapa = new Mapa<>();
        Map<Integer, Funcionario> mapaDoJava = new HashMap<>();
        List<Funcionario> lista = new ArrayList<>();

        for (int i = 1; i <= 500_000; i++){
            Funcionario f1 = new Funcionario(i, "Maria", "Pessoas", 2323.56);
            lista.add(f1);
            mapa.add(i, f1);
            mapaDoJava.put(i, f1);
        }

        System.out.println(mapa.get(1_500));
        System.out.println(mapaDoJava.get(1_500));

//        Funcionario funcionario1 = new Funcionario(1, "Maria", "Vendas", 2323.00);
//        Funcionario funcionario2 = new Funcionario(1, "Maria", "TI", 23230.00);
//        System.out.println(funcionario1.hashCode());
//        System.out.println(funcionario2.hashCode());
//        System.out.println(funcionario1.equals(funcionario2));


    }
}
