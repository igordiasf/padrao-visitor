package padroescomportamentais.visitor;

public class PessoaVisitor implements Visitor {

    public String exibir(Pessoa pessoa) {
        return pessoa.aceitar(this);
    }

    @Override
    public String exibirCliente(Cliente cliente) {
        return "Cliente{" +
                "matricula=" + cliente.getMatricula() +
                ", nome='" + cliente.getNome() + '\'' +
                ", pedido=" + cliente.getNomeCurso() +
                '}';
    }

    @Override
    public String exibirCompra(Compra compra) {
        return "Compra{" +
                "matricula=" + compra.getMatricula() +
                ", nome='" + compra.getNome() + '\'' +
                ", titulacao='" + compra.getTitulacao() + '\'' +
                '}';
    }

    @Override
    public String exibirFuncionario(Funcionario funcionario) {
        return "Funcionario{" +
                "codigo=" + funcionario.getCodigo() +
                ", nome='" + funcionario.getNome() + '\'' +
                ", salario=" + funcionario.getSalario() +
                '}';
    }
}
