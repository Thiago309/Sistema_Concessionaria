package models.servicos;
import jakarta.persistence.*;

@Entity
@Table(name="Servico")
@MappedSuperclass // Indica que essa é a super class para o SQL.
public class Servico {
    @Id
    @Column(name="idservico")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idservico;

    @Column(name="dataInicial")
    private String dataInicial;

    @Column(name="dataFinal")
    private String dataFinal;

    @Column(name="condicaoNegociacao")
    private String condicaoNegociacao;

    @Column(name="descricaoServico")
    private String descricaoServico;

    // Contrutor da class Servico
    public Servico(int idservico, String dataInicial, String dataFinal, String condicaoNegociacao,
                   String descricaoServico) {

        this.idservico = idservico;
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
        this.condicaoNegociacao = condicaoNegociacao;
        this.descricaoServico = descricaoServico;
    }

    public Servico() {}

    // Getters e Setters
    public int getIdServico() {return idservico;}
    public void setIdServico(int idservico) {this.idservico = idservico;}

    public String getDataInicial() {return dataInicial;}
    public void setDataInicial(String dataInicial) {this.dataInicial = dataInicial;}

    public String getDataFinal() {return dataFinal;}
    public void setDataFinal(String dataFinal) {this.dataFinal = dataFinal;}

    public String getCondicaoNegociacao() {return condicaoNegociacao;}
    public void setCondicaoNegociacao(String condicaoNegociacao) {this.condicaoNegociacao = condicaoNegociacao;}

    public String getDescricaoServico() {return descricaoServico;}
    public void setDescricaoServico(String descricaoServico) {this.descricaoServico = descricaoServico;}
}
