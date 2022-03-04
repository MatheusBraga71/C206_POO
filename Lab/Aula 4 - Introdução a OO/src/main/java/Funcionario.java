public class Funcionario {

    int idade;
    String cpf;
    String nome;
    double salario;

    public Funcionario(String nome, int idade, String cpf)//Construtor do objeto funcionário, em Java ele é implícito
    {
        // this referencia a variável a ser usada
        this.nome = nome; //nome da classe recebe o nome do parametro
        this.idade = idade;
        this.cpf = cpf;
    }

    public Funcionario()
    {
        // pode-se colocar parametros aqui, vai funcionar de forma separada da função de cima
    }

    void tirarFerias(String mes)
    {
        System.out.println("O Funcionário " + nome + " vai tirar férias em " + mes);
    }
    double calculaSalarioAnual()
    {
        return 12*salario;
    }
}
