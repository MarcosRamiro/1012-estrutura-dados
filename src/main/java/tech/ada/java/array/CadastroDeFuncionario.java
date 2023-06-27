package tech.ada.java.array;

import java.util.Scanner;


public class CadastroDeFuncionario {
    private final SaidaDeDados console;
    private int ultimoIdFuncionario = 0;
    private Funcionario[] funcionarios = new Funcionario[5];

    private final String DIGITE_OPCAO_DESEJADA = "Digite a opção desejada: ";
    private Funcionario pessoa;

    public CadastroDeFuncionario(SaidaDeDados print){
        this.console = print;
    }

    public void processar(){

        iniciaApp();

        try(EntradaDeDados leitor = new EntradaDeDados()){

            String opcaoDigitada = obterEntradaDoUsuario(leitor);

            while(!escolheuSair(opcaoDigitada)){
                switch (opcaoDigitada){
                    case "x":
                        break;
                    case "1":
                        pessoa = construirFuncionario(ultimoIdFuncionario++, leitor);
                        break;
                    case "2":
                        listarFuncionarios();
                        break;
                    default:
                        opcaoInvalida();
                        break;
                }
                opcaoDigitada = obterEntradaDoUsuario(leitor);
            }
        }

        finalizaApp();

    }

    private void listarFuncionarios(){
        for (Funcionario funcionario: funcionarios) {
            console.info(funcionario.toString());
        }
    }



    private boolean escolheuSair(String opcaoDigitada){
        return opcaoDigitada.equalsIgnoreCase("x");
    }

    private String obterEntradaDoUsuario(EntradaDeDados leitor){
        carregaMenu();
        console.info(DIGITE_OPCAO_DESEJADA);
        return leitor.obterEntrada();
    }

    private Funcionario construirFuncionario(Integer id, EntradaDeDados leitor){
        console.info("Cadastro de novo funcionário");
        System.out.print("Informe o nome: ");
        String nome = leitor.obterEntrada();
        System.out.print("Informe o departamento: ");
        String departamento = leitor.obterEntrada();

        double salario = 0.0;

        do {
            System.out.print("Informe o salario: ");
            String salarioDigitado = leitor.obterEntrada();

            try {
                salario = Double.parseDouble(salarioDigitado);
            } catch (NumberFormatException ex) {
                salario = 0.0;
            }

        } while (salario == 0.0);

        return new Funcionario(id, nome, departamento, salario);

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
        console.info("1 - CADASTRAR FUNCIONÁRIO(A)");
        console.info("2 - LISTAR FUNCIONÁRIOS(AS)");
        console.info("X - SAIR");
    }

    private void carregaNomeApp(){
        console.info("******************************************");
        console.info("******* CADASTRO DE FUNCIONARIOS *********");
        console.info("******************************************");
    }

}
