public class Conta {

    private double saldo;
    private double limite;

    // SOBRECARGA DE CONSTRUTORES - MAIS DE UM CONSTRUTOR PARA UM MESMO TIPO DE VARIÁVEL
    public Conta(double saldo, double limite){ // Construtor que normalmente está implícito - quando não há passagem de parâmetro na criação
        this.saldo = saldo;
        this.limite = limite;
    }

    public Conta(){ // Vai funcionar para a var c2 da main, a conta vai ser criada sem parametrização
    }

    void sacar(double quantia) {
        saldo -= quantia;
    }

    void depositar(double quantia){
        saldo += quantia;
    }

    //Getters e Setters
    public double getSaldo(){ //função que torna publica a leitura do saldo - getter
        return saldo;
    }

    /* SOMENTE EXEMPLO - NÃO SE USA EM TODOS OS CASOS
    public void setSaldo(double saldo) { // setter
        this.saldo = saldo; //this usado quando precisa fazer referência a variáveis da instância
    }
     */


}
