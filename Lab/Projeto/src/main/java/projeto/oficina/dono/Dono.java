package projeto.oficina.dono;

public class Dono {

    private String nome;
    private String cpf;

    public Dono(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}


//select dono.nome from Carro inner join Dono on fk_Carro_Dono1 = dono.cpf;