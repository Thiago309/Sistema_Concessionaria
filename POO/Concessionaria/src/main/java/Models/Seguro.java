package Models;
import java.math.BigDecimal;
import java.util.*;
import jakarta.persistence.*;
public class Seguro {
    private int numeroApolice;
    private int chassi;
    private Date segDataInicial;
    private Date segDataFinal;
    private BigDecimal segPreco;
    private String cobertura;
    private BigDecimal franquia;

    // Getters e setters
    public int getNumeroApolice() {
        return numeroApolice;
    }

    public void setNumeroApolice(int numeroApolice) {
        this.numeroApolice = numeroApolice;
    }

    public int getChassi() {
        return chassi;
    }

    public void setChassi(int chassi) {
        this.chassi = chassi;
    }

    public Date getSegDataInicial() {
        return segDataInicial;
    }

    public void setSegDataInicial(Date segDataInicial) {
        this.segDataInicial = segDataInicial;
    }

    public Date getSegDataFinal() {
        return segDataFinal;
    }

    public void setSegDataFinal(Date segDataFinal) {
        this.segDataFinal = segDataFinal;
    }

    public BigDecimal getSegPreco() {
        return segPreco;
    }

    public void setSegPreco(BigDecimal segPreco) {
        this.segPreco = segPreco;
    }

    public String getCobertura() {
        return cobertura;
    }

    public void setCobertura(String cobertura) {
        this.cobertura = cobertura;
    }

    public BigDecimal getFranquia() {
        return franquia;
    }

    public void setFranquia(BigDecimal franquia) {
        this.franquia = franquia;
    }

    public static class SeguroService {
        private List<Seguro> seguros = new ArrayList<>();

        // Create
        public Seguro addSeguro(int numeroApolice, int chassi, Date segDataInicial, Date segDataFinal,
                                BigDecimal segPreco, String cobertura, BigDecimal franquia) {

            Seguro seguro = new Seguro();

            seguro.setNumeroApolice(numeroApolice);
            seguro.setChassi(chassi);
            seguro.setSegDataInicial(segDataInicial);
            seguro.setSegDataFinal(segDataFinal);
            seguro.setSegPreco(segPreco);
            seguro.setCobertura(cobertura);
            seguro.setFranquia(franquia);
            seguros.add(seguro);

            return seguro;
        }

        // Read
        public Seguro getSeguro(int numeroApolice) {
            for (Seguro seguro : seguros) {
                if (seguro.getNumeroApolice() == numeroApolice) {
                    return seguro;

                }
            }
            System.out.print("Apolice não encontrada em nossos sistemas.");
            return null; // Seguro não encontrado

        }

        // Update
        public boolean updateSeguro(int numeroApolice, int chassi, Date segDataInicial, Date segDataFinal,
                                    BigDecimal segPreco, String cobertura, BigDecimal franquia) {

            Seguro seguro = getSeguro(numeroApolice);

            if (seguro != null) {
                seguro.setChassi(chassi);
                seguro.setSegDataInicial(segDataInicial);
                seguro.setSegDataFinal(segDataFinal);
                seguro.setSegPreco(segPreco);
                seguro.setCobertura(cobertura);
                seguro.setFranquia(franquia);

                return true; // Atualização bem-sucedida
            }
            System.out.print("Apolice não encontrada em nossos sistemas.");
            return false; // Seguro não encontrado

        }

        // Delete
        public boolean deleteSeguro(int numeroApolice) {
            Seguro seguro = getSeguro(numeroApolice);
            if (seguro != null) {
                seguros.remove(seguro);
                return true; // Exclusão bem-sucedida
            }
            System.out.print("Apolice não encontrada em nossos sistemas.");
            return false; // Seguro não encontrado

        }

        // Listar todos os seguros
        public List<Seguro> getAllSeguros() {
            return new ArrayList<>(seguros);

        }
    }
}