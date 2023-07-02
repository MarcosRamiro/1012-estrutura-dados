package tech.ada.java;

public class App {
    public static void main(String[] args) {

        try(EntradaDeDados leitor = new EntradaDeDados()) {
            new CadastroDeFuncionario(leitor).processar();
        }

    }
}
