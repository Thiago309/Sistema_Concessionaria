package models.servicos;
import jakarta.persistence.*;

@Entity
@Table(name="Seguro")
@MappedSuperclass
public class Seguro {
    @Id
    @Column(name="idseguro")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idseguro;

    @Column(name="numeroApolice")
    private int numeroApolice;

    @Column(name="chassi")
    private String segChassi;

    @Column(name="segDataInicial")
    private String segDataInicial;

    @Column(name="segDataFinal")
    private String segDataFinal;

    @Column(name="segPreco")
    private double segPreco;

    @Column(name="cobertura")
    private String cobertura;

    @Column(name="franquia")
    private double franquia;

    public Seguro(int idseguro, int numeroApolice, String segChassi, String segDataInicial, String segDataFinal, double segPreco,
                  String cobertura, double franquia) {

        this.idseguro = idseguro;
        this.numeroApolice = numeroApolice;
        this.segChassi = segChassi;
        this.segDataInicial = segDataInicial;
        this.segDataFinal = segDataFinal;
        this.segPreco = segPreco;
        this.cobertura = cobertura;
        this.franquia = franquia;
    }
    //Construtor da class Seguro
    public Seguro() {}

    public int getIdSeguro() {return idseguro;}
    public void setIdSeguro(int idseguro) {this.idseguro = idseguro;}

    // Getters e setters
    public int getNumeroApolice() {return numeroApolice;}
    public void setNumeroApolice(int numeroApolice) {this.numeroApolice = numeroApolice;}

    public String getSegChassi() {return segChassi;}
    public void setSegChassi(String segChassi) {this.segChassi = segChassi;}

    public String getSegDataInicial() {return segDataInicial;}
    public void setSegDataInicial(String segDataInicial) {this.segDataInicial = segDataInicial;}

    public String getSegDataFinal() {return segDataFinal;}
    public void setSegDataFinal(String segDataFinal) {this.segDataFinal = segDataFinal;}

    public double getSegPreco() {return segPreco;}
    public void setSegPreco(double segPreco) {this.segPreco = segPreco;}

    public String getCobertura() {return cobertura;}
    public void setCobertura(String cobertura) {this.cobertura = cobertura;}

    public double getFranquia() {return franquia;}
    public void setFranquia(double franquia) {this.franquia = franquia;}

    @Override
    public String toString() {
        return "Seguro: " +
                "\nidSeguro= " + idseguro +
                "\n Numero da Apolice= " + numeroApolice +
                "\n Chassi= " + segChassi +
                "\n Data Inicial= " + segDataInicial+
                "\n Data Final= " + segDataFinal +
                "\n Valor= R$ " + segPreco +
                "\n Cobertura= R$ " + cobertura +
                "\n Franquia= R$ " + franquia;
    }
}