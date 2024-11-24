package models.notas;
import jakarta.persistence.*;

/*****************************************************************
 * Nota de Compra do Veiculo (NCV).                              *
 * Este metodo regista todos as compras de veiculos dos clientes *
 * em um banco de dados.                                         *
 *****************************************************************/

@Entity
@Table(name="NCV")
@MappedSuperclass
public class Ncv {
    @Id
    @Column(name="idNCV")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idNCV;

    @Column(name="chassi")
    private String ncvChassi;

    @Column(name="idFuncionario")
    private int ncvIdFuncionario;

    @Column(name="Data_Compra")
    private String dataNCV;

    @Column(name="Valor")
    private double valorNCV;



    // Construtor da classe
    public Ncv(int idNCV, String ncvChassi,int ncvIdFuncionario, String dataNCV, double valorNCV) {
        this.idNCV = idNCV;
        this.ncvChassi = ncvChassi;
        this.ncvIdFuncionario = ncvIdFuncionario;
        this.dataNCV = dataNCV;
        this.valorNCV = valorNCV;
    }

    //Construtor da class Cliente
    public Ncv(){}

    // Getters e Setters
    public int getIdNCV() {return idNCV;}
    public void setIdNCV(int idNCV) {this.idNCV = idNCV;}

    public String getNcvChassi() {return ncvChassi;}
    public void setNcvChassi(String ncvChassi) {this.ncvChassi = ncvChassi;}

    public int getNcvIdFuncionario() {return ncvIdFuncionario;}
    public void setNcvIdFuncionario(int ncvIdFuncionario) {this.ncvIdFuncionario = ncvIdFuncionario;}

    public String getDataNCV() {return dataNCV;}
    public void setDataNCV(String dataNCV) {this.dataNCV = dataNCV;}

    public double getValorNCV() {return valorNCV;}
    public void setValorNCV(double valorNCV) {this.valorNCV = valorNCV;}
}