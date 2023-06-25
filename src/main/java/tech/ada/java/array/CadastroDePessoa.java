package tech.ada.java.array;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;


public class CadastroDePessoa {
    private final SaidaDeDados console;

    private final String DIGITE_OPCAO_DESEJADA = "Digite a opção desejada: ";
    private Pessoa pessoa;

    public CadastroDePessoa(SaidaDeDados print){
        this.console = print;
    }

    public void iniciar(){

        iniciaApp();

        try(Scanner scanner = new Scanner(System.in)){

            String opcaoDigitada = obterEntradaDoUsuario(scanner);

            while(!escolheuSair(opcaoDigitada)){
                switch (opcaoDigitada){
                    case "x":
                        break;
                    case "1":
                        pessoa = construirPessoa(scanner);
                        System.out.println(pessoa);
                        break;
                    default:
                        opcaoInvalida();
                        break;
                }
                opcaoDigitada = obterEntradaDoUsuario(scanner);
            }
        }

        finalizaApp();

    }

    private boolean escolheuSair(String opcaoDigitada){
        return opcaoDigitada.equalsIgnoreCase("x");
    }

    private String obterEntradaDoUsuario(Scanner scanner){
        carregaMenu();
        console.info(DIGITE_OPCAO_DESEJADA);
        String opcaoDigitada = scanner.nextLine();
        return opcaoDigitada;
    }



    private Pessoa construirPessoa(Scanner scanner){
        console.info("Cadastro de nova pessoa");
        System.out.print("Informe o nome da pessoa: ");
        String nome = scanner.nextLine();
        Integer idade = 0;

        do {
            System.out.print("Informe a idade da pessoa: ");
            String idadeDigitada = scanner.nextLine();

            try {
                idade = Integer.parseInt(idadeDigitada);
            } catch (NumberFormatException ex) {
                idade = 0;
            }

        } while (idade == 0);

        return new Pessoa(nome, idade);

    }

    private void finalizaApp(){
        console.info("Até logo!!");
    }

    private void opcaoInvalida(){
        console.info("Opção INVÁLIDA. Tente novamente.");
        carregaMenu();
    }

    private void iniciaApp(){
        carregaNomeApp();
        carregaMenu();
    }

    private void carregaMenu() {
        console.info("********  DIGITE A OPÇÃO DESEJADA   ******");
        console.info("1 - CADASTRAR PESSOA");
        console.info("2 - LISTAR PESSOAS");
        console.info("X - SAIR");
    }

    private void carregaNomeApp(){
        console.info("******************************************");
        console.info("****** CADASTRO DE PESSOAS ***************");
        console.info("******************************************");
    }

}
