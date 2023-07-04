package tech.ada.java.filapilha;

import tech.ada.java.Funcionario;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class ProcessarPagamentosFila implements ProcessarPagamentos {

    private Queue<Funcionario> fila;

    public ProcessarPagamentosFila(){
        // this.fila = new ArrayDeque<>(1000);
        this.fila = new LinkedList<>();
    }

    @Override
    public boolean inserir(Funcionario funcionario) {
        // return fila.add(funcionario);
        /**
         * Outra forma de adicionar o elemento no fim da Fila
         */
        return fila.offer(funcionario);
    }

    @Override
    public void processar() {
        while(!fila.isEmpty()){
            //System.out.println("Pagamento efetuado para o funcionário: " + fila.poll());
            System.out.println("Pagamento efetuado para o funcionário: " + fila.remove());
        }
    }

    @Override
    public void visualizar() {
        //fila.visualizar();
    }
}
