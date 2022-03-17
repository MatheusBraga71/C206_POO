public class Main {

    public static void main(String[] args) {

        Conta conta = new Conta();

        conta.sacar(80);

        conta.sacar(100);

        System.out.println(conta.getSaldo());

    }
}
// Modificar o acesso de variáveis de classe é praticamente obrigatótio
// Por isso usaremos os getters e setters para os atributos privados das classes

// No UML o private é representado pelo sinal "-"