package nvv;

import java.util.*;
import java.util.Date;

public class Nvv {
    // Atributos
    private int idNVV;
    private int idFuncionario;
    private String dataNVV;
    private double valorNVV;

    // Construtor
    public Nvv(int idNVV, int idFuncionario, String dataNVV, double valorNVV) {
        this.idNVV = idNVV;
        this.idFuncionario = idFuncionario;
        this.dataNVV = dataNVV;
        this.valorNVV = valorNVV;
    }

    // Métodos getters e setters
    public int getIdNVV() {
        return idNVV;
    }

    public void setIdNVV(int idNVV) {
        this.idNVV = idNVV;
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;

    }

    public String getDataNVV() {
        return dataNVV;
    }

    public void setDataNVV(Date dataNVV) {
        this.dataNVV = String.valueOf(dataNVV);
    }

    public double getValorNVV() {
        return valorNVV;
    }

    public void setValorNVV(double valorNVV) {
        this.valorNVV = valorNVV;
    }

    public static class NvvService {
        private List<Nvv> nvvs = new ArrayList<>();

        // Create
        public Nvv addNvv(int idNVV, int idFuncionario, String dataNVV, double valorNVV) {
            Nvv nvv = new Nvv(idNVV, idFuncionario, dataNVV, valorNVV);
            nvvs.add(nvv);
            return nvv;
        }

        // Read
        public Nvv getNvv(int idNVV) {
            for (Nvv nvv : nvvs) {
                if (nvv.getIdNVV() == idNVV) {
                    return nvv;
                }
            }
            return null;
        }

        // Delete
        public boolean deleteNvv(int idNVV) {
            Nvv nvv = getNvv(idNVV);
            if (nvv != null) {
                nvvs.remove(nvv);
                return true;
            }
            return false;
        }

        // Listar todos os NVVs
        public List<Nvv> getAllNvvs() {
            return new ArrayList<>(nvvs);
        }
    }
}