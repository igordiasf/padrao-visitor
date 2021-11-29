package padroescomportamentais.visitor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaVisitorTest {

    @Test
    void deveExibirCliente() {
        Cliente cliente = new Cliente(1, "Joao", new Pedido("10"));

        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("Cliente{matricula=1, nome='Joao', pedido=10}", visitor.exibir(cliente));
    }

    @Test
    void deveExibirCompra() {
        Compra compra = new Compra(1, "Bruno", "Camisa");

        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("Compra{matricula=1, nome='Bruno', titulacao='Camisa'}", visitor.exibir(compra));
    }

    @Test
    void deveExibirFuncionario() {
        Funcionario funcionario = new Funcionario(1, "Mario", 2500.0f);

        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("Funcionario{codigo=1, nome='Mario', salario=2500.0}", visitor.exibir(funcionario));
    }

}