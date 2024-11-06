package nvv;

import java.math.BigDecimal;
import java.util.Date;
public class Nvv {
    // Atributos
    private int idNVV;
    private int idFuncionario;
    private Date dataNVV;
    private double valorNVV;

    // Construtor
    public NVV(int idNVV, int idFuncionario, Date dataNVV, double valorNVV) {
        this.idNVV = idNVV;
        this.idFuncionario = idFuncionario;
        this.dataNVV = dataNVV;
        this.valorNVV = valorNVV;
    }

    // Métodos getters e setters
    public int getIdNVV() {
        return idNVV;
    }

    public void setIdNVV(int idNVV) {
        this.idNVV = idNVV;
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;

    }

    public Date getDataNVV() {
        return dataNVV;
    }

    public void setDataNVV(Date dataNVV) {
        this.dataNVV = dataNVV;
    }

    public double getValorNVV() {
        return valorNVV;
    }

    public void setValorNVV(double valorNVV) {
        this.valorNVV = valorNVV;
    }

    // Outros métodos (opcional)
    // ... outros métodos que você pode adicionar, como calcular impostos, etc.
}