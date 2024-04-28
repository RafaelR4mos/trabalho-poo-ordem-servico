package TrabalhoUmPOO;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Servico servicoUm = new Servico(1, "Serviço 1", 200.2F);
        Servico servicoDois = new Servico(2, "Serviço 2", 120.2F);
        Servico servicoTres = new Servico(3, "Serviço 3", 100.2F);
        Servico servicoQuatro = new Servico(4, "Serviço 4", 80.1F);

        Cliente clienteRafael = new Cliente("222.222.222-11", "Rafael Ramos");
        Cliente clienteJoao = new Cliente("1111.222.333-44", "João Silva");
        Cliente clientePedro = new Cliente("1111.222.333-44", "João Silva");

        List<Servico> listaDeServicos = new ArrayList<>();
        listaDeServicos.add(servicoUm);
        listaDeServicos.add(servicoDois);
        listaDeServicos.add(servicoTres);

        List<Servico> listaDeServicosDois = new ArrayList<>();
        listaDeServicosDois.add(servicoQuatro);
        listaDeServicosDois.add(servicoTres);
        listaDeServicosDois.add(servicoUm);

        OrdemDeServico orderDeServico = new OrdemDeServico(1, clienteRafael, listaDeServicos);
        OrdemDeServico orderDeServicoDois = new OrdemDeServico(2, clienteJoao, listaDeServicos);
        OrdemDeServico orderDeServicoTres = new OrdemDeServico(3, clientePedro, listaDeServicos);
        OrdemDeServico orderDeServicoQuatro = new OrdemDeServico(4, clientePedro, listaDeServicosDois);
        OrdemDeServico ordemDeServicoCinco = new OrdemDeServico(5, clienteJoao, listaDeServicosDois);
        OrdemDeServico ordemDeServicoSeis = new OrdemDeServico(6, clienteRafael, listaDeServicosDois);

        List<OrdemDeServico> osList = new ArrayList<>();

        osList.add(orderDeServico);
        osList.add(orderDeServicoDois);
        osList.add(orderDeServicoTres);
        osList.add(orderDeServicoQuatro);
        osList.add(ordemDeServicoCinco);
        osList.add(ordemDeServicoSeis);

        Oficina oficina = new Oficina(osList);

        OrdemDeServico osEncontrada =  oficina.buscaOSCodigo(1);

        System.out.println("\nValor OS Total: " + osEncontrada.calculaValorTotal());

        System.out.println("\nOficinaBuscaOSCPF: \n" + oficina.buscaOSCPF("1111.222.333-44"));

        System.out.println("\nOficinaBuscaOSServico: \n" + oficina.buscaOSServico(1));

        System.out.println("\nValor Oficina total: " + oficina.calculaFaturamentoTotal());
    }
}