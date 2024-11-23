package models.veiculos;
import jakarta.persistence.*;

@Entity
@Table(name="Veiculo")
@MappedSuperclass
public class Veiculo {
    @Id
    @Column(name="idVeiculo")
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Gera ID automaticamente no banco
    private int idVeiculo;

    @Column(name="chassi")
    private String chassi;

    @Column(name="qtdKm")
    private double qtdKm;

    @Column(name="cor")
    private String cor;

    @Column(name="localizacaoPatio")
    private String localizacaoPatio;

    @Column(name="modelo")
    private String modelo;

    @Column(name="marca")
    private String marca;

    @Column(name="statusVeiculo")
    private String statusVeiculo;

    @Column(name="ano")
    private String ano;

    // Construtor
    public Veiculo(String chassi, double qtdKm, String cor, String localizacaoPatio, String modelo, String marca,
                   String statusVeiculo, String ano) {

        this.chassi = chassi;
        this.qtdKm = qtdKm;
        this.cor = cor;
        this.localizacaoPatio = localizacaoPatio;
        this.modelo = modelo;
        this.marca = marca;
        this.statusVeiculo = statusVeiculo;
        this.ano = ano;
    }
    //Construtor da class Veiculo
    public Veiculo() {}

    // Getters e Setters
    public String getChassi() {
        return chassi;
    }
    public void setChassi(String chassi) {this.chassi = chassi;}

    public double getQtdKm() {return qtdKm;}
    public void setQtdKm(double qtdKm) {this.qtdKm = qtdKm;}

    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getLocalizacaoPatio() {
        return localizacaoPatio;
    }
    public void setLocalizacaoPatio(String localizacaoPatio) {
        this.localizacaoPatio = localizacaoPatio;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getStatusVeiculo() {
        return statusVeiculo;
    }
    public void setStatusVeiculo(String statusVeiculo) {
        this.statusVeiculo = statusVeiculo;
    }

    public String getAno() {
        return ano;
    }
    public void setAno(String ano) {
        this.ano = ano;
    }
}

