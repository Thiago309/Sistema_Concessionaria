package manutencao;

import java.util.Date;

public class Servico {
    private int idServico;
    private Date dataInicial;
    private Date dataFinal;
    private String condicaoNegociacao;
    private String descricaoServico;

    // Construtor padrão
    public Servico() {}

    // Construtor com parâmetros
    public Servico(int idServico, Date dataInicial, Date dataFinal, String condicaoNegociacao, String descricaoServico) {
        this.idServico = idServico;
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
        this.condicaoNegociacao = condicaoNegociacao;
        this.descricaoServico = descricaoServico;
    }

    // Getters e Setters
    public int getIdServico() {
        return idServico;
    }

    public void setIdServico(int idServico) {
        this.idServico = idServico;
    }

    public Date getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(Date dataInicial) {
        this.dataInicial = dataInicial;
    }

    public Date getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(Date dataFinal) {
        this.dataFinal = dataFinal;
    }

    public String getCondicaoNegociacao() {
        return condicaoNegociacao;
    }

    public void setCondicaoNegociacao(String condicaoNegociacao) {
        this.condicaoNegociacao = condicaoNegociacao;
    }

    public String getDescricaoServico() {
        return descricaoServico;
    }

    public void setDescricaoServico(String descricaoServico) {
        this.descricaoServico = descricaoServico;
    }

    // Método para exibir as informações do serviço
    public void exibirInformacoesServico() {
        System.out.println("ID do Serviço: " + idServico);
        System.out.println("Data Inicial: " + dataInicial);
        System.out.println("Data Final: " + dataFinal);
        System.out.println("Condição de Negociação: " + condicaoNegociacao);
        System.out.println("Descrição do Serviço: " + descricaoServico);
    }
}
