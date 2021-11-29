package padroescomportamentais.visitor;

public interface Visitor {

    String exibirCliente(Cliente cliente);
    String exibirCompra(Compra compra);
    String exibirFuncionario(Funcionario funcionario);

}
