package servicos;
import java.math.BigDecimal;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class Manutencao {
    private int idManutencao;
    private int chassi;
    private BigDecimal custoManutencao;
    private Date dataProximaManutencao;
    private String responsavel;
    private String tipoManutencao;
    private String status;

    // Getters e setters
    public int getIdManutencao() {
        return idManutencao;
    }

    public void setIdManutencao(int idManutencao) {
        this.idManutencao = idManutencao;
    }

    public int getChassi() {
        return chassi;
    }

    public void setChassi(int chassi) {
        this.chassi = chassi;
    }

    public BigDecimal getCustoManutencao() {
        return custoManutencao;
    }

    public void setCustoManutencao(BigDecimal custoManutencao) {
        this.custoManutencao = custoManutencao;
    }

    public Date getDataProximaManutencao() {
        return dataProximaManutencao;
    }

    public void setDataProximaManutencao(Date dataProximaManutencao) {
        this.dataProximaManutencao = dataProximaManutencao;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public String getTipoManutencao() {
        return tipoManutencao;
    }

    public void setTipoManutencao(String tipoManutencao) {
        this.tipoManutencao = tipoManutencao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public static class ManutencaoService {
        private List<Manutencao> manutencoes = new ArrayList<>();

        // Create
        public Manutencao addManutencao(int idManutencao, int chassi, BigDecimal custoManutencao, String dataProximaManutencao,
                                        String responsavel, String tipoManutencao, String status) {

            Manutencao manutencao = new Manutencao();

            manutencao.setIdManutencao(idManutencao);
            manutencao.setChassi(chassi);
            manutencao.setCustoManutencao(custoManutencao);
            manutencao.setDataProximaManutencao(dataProximaManutencao);
            manutencao.setResponsavel(responsavel);
            manutencao.setTipoManutencao(tipoManutencao);
            manutencao.setStatus(status);
            manutencoes.add(manutencao);

            return manutencao;
        }

        // Read
        public Manutencao getManutencao(int idManutencao) {
            for (Manutencao manutencao : manutencoes) {
                if (manutencao.getIdManutencao() == idManutencao) {
                    return manutencao;

                }
            }

            System.out.print("Manutenção não encontrada em nossos sistemas.");
            return null;
        }

        // Update
        public boolean updateManutencao(int idManutencao, int chassi, BigDecimal custoManutencao, String dataProximaManutencao,
                                        String responsavel, String tipoManutencao, String status) {

            Manutencao manutencao = getManutencao(idManutencao);

            if (manutencao != null) {
                manutencao.setChassi(chassi);
                manutencao.setCustoManutencao(custoManutencao);
                manutencao.setDataProximaManutencao(dataProximaManutencao);
                manutencao.setResponsavel(responsavel);
                manutencao.setTipoManutencao(tipoManutencao);
                manutencao.setStatus(status);

                return true;
            }

            System.out.print("Registro de manutenção não foi atualizada com sucesso.");
            return false;
        }

        // Delete
        public boolean deleteManutencao(int idManutencao) {
            Manutencao manutencao = getManutencao(idManutencao);

            if (manutencao != null) {
                manutencoes.remove(manutencao);
                System.out.print("Registro deletado de manutenção com sucesso.");
                return true;
            }
            System.out.print("Falha ao deletar o registro do serviço.");
            return false;
        }

        // Listar todas as manutenções
        public List<Manutencao> getAllManutencoes() {
            return new ArrayList<>(manutencoes);
        }
    }
}