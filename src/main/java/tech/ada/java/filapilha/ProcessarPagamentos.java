package tech.ada.java.filapilha;

import tech.ada.java.Funcionario;

public interface ProcessarPagamentos {

    boolean inserir(Funcionario funcionario);

    void processar();

    void visualizar();
}
