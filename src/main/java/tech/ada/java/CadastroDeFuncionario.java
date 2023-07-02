package tech.ada.java;


import java.util.ArrayList;
import java.util.List;

public class CadastroDeFuncionario {
    private int ultimoIdFuncionario = 0;
    private List<Funcionario> funcionarios = new ArrayList<>();
    private final EntradaDeDados leitor;
    private final String DIGITE_OPCAO_DESEJADA = "Digite a opção desejada: ";
    private final String OPCAO_SAIR = "x";
    private final String OPCAO_CADASTRAR_FUNCIONARIO = "1";
    private final String OPCAO_LISTAR_FUNCIONARIOS = "2";

    public CadastroDeFuncionario(EntradaDeDados leitor){
        this.leitor = leitor;
        iniciaApp();
    }

    public void processar(){



            String opcaoDigitada = obterEntradaDoUsuario(leitor);

            while(!escolheuSair(opcaoDigitada)){
                tratarOpcaoSelecionada(opcaoDigitada);
                opcaoDigitada = obterEntradaDoUsuario(leitor);
            }

        finalizaApp();

    }

    private void tratarOpcaoSelecionada(String opcaoDigitada) {
        switch (opcaoDigitada){
            case OPCAO_SAIR:
                break;
            case OPCAO_CADASTRAR_FUNCIONARIO:
                this.funcionarios.add(construirFuncionario(++ultimoIdFuncionario, leitor));
                System.out.println("Cadastro realizado com sucesso!");
                pularLinha(2);
                break;
            case OPCAO_LISTAR_FUNCIONARIOS:
                listarFuncionarios();
                pularLinha(2);
                break;
            default:
                opcaoInvalida();
                break;
        }
    }

    public void pularLinha(int numeroDeLinhas){
        for (int i = 1; i <= numeroDeLinhas; i++) {
            System.out.println();
        }
    }

    private void listarFuncionarios(){
        StringBuilder sb = new StringBuilder();

        if (funcionarios.isEmpty()) {
            sb.append("[]");
        } else {
            sb.append("[\n");
            for (Funcionario funcionario : funcionarios) {
                sb.append("\t").append(funcionario).append(",\n");
            }
            sb.setLength(sb.length() - 2); // Remover a vírgula extra após o último funcionário
            sb.append("\n]");
        }

        System.out.println(sb);
    }

    private boolean escolheuSair(String opcaoDigitada){
        return opcaoDigitada.equals(OPCAO_SAIR);
    }

    private String obterEntradaDoUsuario(EntradaDeDados leitor){
        carregaMenu();
        System.out.print(DIGITE_OPCAO_DESEJADA);
        return leitor.obterEntrada().toLowerCase();
    }

    private Funcionario construirFuncionario(Integer id, EntradaDeDados leitor){
        System.out.println("Cadastro de novo funcionário");
        System.out.print("Informe o nome: ");
        String nome = leitor.obterEntrada();
        System.out.print("Informe o departamento: ");
        String departamento = leitor.obterEntrada();
        System.out.print("Informe o salário: ");
        double salario = leitor.obterEntradaAsDouble();
        return new Funcionario(id, nome, departamento, salario);

    }

    private void finalizaApp(){
        System.out.println("Até logo!!");
    }

    private void opcaoInvalida(){
        System.out.println("Opção INVÁLIDA. Tente novamente.");
    }

    private void iniciaApp(){
        carregaNomeApp();
    }

    private void carregaMenu() {
        System.out.println("********  DIGITE A OPÇÃO DESEJADA   ******");
        System.out.println("1 - CADASTRAR FUNCIONÁRIO(A)");
        System.out.println("2 - LISTAR FUNCIONÁRIOS(AS)");
        System.out.println("X - SAIR");
    }

    private void carregaNomeApp(){
        System.out.println("******************************************");
        System.out.println("******* CADASTRO DE FUNCIONARIOS *********");
        System.out.println("******************************************");
    }

}
