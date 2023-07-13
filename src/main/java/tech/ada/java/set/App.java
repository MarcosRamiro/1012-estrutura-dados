package tech.ada.java.set;

import tech.ada.java.Funcionario;

import javax.naming.InterruptedNamingException;
import java.util.*;

public class App {
    public static void main(String[] args) {

//        Conjunto<String> conjunto = new Conjunto<>();
//
//        conjunto.add("Maria");
//        conjunto.add("Marcia");
//        conjunto.add("João");
//        conjunto.add("João");
//
//        System.out.println(conjunto.contem("Maria"));
//        System.out.println(conjunto.contem("João"));
//
//        for(String nome : conjunto){
//            System.out.println(nome);
//        }

//        Funcionario f1 = new Funcionario(1, "Maria", "Pessoas", 2323.56);
//        Funcionario f2 = new Funcionario(2, "João", "Tecnologia", 1500.00);
//        Funcionario f3 = new Funcionario(3, "Marcelo", "Operação", 1780.50);
//        Funcionario f4 = new Funcionario(3, "Marcelo", "Tecnologia", 1780.50);
//
//        List<Funcionario> funcionarios = new ArrayList<>();
//        funcionarios.add(f1);
//        funcionarios.add(f2);
//        funcionarios.add(f3);
//        Funcionario funcionario = new Funcionario(f1.id(), f1.nome(), f1.departamento(), f1.salario());
//        funcionarios.add(funcionario);
//
//        Conjunto<Funcionario> conjunto = new Conjunto<>(funcionarios);
//
//        for(Funcionario funcionarioz : conjunto){
//            System.out.println(funcionarioz);
//        }

        /**
         * Intersecção
         */
//        Set<Integer> conjunto = new HashSet<>();
//        conjunto.add(1);
//        conjunto.add(2);
//        conjunto.add(3);
//
//        Set<Integer> conjunto2 = new HashSet<>();
//        conjunto2.add(2);
//        conjunto2.add(3);
//        conjunto2.add(4);
//
//        conjunto.retainAll(conjunto2);
//        System.out.println("Resultado: " + conjunto);

        /**
         * Diferença
         */
//        Set<Integer> conjunto = new HashSet<>();
//        conjunto.add(1);
//        conjunto.add(2);
//        conjunto.add(3);
//
//        Set<Integer> conjunto2 = new HashSet<>();
//        conjunto2.add(2);
//        conjunto2.add(3);
//        conjunto2.add(4);
//
//        conjunto.removeAll(conjunto2);
//        System.out.println("Resultado: " + conjunto);

        /**
         * União
         */
//        Set<Integer> conjunto = new HashSet<>();
//        conjunto.add(1);
//        conjunto.add(2);
//        conjunto.add(3);
//
//        Set<Integer> conjunto2 = new HashSet<>();
//        conjunto2.add(2);
//        conjunto2.add(3);
//        conjunto2.add(4);
//
//        Set<Integer> uniao = new HashSet<>(conjunto);
//
//        uniao.addAll(conjunto2);
//
//        System.out.println("Resultado: " + uniao);

        TreeSet<Integer> numeros = new TreeSet<>();
        numeros.add(6);
        numeros.add(5);
        numeros.add(4);
        numeros.add(3);
        numeros.add(2);
        numeros.add(1);

        for (int numero: numeros.subSet(2,5)){
            System.out.println("Resultado: " + numero);
        }

    }
}
