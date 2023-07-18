package tech.ada.java.sort_collections;

import tech.ada.java.Funcionario;

import java.util.*;

public class App {

    public static void main(String[] args) {

        /**
         * Classificar usando Collections
         */

//        List<Integer> numeros = new ArrayList<>();
//
////        for(int i=99; i>=0; i--){
////            numeros.add(i);
////        }
//
//        numeros.add(40);
//        numeros.add(5);
//        numeros.add(21);
//        numeros.add(15);
//        numeros.add(87);
//        numeros.add(152);
//        numeros.add(21);
//        numeros.add(25);
//
////        for(Integer i : numeros){
////            System.out.println(i);
////        }
//
//        Ordenacao<Integer> ordenacao = new Ordenacao<>();
//        List<Integer> NumerosOrdenados = ordenacao.classificar(numeros);
//
//        for(Integer i : NumerosOrdenados){
//            System.out.println(i);
//        }
//
//        Collections.sort(numeros);
//
////        for(Integer i : numeros){
////            System.out.println(i);
////        }
//
//        int indice = Collections.binarySearch(numeros, 87);
//
//        System.out.println(numeros.get(indice));













        /**
         * Classificar com nossa própria classe de ordenação quicksort
         */




        /**
         * Usando o TreeSet para ordenar os elementos
         */


//        List<Integer> numeros = new ArrayList<>();
//        numeros.add(40);
//        numeros.add(5);
//        numeros.add(21);
//        numeros.add(15);
//        numeros.add(87);
//        numeros.add(152);
//        numeros.add(21);
//        numeros.add(25);
//
//        TreeSet<Integer> arvore = new TreeSet<>(numeros);
//        List<Integer> numerosOrdenados = new ArrayList<>(arvore);
//
//        for(Integer numero : numerosOrdenados){
//            System.out.println(numero);
//        }

        Funcionario f1 = new Funcionario(1, "Maria", "Pessoas", 2323.56);
        Funcionario f2 = new Funcionario(2, "João", "Tecnologia", 1500.00);
        Funcionario f3 = new Funcionario(3, "Marcelo", "Operação", 1780.50);
        Funcionario f4 = new Funcionario(4, "Marcelo", "A", 1780.50);
        Funcionario f5 = new Funcionario(4, "Marcelo", "B", 1780.50);

        List<Funcionario> funcionarios = new ArrayList<>(); //Arrays.asList(f1, f2, f3, f4);
        funcionarios.add(f2);
        funcionarios.add(f5);
        funcionarios.add(f3);
        funcionarios.add(f1);
        funcionarios.add(f4);

        System.out.println("Antes da ordenação");
        for(Funcionario funcionario: funcionarios){
            System.out.println(funcionario);
        }

        Ordenacao<Funcionario> ordenacao = new Ordenacao<>();
        List<Funcionario> funcionariosOrdenados = ordenacao.classificar(funcionarios);

        System.out.println("Depois da ordenação");
        for(Funcionario funcionario: funcionariosOrdenados){
            System.out.println(funcionario);
        }


//        TreeSet<Funcionario> arvore = new TreeSet<>(funcionarios);
//        List<Funcionario> funcionariosOrdenados = new ArrayList<>(arvore);
//
//        System.out.println("Depois da ordenação");
//        for(Funcionario funcionario : funcionariosOrdenados){
//            System.out.println(funcionario);
//        }


    }
}
