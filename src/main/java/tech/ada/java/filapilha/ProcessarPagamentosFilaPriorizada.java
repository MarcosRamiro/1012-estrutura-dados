package tech.ada.java.filapilha;

import tech.ada.java.Funcionario;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class ProcessarPagamentosFilaPriorizada implements ProcessarPagamentos {

    private Queue<Funcionario> fila;

    public ProcessarPagamentosFilaPriorizada(){
        this.fila = new PriorityQueue<>();
    }

    @Override
    public boolean inserir(Funcionario funcionario) {
        return fila.offer(funcionario);
    }

    @Override
    public void processar() {
        while(!fila.isEmpty()){
            System.out.println("Pagamento efetuado para o funcionário: " + fila.remove());
        }
    }

    @Override
    public void visualizar() {
        for(Funcionario funcionario: fila){
            System.out.println("for: " + funcionario);
        }
    }
}
