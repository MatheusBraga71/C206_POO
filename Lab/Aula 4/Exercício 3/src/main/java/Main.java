public class Main {

    public static void main(String[] args) {

        //Criando um objeto do tipo Restaurante
        Restaurante restaurante = new Restaurante("123456","Av Principal", "Faminto");

        //Criação de um array objeto Fornecedor
        Fornecedor[] fornecedores = new Fornecedor[3];

        fornecedores[0] = new Fornecedor("Arroz", 5);
        fornecedores[1] = new Fornecedor("Feijão",4);
        fornecedores[2] = new Fornecedor("Carne", 3);

        //Agregação
        restaurante.fornecedores = fornecedores;

        restaurante.exibirInfos();

    }
}
