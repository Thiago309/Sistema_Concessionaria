package ncv;

import java.math.BigDecimal;
import java.util.*;

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

    public Ncv(int idNCV, int idFuncionario, String dataNCV, BigDecimal valorNCV) {

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

    public static class NcvService {
        private List<Ncv> ncvs = new ArrayList<>();

        // Criando uma nota de compra.
        public Ncv addNcv(int idNCV, int idFuncionario, String dataNCV, BigDecimal valorNCV) {
            Ncv ncv = new Ncv(idNCV, idFuncionario, dataNCV, valorNCV);
            ncvs.add(ncv);
            return ncv;
        }

        // Procurando por uma nota de compra atraves do ID.
        public Ncv getNcv(int idNCV) {
            for (Ncv ncv : ncvs) {
                if (ncv.getIdNCV() == idNCV) {
                    return ncv;

                }
            }
            System.out.println("Nenhuma nota foi encontrada atras do ID disponibilizado.");
            return null;

        }

        // Deletar nota de compra.
        public boolean deleteNcv(int idNCV) {
            Ncv ncv = getNcv(idNCV);
            if (ncv != null) {
                ncvs.remove(ncv);
                return true;
            }
            System.out.println("Nenhuma nota foi encontrada atras do ID disponibilizado.");
            return false;
        }

        // Listar todos os registros NCV
        public List<Ncv> getAllNcvs() {
            return new ArrayList<>(ncvs);
        }
    }
}