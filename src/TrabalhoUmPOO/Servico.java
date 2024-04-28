package TrabalhoUmPOO;

public class Servico {
    private int codigo;
    private String nome;
    private float valor;

    public Servico(int codigo, String nome, float valor) {
        this.codigo = codigo;
        this.nome = nome;
        this.valor = valor;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int novoCodigo) {
        this.codigo = novoCodigo;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String novoNome) {
        this.nome = novoNome;
    }

    public float getValor() {
        return this.valor;
    }

    public void setValor(float novoValor) {
        this.valor = novoValor;
    }

    public String toString() {
        return "Serviço:" + "\n\tCódigo: " + this.codigo +  "\n\tNome: " + this.nome + "\n\tValor: " + this.valor;
    }
}
