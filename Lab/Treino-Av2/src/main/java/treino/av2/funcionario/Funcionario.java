package treino.av2.funcionario;

import treino.av2.carro.Carro;

public abstract class Funcionario {

    public static int contador = 0;

    private int matricula;
    private String nome;
    private double salario;

    Carro carro;

    public Funcionario(String nome, double salario, Carro carro){
        this.nome = nome;
        this.salario = salario;
        contador++;
        matricula = contador;
        this.carro = carro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public abstract void recebeSalario();

    public void mostraInfo(){
        System.out.println("Matricula: " + matricula);
        System.out.println("Nome: " + nome);
        System.out.println("Salário: " + salario);
    }
}
