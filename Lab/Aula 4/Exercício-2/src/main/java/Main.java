public class Main {

    public static void main(String[] args) {

        //Criação de um objeto Empresa
        Empresa empresa = new Empresa("123456789", "Av Principal");

        //Criação de um array objeto Contato
        Contato[] contatos = new Contato[5];

        //Instanciando os contatos
        contatos[0] = new Contato("Carlos", "ShaolinMAtadorDePorco@outlook.com", "(35)12345678", "12/14/1997");
        contatos[1] = new Contato("Marcos", "marquin@hotmail.com","(31)24242424","03/12/1995");
        contatos[2] = new Contato("Pedro","FlavinhoDoPneu@hotmail.com","(11)34567123","03/05/1998");

        empresa.contatos = contatos;

        empresa.exibirInfos();
    }
}
