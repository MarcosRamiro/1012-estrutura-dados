package tech.ada.java;

import tech.ada.java.Funcionario;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class CarregarDadosExternos {

    private static String CAMINHO_ARQUIVO = "src/main/resources/funcionarios.csv";

    public List<Funcionario> carregarFuncionariosCVS(){

        List<Funcionario> funcionarios = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(CAMINHO_ARQUIVO))) {

            br.readLine(); // Remover o cabeçalho

            String linha;
            while ((linha = br.readLine()) != null) {
                String[] dados = linha.split(";");
                int id = Integer.parseInt(dados[0].trim());
                String nome = dados[1].trim();
                String departamento = dados[2].trim();
                double salario = Double.parseDouble(dados[3].trim());

                Funcionario funcionario = new Funcionario(id, nome, departamento, salario);
                funcionarios.add(funcionario);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return funcionarios;

    }

}
