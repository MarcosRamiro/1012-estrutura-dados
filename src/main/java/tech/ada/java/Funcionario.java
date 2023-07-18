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
//        if (this.departamento.equals("Tecnologia") && !outroFuncionario.departamento.equals("Tecnologia")) {
//            return -1;
//        } else if (!this.departamento.equals("Tecnologia") && outroFuncionario.departamento.equals("Tecnologia")) {
//            return 1;
//        }
//
//        // caso não seja de tecnologia segue a regra padrão: por nome e id
//        int resultado = this.nome.compareTo(outroFuncionario.nome());
//
//        if (resultado == 0) {
//            return this.id.compareTo(outroFuncionario.id());
//        }
//
//        return resultado;
        int comparacaoId = this.id.compareTo(outroFuncionario.id());
        if(comparacaoId != 0)
            return comparacaoId;

        return this.departamento.compareTo(outroFuncionario.departamento());
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("Funcionario::equals");

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Funcionario that = (Funcionario) o;

        if (!id.equals(that.id)) return false;
        return nome.equals(that.nome);
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + nome.hashCode();
        return result;
    }
}

