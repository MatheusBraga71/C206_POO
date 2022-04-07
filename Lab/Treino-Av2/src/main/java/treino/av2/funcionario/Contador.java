package treino.av2.funcionario;

import treino.av2.interfaces.Despesa;

public class Contador extends Funcionario implements Despesa {

    private int ramal;

    public Contador(String nome, double salario, int ramal) {
        super(nome, salario);
        this.ramal = ramal;
    }

    @Override
    public void recebeSalario(){
        System.out.println("O contador " + getNome() + " recebeu seu salário de: "+ getSalario());
    }

    @Override
    public void mostraInfo(){
        super.mostraInfo();
        System.out.println("Ramal: " + ramal);
    }

    @Override
    public void cadastraDespesa(String despesa){
        System.out.println("Despesa de " + despesa + " foi cadastrada!");
    }
}
