package padroescomportamentais.visitor;

public class Cliente implements Pessoa {

    private int matricula;
    private String nome;
    private Pedido pedido;

    public Cliente(int matricula, String nome, Pedido pedido) {
        this.matricula = matricula;
        this.nome = nome;
        this.pedido = pedido;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public String getNomeCurso() {
        return this.pedido.getNome();
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirCliente(this);
    }

}
