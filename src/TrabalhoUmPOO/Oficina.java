package TrabalhoUmPOO;

import java.util.ArrayList;
import java.util.List;

public class Oficina {
    private List<OrdemDeServico> ordensServico;

    public Oficina(List<OrdemDeServico> ordensServico) {
        this.ordensServico = ordensServico;
    }

    public void adicionaOS(OrdemDeServico os) {
        this.ordensServico.add((os));
    }

    public OrdemDeServico buscaOSCodigo(int codigo) {
        for (OrdemDeServico os : this.ordensServico) {
            if(os.getCodigo() == codigo) {
                return os;
            }
        }

        return null;
    }

    public List<OrdemDeServico> buscaOSCPF(String cpf) {
        List<OrdemDeServico> osPorCpf = new ArrayList<>();

        for (OrdemDeServico os : this.ordensServico) {
            if(os.getClienteCPF().equals(cpf)) {
                osPorCpf.add((os));
            }
        }

        return osPorCpf;
    }

    public List<OrdemDeServico> buscaOSServico(int codigo) {
        List<OrdemDeServico> osPorServico = new ArrayList<>();

        for (OrdemDeServico os : this.ordensServico) {
            if(os.possuiServico(codigo)) {
                osPorServico.add(os);
            }
        }

        return osPorServico;
    }

    public Double calculaFaturamentoTotal() {
        Double total = 0.0;

        for(OrdemDeServico os : this.ordensServico) {
            total += os.calculaValorTotal();
        }

        return Math.round(total * 100.0) / 100.0;
    }

    public String toString() {
        return "Oficina com " + this.ordensServico.size() + "OS cadastradas.";
    }
}
