package TrabalhoUmPOO;

import java.util.List;

public class OrdemDeServico {
    private int codigo;
    private Cliente cliente;
    private List<Servico> servicos;

    public OrdemDeServico(int codigo, Cliente cliente, List<Servico> servicos) {
        this.codigo = codigo;
        this.cliente = cliente;
        this.servicos = servicos;
    }

    public Double calculaValorTotal() {
        double total = 0.0;

        for(Servico servico : this.servicos) {
            total += servico.getValor();
        }


        return Math.round(total * 100.0) / 100.0;
    }

    public boolean possuiServico(int codigo) {

        for(Servico servico : this.servicos) {
            if(servico.getCodigo() == codigo) {
                return true;
            }
        }

        return false;
    }


    public String getClienteCPF() {
        return this.cliente.getCpf();
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int novoCodigo) {
        this.codigo = novoCodigo;
    }

    public String toString() {
        return "OS Código: " + this.codigo + "\t\n" + this.cliente;
    }
}
