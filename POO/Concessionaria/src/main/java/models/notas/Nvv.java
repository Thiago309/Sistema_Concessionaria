package models.notas;
import jakarta.persistence.*;

/*******************************************************************
 * Nota de Venda do Veiculo.                                       *
 * Este metodo regista todas as vendas dos veiculos para clientes  *
 * em um banco de dados.                                           *
 *******************************************************************/

@Entity
@Table(name="Nvv")
@MappedSuperclass
public class Nvv {
    @Id
    @Column(name="idNVV")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idNVV;

    @Column(name="chassi")
    private String nvvChassi;

    @Column(name="idFuncionario")
    private int nvvIdFuncionario;

    @Column(name="Data_Venda")
    private String dataNVV;

    @Column(name="Valor")
    private double valorNVV;

    // Construtor
    public Nvv(int idNVV, String nvvChassi,int nvvIdFuncionario, String dataNVV, double valorNVV) {
        this.idNVV = idNVV;
        this.nvvChassi = nvvChassi;
        this.nvvIdFuncionario = nvvIdFuncionario;
        this.dataNVV = dataNVV;
        this.valorNVV = valorNVV;
    }

    public Nvv() {}

    public int getIdNVV() {return idNVV;}
    public void setIdNVV(int idNVV) {this.idNVV = idNVV;}

    public String getNvvChassi() {return nvvChassi;}
    public void setNvvChassi(String nvvChassi) {this.nvvChassi = nvvChassi;}

    public int getNvvIdFuncionario() {return nvvIdFuncionario;}
    public void setNvvIdFuncionario(int nvvIdFuncionario) {this.nvvIdFuncionario = nvvIdFuncionario;}

    public String getDataNVV() {return dataNVV;}
    public void setDataNVV(String dataNVV) {this.dataNVV = dataNVV;}

    public double getValorNVV() {return valorNVV;}
    public void setValorNVV(double valorNVV) {this.valorNVV = valorNVV;}

    @Override
    public String toString() {
        return "Notas de Vendas: " +
                "\n idNCV= " + idNVV +
                "\n Chassi= " + nvvChassi +
                "\n Funcionario= " + nvvIdFuncionario +
                "\n Data da Compra= " + dataNVV +
                "\n Valor da Nota= R$ " + valorNVV;
    }
}