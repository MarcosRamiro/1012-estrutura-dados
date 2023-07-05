package tech.ada.java.filapilha;

import tech.ada.java.Funcionario;

public class AppPilha {

    public static void main(String[] args) {

        Funcionario f1 = new Funcionario(1, "Maria", "Pessoas", 2323.56);
        Funcionario f2 = new Funcionario(2, "João", "Tecnologia", 1500.00);
        Funcionario f3 = new Funcionario(3, "Marcelo", "Operação", 1780.50);
        Funcionario f4 = new Funcionario(4, "Marcelo", "Tecnologia", 1780.50);

        ProcessarPagamentos processarPagamentos = new ProcessarPagamentosPilha();
        processarPagamentos.inserir(f1);
        processarPagamentos.inserir(f2);
        processarPagamentos.inserir(f3);
        processarPagamentos.inserir(f4);

        processarPagamentos.visualizar();

        processarPagamentos.processar();

        processarPagamentos.visualizar();

    }

}
