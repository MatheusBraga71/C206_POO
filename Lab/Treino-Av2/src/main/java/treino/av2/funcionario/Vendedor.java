package treino.av2.funcionario;

import treino.av2.interfaces.Venda;

public class Vendedor extends Funcionario implements Venda {

    private double totalComissao = 0;

    public Vendedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void recebeSalario(){
        System.out.println("O vendedor " + getNome() + " recebeu seu salário de " + getSalario());
    }

    @Override
    public void mostraInfo(){
        super.mostraInfo();
        System.out.println("Recebeu uma comissão de: " + totalComissao);
    }

    @Override
    public void fechaVenda(double valorVenda){
        System.out.println("Venda no valor de " + valorVenda + " fechada!");
        totalComissao = totalComissao + valorVenda*0.2;
    }
}
