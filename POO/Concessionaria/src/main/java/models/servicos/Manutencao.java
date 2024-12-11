package models.servicos;
import jakarta.persistence.*;

@Entity
@Table(name="Manutencao")
@MappedSuperclass
public class Manutencao {
    @Id
    @Column(name="idManutencao")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idManutencao;

    @Column(name="chassi")
    private String manuChassi;

    @Column(name="custo")
    private double custoManutencao;

    @Column(name="Proxima_Manutencao")
    private String datapProximaManutencao;

    @Column(name="Responsavel_Tecnico")
    private String responsavel;

    @Column(name="Tipo_Manutencao")
    private String tipoManutencao;

    @Column(name="Status")
    private String Status;

    // Construtor
    public Manutencao(int idManutencao, String manuChassi,double custoManutencao, String datapProximaManutencao, String responsavel,
                      String tipoManutencao, String Status) {

        this.idManutencao = idManutencao;
        this.manuChassi = manuChassi;
        this.custoManutencao = custoManutencao;
        this.datapProximaManutencao = datapProximaManutencao;
        this.responsavel = responsavel;
        this.tipoManutencao = tipoManutencao;
        this.Status = Status;
    }

    public Manutencao() {}

    // Getters e Setters
    public int getIdManutencao() {return idManutencao;}
    public void setIdManutencao(int idManutencao) {this.idManutencao = idManutencao;}


    public String getManuChassi() {return manuChassi;}
    public void setManuChassi(String manuChassi) {this.manuChassi = manuChassi;}

    public double getCustoManutencao() {return custoManutencao;}
    public void setCustoManutencao(double custoManutencao) {this.custoManutencao = custoManutencao;}

    public String getDatapProximaManutencao() {return datapProximaManutencao;}
    public void setDatapProximaManutencao(String datapProximaManutencao) {this.datapProximaManutencao = datapProximaManutencao;}

    public String getResponsavel() {return responsavel;}
    public void setResponsavel(String responsavel) {this.responsavel = responsavel;}

    public String getTipoManutencao() {return tipoManutencao;}
    public void setTipoManutencao(String tipoManutencao) {this.tipoManutencao = tipoManutencao;}

    public String getStatus() {return Status;}
    public void setStatus(String status) {Status = status;}

    @Override
    public String toString() {
        return "Manutenção: " +
                "\nidManutenção= " + idManutencao +
                "\n Chassi= " + manuChassi +
                "\n Custo= R$ " + custoManutencao +
                "\n Técnico Responsavel= " + responsavel +
                "\n Tipo de Manutenção= " + tipoManutencao +
                "\n Situação= " + Status;
    }
}
