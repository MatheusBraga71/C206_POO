public class Main {

    public static void main(String[] args) {

        Conta c = new Conta();
        c.saldo = 250;
        c.limite = 10;

        Cliente cliente = new Cliente(); //Criação de um objeto conta
        cliente.nome = "Matheus";
        cliente.idade = 20;
        cliente.cpf = "1234";

        c.cliente = cliente; //Agregação ---- Conta -> Cliente

        System.out.println(c.cliente.nome);


    }
}
