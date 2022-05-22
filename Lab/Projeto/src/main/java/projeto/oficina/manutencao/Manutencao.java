package projeto.oficina.manutencao;

public class Manutencao {

    private int id;
    private String status;
    private String problema;

    public Manutencao(int id, String status, String problema){
        this.id  = id;
        this.status = status;
        this.problema = problema;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getProblema() {
        return problema;
    }
}
