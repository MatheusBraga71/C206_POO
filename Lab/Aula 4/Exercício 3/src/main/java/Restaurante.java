public class Restaurante {

    String cnpj;
    String endereco;
    String nome;

    Restaurante(String cnpj, String endereco, String nome){
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.nome = nome;
    }

    Fornecedor[] fornecedores;

    void exibirInfos(){
        System.out.println("Nome do Restaurante: " + nome);
        System.out.println("CNPJ: " + cnpj);
        System.out.println("Endereço: " + endereco);

        System.out.println("\n" + "Contatos:");
        for(int i = 0; i < fornecedores.length; i++){
            if(fornecedores[i] != null){
                System.out.println("Tipo: " + fornecedores[i].tipo);
                System.out.println("Quantidade: " + fornecedores[i].quantidade + "\n");
            }
        }
    }
}
