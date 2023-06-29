package tech.ada.java.array;

import java.util.*;

public class App
{
    public static void main(String[] args ){

        Funcionario[] funcionarios = new Funcionario[3];

        Funcionario funcionario1 = new Funcionario(1, "Maria", "Vendas", 1000.00);
        Funcionario funcionario2 = new Funcionario(2, "João", "Tecnologia", 1500.00);
        Funcionario funcionario3 = new Funcionario(3, "Carlos", "Vendas", 2500.00);


        /**
         * Arrays
         */

        funcionarios[2] = funcionario1;
        funcionarios[1] = funcionario2;
        funcionarios[0] = funcionario3;





        /**
         * Dados os funcionarios acima
         * preciso imprimir os funcionarios na console
         */

//        for (int i = 0; i < funcionarios.length; i++) {
//            Funcionario funcionario = funcionarios[i];
//            System.out.println(funcionario);
//        }



        /**
         * Já sei a quantidade de elementos que o Array terá,
         * como eu faço para declarar o array já com os elementos?
         */
        String[] carros = {"Volvo", "BMW", "GM"};
//        for (int i = 0; i < carros.length; i++) {
//            System.out.println(carros[i]);
//        }

        /***
         * Ordenação de Arrays
         * */

        //Arrays.sort(carros)
//        for (int i = 0; i < carros.length; i++) {
//            System.out.println(carros[i]);
//        }

        Arrays.sort(funcionarios);

        for (int i = 0; i < funcionarios.length; i++) {
            Funcionario funcionario = funcionarios[i];
            System.out.println(funcionario);
        }


        /**
         * Como eu faço para deletar um item de um Array?
         */
        String nome = "joão";

//        for (int i = 0; i < funcionarios.length; i++) {
//            if(nome.equalsIgnoreCase(funcionarios[i].nome())){
//                funcionarios[i] = null;
//            }
//        }

        for (int i = 0; i < funcionarios.length; i++) {
            Funcionario funcionario = funcionarios[i];
            System.out.println(funcionario);
        }

        removerItemDoArray(funcionarios, nome);

        for (int i = 0; i < funcionarios.length; i++) {
            System.out.println(funcionarios[i]);
        }




        /**
         * Tá complicando um pouco fazer o gerenciamento do Array,
         * fazer a deleção na mão é arriscado, e pode causar erros
         *
         * Que solução podemos usar para abstrair esse conceito do Arrays?
         */

        System.out.println();
        System.out.println();
        List<Funcionario> funcionariosList = new ArrayList<>();
        funcionariosList.add(funcionario1);
        funcionariosList.add(funcionario2);
        funcionariosList.add(funcionario3);





        /**
         * como eu faço para remover um item da lista
         */

        String funcionarioParaRemover = "maria";

        // funcionariosList.removeIf(funcionario -> funcionario.nome().equalsIgnoreCase(funcionarioParaRemover));

//        for (Funcionario funcionario : funcionariosList){
//            if (funcionario.nome().equalsIgnoreCase(funcionarioParaRemover)){
//                funcionariosList.remove(funcionario);
//            }
//        }


//        for (Funcionario funcionario : funcionariosList){
//            System.out.println(funcionario);
//        }



        /**
         * A área de finanças da empresa precisa saber qual é a soma do salário da área de 'Vendas'
         * Como podemos obter essa info através da Lista?
         */

        double total = 0.0;

        for (Funcionario funcionario : funcionariosList){
            if(funcionario.departamento().equalsIgnoreCase("vendas")){
                total = total + funcionario.salario();
            }
        }

        System.out.println("Salario total: " + total);




        /**
         * Ordenação da lista
         */
        funcionariosList.add(new Funcionario(4, "Gustavo", "Tecnologia", 1450.00));
        funcionariosList.add(new Funcionario(5, "Adriano", "Tecnologia", 1450.00));

        Collections.sort(funcionariosList);

        System.out.println();
        System.out.println();
        for (Funcionario funcionario : funcionariosList) {
            System.out.println(funcionario);
        }






        /**
         * Como fazer o acesso direto a um elemento da lista atráves do índice?
         */

        System.out.println();
        System.out.println();
        System.out.println(funcionariosList.get(0));
        System.out.println(funcionariosList.size());

        /**
         * Como fazer a remoção de elementos da lista?
         */

        System.out.println();
        System.out.println("=========");
        funcionariosList.add(funcionario1);
        funcionariosList.remove(funcionario1);

        for (Funcionario funcionario : funcionariosList) {
            System.out.println(funcionario);
        }

        // outra forma de remover (Error: checkForComodification)
//        for (Funcionario funcionario : funcionariosList) {
//            if(funcionario.nome().equalsIgnoreCase("Maria")){
//                funcionariosList.remove(funcionario);
//            }
//        }
//
//        System.out.println();
//        System.out.println("=========");
//
//        for (Funcionario funcionario : funcionariosList) {
//            System.out.println(funcionario);
//        }

        // uso mais comum para remover/filtrar item(ns) da lista

        List<Funcionario> novaLista = new ArrayList<>(funcionariosList.size());

        for (Funcionario funcionario : funcionariosList) {
           if(!funcionario.nome().equalsIgnoreCase("Maria")){
               novaLista.add(funcionario);
           }
        }


        System.out.println();
        System.out.println("********");
        for (Funcionario funcionario : novaLista) {
            System.out.println(funcionario);
        }


















        //new CadastroDeFuncionario(new SaidaDeDados()).processar();

    }









    private static void removerItemDoArray(Funcionario[] funcionarios, String nome) {
        int indicePrincipal = 0;
        int indiceSecundario = 0;
        Funcionario funcionario = funcionarios[indicePrincipal];
        while(funcionario != null){
            if(funcionario.nome().equalsIgnoreCase(nome)){
                indiceSecundario++;
            }
            if (indiceSecundario >= funcionarios.length){
                funcionarios[indicePrincipal] = null;
                break;
            }
            else{
                funcionarios[indicePrincipal] = funcionarios[indiceSecundario];
            }
            indicePrincipal++;
            indiceSecundario++;
            funcionario = funcionarios[indicePrincipal];
        }
    }


}
