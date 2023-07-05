package tech.ada.java.filapilha;

import tech.ada.java.Funcionario;

import java.util.LinkedList;
import java.util.Stack;

public class ProcessarPagamentosPilha implements ProcessarPagamentos {

    private LinkedList<Funcionario> pilha;

    public ProcessarPagamentosPilha(){
        this.pilha = new LinkedList<>();
    }

    @Override
    public boolean inserir(Funcionario funcionario) {
        this.pilha.push(funcionario);
        return true;
    }

    @Override
    public void processar() {

        while (!pilha.isEmpty()){
            System.out.println("Pagamento efetuado para o funcionário: " + pilha.pop());
        }

    }

    @Override
    public void visualizar() {
        pilha.stream()
                //.peek(funcionario -> System.out.println(funcionario))
                .forEachOrdered(funcionario -> System.out.println(funcionario));
                // .forEach(funcionario -> System.out.println(funcionario));
    }
}
