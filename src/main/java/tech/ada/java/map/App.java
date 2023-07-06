package tech.ada.java.map;

import tech.ada.java.Funcionario;
import tech.ada.java.linkedlist.ListaIterator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {

    public static void main(String[] args) {

        //Mapa<Integer, Funcionario> mapa = new Mapa<>();

        Map<Integer, Funcionario> mapa = new HashMap<>();
        Map<String, Funcionario> mapaNomne = new HashMap<>();

        List<Funcionario> lista = new ArrayList<>();

        for (int i = 1; i <= 50; i++){
            Funcionario f1 = new Funcionario(i, "Maria", "Pessoas", 2323.56);
            lista.add(f1);
            mapa.put(i, f1);
//            mapa.put(i+1, new Funcionario(i + 1, "João", "Tecnologia", 1500.00));
//            mapa.put(i+2, new Funcionario(i + 2, "Marcelo", "Operação", 1780.50));
        }

        System.out.println(mapa.get(5));

//        List<Funcionario> lista = new ArrayList<>();
//
//        for (int i = 1; i <= 10_000_000; i= i+3){
//            lista.add(new Funcionario(i, "Maria", "Pessoas", 2323.56));
//            lista.add(new Funcionario(i + 1, "João", "Tecnologia", 1500.00));
//            lista.add(new Funcionario(i + 2, "Marcelo", "Operação", 1780.50));
//        }
//        System.out.println(lista.size());
//
//        //Funcionario funcionario;
//        int idProcurado = 9_568_896;
//
//        for(Funcionario func : lista){
//            if(func.id().equals(idProcurado)){
//                System.out.println(func);
//                break;
//            }
//        }
//
//        idProcurado = 9_968_896;
//
//        for(Funcionario func : lista){
//            if(func.id().equals(idProcurado)){
//                System.out.println(func);
//                break;
//            }
//        }























//        Mapa<Integer, Funcionario> mapa = new Mapa<>();
//
//        for (int i = 1; i <= 11 * 1000; i= i+11) {
//            mapa.put(i, new Funcionario(i, "Maria", "Pessoas", 2323.56));
//            mapa.put(i+1, new Funcionario(i+1, "João", "Tecnologia", 1500.00));
//            mapa.put(i+2,new Funcionario(i+2, "Marcelo", "Operação", 1780.50));
//            mapa.put(i+3, new Funcionario(i+3, "Marcelo", "Tecnologia", 1780.50));
//            mapa.put(i+4, new Funcionario(i+4, "Maria", "Pessoas", 2323.56));
//            mapa.put(i+5, new Funcionario(i+5, "Marcos", "Pessoas", 2323.56));
//            mapa.put(i+6, new Funcionario(i+6, "Matheus", "Pessoas", 2323.56));
//            mapa.put(i+7, new Funcionario(i+7, "Vinicius", "Pessoas", 2323.56));
//            mapa.put(i+8, new Funcionario(i+8, "Gustavo", "Pessoas", 2323.56));
//            mapa.put(i+9, new Funcionario(i+9, "Rebeca", "Pessoas", 2323.56));
//            mapa.put(i+10, new Funcionario(i+10, "Juliana", "Pessoas", 2323.56));
//        }
//
//        System.out.println(mapa.get(1));
//        System.out.println(mapa.get(2));
//        System.out.println(mapa.get(3));
//        System.out.println(mapa.get(4));
//        System.out.println(mapa.get(5));
//        System.out.println(mapa.get(6));
//        System.out.println(mapa.get(7));
//        System.out.println(mapa.get(8));
//        System.out.println(mapa.get(9));
//        System.out.println(mapa.get(10));
//        System.out.println(mapa.get(11));
//        System.out.println(mapa.get(5000));

    }
}
