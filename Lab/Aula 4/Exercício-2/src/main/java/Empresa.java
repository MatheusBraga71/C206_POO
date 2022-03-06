public class Empresa {

    String cnpj;
    String endereco;

    Empresa(String cnpj, String endereco){
        this.cnpj = cnpj;
        this.endereco = endereco;
    }

    Contato[] contatos;

    void exibirInfos(){
        System.out.println("CNPJ: " + cnpj);
        System.out.println("Endereço: " + endereco);

        System.out.println("Contatos: ");
        for(int i = 0; i < contatos.length; i++) {
            if (contatos[i] != null) {
                System.out.println(contatos[i].nome);
                System.out.println(contatos[i].email);
                System.out.println(contatos[i].telefone);
                System.out.println(contatos[i].dataNascimento);
            }
            System.out.println("");
        }
    }
}
