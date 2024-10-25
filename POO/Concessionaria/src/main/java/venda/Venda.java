package venda;

import java.util.Date;

public class Venda {
    private String idPedido;
    private Date data;
    private double total;

    // Getters e Setters
    public String getIdPedido() { return idPedido; }
    public void setIdPedido(String idPedido) { this.idPedido = idPedido; }
    // Outros getters e setters...

    // Métodos adicionais
    public void calcularTotal(double valorVeiculo, int qtdVeiculo) {
        this.total = valorVeiculo * qtdVeiculo;
    }
}
