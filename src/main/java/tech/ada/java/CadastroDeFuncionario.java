package tech.ada.java;


import tech.ada.java.map.Mapa;

import java.util.*;
import java.util.stream.Collectors;

public class CadastroDeFuncionario {
    private int ultimoIdFuncionario = 0;
    private NavigableSet<Funcionario> listaDeFuncionarios = new TreeSet<>();



    //private Map<Integer, Funcionario> mapaIdFuncionario = new HashMap<>();
    private Mapa<Integer, Funcionario> mapaIdFuncionario = new Mapa<>();
    private Mapa<String, List<Funcionario>> mapaFuncionarioPorNome = new Mapa<>();

    private final EntradaDeDados leitor;
    private final String DIGITE_OPCAO_DESEJADA = "Digite a opção desejada: ";
    private final String OPCAO_SAIR = "x";
    private final String OPCAO_CADASTRAR_FUNCIONARIO = "1";
    private final String OPCAO_LISTAR_FUNCIONARIOS = "2";
    private final String OPCAO_CADASTRAR_EM_LOTE = "3";
    private final String OPCAO_BUSCA_POR_ID = "4";
    private final String OPCAO_BUSCA_POR_NOME = "5";

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
                this.inserirFuncionario(construirFuncionario(++ultimoIdFuncionario, leitor));
                System.out.println("Cadastro realizado com sucesso!");
                pularLinha(2);
                break;
            case OPCAO_LISTAR_FUNCIONARIOS:
                listarFuncionarios();
                pularLinha(2);
                break;
            case OPCAO_CADASTRAR_EM_LOTE:
                carregarFuncionariosEmLote();
                break;
            case OPCAO_BUSCA_POR_ID:
                buscaPorIdHashMap();
                break;
            case OPCAO_BUSCA_POR_NOME:
                buscaPorNomeHashMap();
                break;
            default:
                opcaoInvalida();
                break;
        }
    }

    private List<Funcionario> removerDuplicados(List<Funcionario> lista){
        return new ArrayList<>(new HashSet<>(lista));
    }

    private void carregarFuncionariosEmLote(){
        List<Funcionario> novosFuncionarios =
                new CarregarDadosExternos().carregarFuncionariosCVS();

        this.inserirFuncionario(removerDuplicados(novosFuncionarios));

    }

    private void inserirFuncionario(List<Funcionario> funcionarios){
        for (Funcionario funcionario: funcionarios){
            inserirFuncionario(funcionario);
        }
    }

    private void inserirFuncionario(Funcionario funcionario){
        this.listaDeFuncionarios.add(funcionario);
        this.mapaIdFuncionario.add(funcionario.id(), funcionario);
        String[] nomes = funcionario.nome().split(" ");

        for (String nome : nomes){
            nome = nome.toLowerCase();
            List<Funcionario> funcionarios = mapaFuncionarioPorNome.get(nome);

            if(funcionarios != null){
                funcionarios.add(funcionario);
            } else {
                List<Funcionario> funcionariosAux = new ArrayList<>();
                funcionariosAux.add(funcionario);
                mapaFuncionarioPorNome.add(nome, funcionariosAux);
            }
        }
    }

    public void pularLinha(int numeroDeLinhas){
        for (int i = 1; i <= numeroDeLinhas; i++) {
            System.out.println();
        }
    }

    // Performance ruim: Big O(n)
    private void buscaPorId(){
        System.out.print("Digite o id do funcionario: ");
        Integer id = leitor.obterEntradaAsInt();
        for (Funcionario funcionario: listaDeFuncionarios){
            System.out.println("Pesquisou na Lista: " + id);
            if(id.equals(funcionario.id())){
                System.out.println("Funcionário localizado!");
                System.out.println(funcionario);
                return;
            }
        }
        System.out.println("Nenhum funcionário localizado para o id: " + id);
    }

    private void buscaPorIdHashMap(){
        System.out.print("Digite o id do funcionario: ");
        Integer id = leitor.obterEntradaAsInt();
        Funcionario funcionario = this.mapaIdFuncionario.get(id);
        if(funcionario != null){
            System.out.println("Funcionário localizado!");
            System.out.println(funcionario);
        } else {
            System.out.println("Nenhum funcionário localizado para o id: " + id);
        }
    }

    private void buscaPorNomeHashMap(){
        System.out.print("Digite o primeiro nome do funcionario: ");
        String primeiroNome = leitor.obterEntrada().toLowerCase();
        List<Funcionario> funcionarios = this.mapaFuncionarioPorNome.get(primeiroNome);
        if(funcionarios != null){
            System.out.println("Funcionário(s) localizado(s)!");
            for (Funcionario funcionario: funcionarios){
                System.out.println(funcionario);
            }
        } else {
            System.out.println("Nenhum funcionário localizado para o nome: " + primeiroNome);
        }
    }

    private void listarFuncionarios(){
        StringBuilder sb = new StringBuilder();

        if (listaDeFuncionarios.isEmpty()) {
            sb.append("[]");
        } else {
            sb.append("[\n");
            for (Funcionario funcionario : listaDeFuncionarios) {
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
        System.out.println("3 - CADASTRO EM LOTE (CSV)");
        System.out.println("4 - PESQUISAR POR ID");
        System.out.println("5 - PESQUISAR POR NOME");
        System.out.println("X - SAIR");
    }

    private void carregaNomeApp(){
        System.out.println("******************************************");
        System.out.println("******* CADASTRO DE FUNCIONARIOS *********");
        System.out.println("******************************************");
    }

}
