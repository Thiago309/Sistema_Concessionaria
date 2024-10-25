package veiculo;

public class Veiculo {
    private String idVeiculo;
    private String marca;
    private String modelo;
    private String cor;
    private int ano;
    private String categoria;
    private double valorVeiculo;
    private int qtdKM;
    private String dtRegistro;
    private String localizacaoPatio;
    private int qtdEmEstoque;

    // Getters e Setters
    public String getIdVeiculo() { return idVeiculo; }
    public void setIdVeiculo(String idVeiculo) { this.idVeiculo = idVeiculo; }
    // Outros getters e setters...

    // Métodos adicionais
    public void atualizarEstoque(int quantidade) {
        this.qtdEmEstoque += quantidade;
    }

}