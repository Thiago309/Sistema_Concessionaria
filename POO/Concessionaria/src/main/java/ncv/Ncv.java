package ncv;

import java.math.BigDecimal;
import java.util.Date;

public class Ncv {
    private int idNCV;
    private int idFuncionario;
    private Date dataNCV;
    private BigDecimal valorNCV;

    // Construtor da classe
    public Ncv(int idNCV, int idFuncionario, Date dataNCV, BigDecimal valorNCV) {
        this.idNCV = idNCV;
        this.idFuncionario = idFuncionario;
        this.dataNCV = dataNCV;
        this.valorNCV = valorNCV;
    }

    // Getters e Setters
    public int getIdNCV() {
        return idNCV;
    }

    public void setIdNCV(int idNCV) {
        this.idNCV = idNCV;
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public Date getDataNCV() {
        return dataNCV;
    }

    public void setDataNCV(Date dataNCV) {
        this.dataNCV = dataNCV;
    }

    public BigDecimal getValorNCV() {
        return valorNCV;
    }

    public void setValorNCV(BigDecimal valorNCV) {
        this.valorNCV = valorNCV;
    }
}
