package projeto.oficina.documentos;

public class Documento {

    private int renavam;
    private String anoDoVeiculo;

    public Documento(int renavam, String anoDoVeiculo){
        this.renavam = renavam;
        this.anoDoVeiculo = anoDoVeiculo;
    }

    public int getRenavam() {
        return renavam;
    }

    public void setRenavam(int renavam) {
        this.renavam = renavam;
    }

    public String getAnoDoVeiculo() {
        return anoDoVeiculo;
    }

    public void setAnoDoVeiculo(String anoDoVeiculo) {
        this.anoDoVeiculo = anoDoVeiculo;
    }
}
