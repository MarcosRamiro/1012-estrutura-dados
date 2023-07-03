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

        // Tecnologia tem sempre a prioridade
        if (this.departamento.equals("Tecnologia") && !outroFuncionario.departamento.equals("Tecnologia")) {
            return -1;
        } else if (!this.departamento.equals("Tecnologia") && outroFuncionario.departamento.equals("Tecnologia")) {
            return 1;
        }

        // caso não seja de tecnologia segue a regra padrão: por nome e id
        int resultado = this.nome.compareTo(outroFuncionario.nome());

        if (resultado == 0) {
            return this.id.compareTo(outroFuncionario.id());
        }

        return resultado;
    }
}

