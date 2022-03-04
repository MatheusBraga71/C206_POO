public class Main {

    // Um array de tipos primitivos guarda valores, um array de objetos guarda referências - array = vetor
    public static void main(String[] args) {

        Conta[] contas = new Conta[3];

        Conta c1 = new Conta();
        c1.saldo = 200;
        c1.nome = "Matheus";
        //c1.mostraInfo();

        contas[0] = c1;

        contas[2] = new Conta();
        contas[2].saldo = 20000;
        contas[2].nome = "Mateus";
        //contas[2].mostraInfo();

        for (int i = 0; i < contas.length; i++) //consegue acessar posições específicasa do vetor
        {
            if(contas[i]!=null)
                contas[i].mostraInfo();
        }

        for (Conta item : contas) { //for melhorado - para cada item do tipo Conta, ele soma um passo
            if (item != null)
                item.mostraInfo();
        } //não tem acesso a posições específicas do vetor
    }
}
