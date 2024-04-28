package TrabalhoUmPOO;

public class Cliente {
    private String cpf;
    private String nome;

    public Cliente(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String novoCpf) {
        this.cpf = novoCpf;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String novoNome) {
        this.nome = novoNome;
    }

    public String toString() {
        return  "\tCliente:" + "\n\tCPF:" + this.cpf + "\n\tNome: " + this.nome;
    }
}
