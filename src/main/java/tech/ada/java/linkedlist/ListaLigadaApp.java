package tech.ada.java.linkedlist;

import tech.ada.java.Funcionario;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListaLigadaApp {

    public static void main(String... args){

        Funcionario f1 = new Funcionario(1, "Maria", "Pessoas", 2323.56);
        Funcionario f2 = new Funcionario(2, "João", "Tecnologia", 1500.00);
        Funcionario f3 = new Funcionario(3, "Marcelo", "Operação", 1780.50);
        Funcionario f4 = new Funcionario(4, "Marcelo", "Tecnologia", 1780.50);

        ListaLigada<Funcionario> funcionarios = new ListaLigada<>();
        funcionarios.adicionar(f1);
        funcionarios.adicionar(f2);
        funcionarios.adicionar(f3);
        funcionarios.adicionar(f4);

        funcionarios.display();

        funcionarios.remover(f2);

//        for(Iterator<Funcionario> iter = funcionarios.iterator(); iter.hasNext();){
//            System.out.println("Funcionario: " + iter.next());
//        }

        System.out.println("Funcionarios");

        for (Funcionario funcionario : funcionarios){
            System.out.println("Funcionario: " + funcionario);
        }

    }


}
