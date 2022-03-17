public class Conta {

    private int saldo = 90;
    private int limite = 100;
    private String nome;

    //Uso de getters and setters
    public int getSaldo() {
        return saldo;
    }
    /* Nesse caso, definir um saldo não faz sentido, então podemos remover essa função
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
     */

    public int getLimite() {
        return limite;
    }

    public void setLimite(int limite) {
        this.limite = limite;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //Métodos privados são usados para apoio da própria classe, já que só ela tem acesso a ele
    private boolean verificaSerasa(int quantidade){
        if(limite > quantidade){
            return true;
        }
        else
            return false;
    }

    void sacar(int quantidade){

        if(verificaSerasa(quantidade)) {
            if (saldo >= quantidade) {
                saldo -= quantidade;
                System.out.println("Saque realizado com sucesso!");
            } else {
                System.out.println("Saque não realizado!");
            }
        }
        else{
            System.out.println("Cliente sem limite disponivel!");
        }
    }


}
