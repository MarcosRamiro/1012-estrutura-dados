package tech.ada.java;

public record Funcionario(Integer id, String nome, String departamento, double salario)
        implements Comparable<Funcionario> {

    @Override
    public String toString() {
        return "Funcionario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", departamento='" + departamento + '\'' +
                ", salario=" + salario +
                '}';
    }


    @Override
    public int compareTo(Funcionario outroFuncionario) {
        return this.nome.compareTo(outroFuncionario.nome());
    }
}

