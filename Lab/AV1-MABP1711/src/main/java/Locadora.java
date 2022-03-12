//MATHEUS AUGUSTO BRAGA PIVOTO 1711

public class Locadora {

    String nome;
    String CNPJ;
    String endereco;
    int carrosParaAlugar = 0;

    Carro[] carros;

    public Locadora(){
        carros = new Carro[15];
    }

    void adicionarCarro(Carro carro){
        boolean adicionado = true;
        for(int i = 0; i < carros.length; i++){
            if(carros[i] == null && adicionado){
                carros[i] = carro;
                adicionado = false;
                carrosParaAlugar++;
                System.out.println("Carro adicionado!");
            }
        }
        if(adicionado)
            System.out.println("Sem espaço na locadora!");
    }

    void mostraInfo(){
        System.out.println("Nome da Locadora: " + nome );
        System.out.println("CNPJ da Locadora: " + CNPJ);
        System.out.println("Endereço da locadora: " + endereco);
        System.out.println("Carros para alugar: " + carrosParaAlugar);
        System.out.print("\n");

        for(int i = 0; i < carros.length; i++){
            if(carros[i] != null){
                carros[i].mostraInfo();
                carros[i].motor.mostraInfo();
            }
        }
    }

    void alugarCarro(int i){
        if(carros[i].alugado){
            System.out.println("Carro indisponível");
        }
        else {
            carros[i].alugado = true;
            System.out.println("Carro alugado com sucesso!");
        }
    }

    float contarCarrosParaAlugar(){
        int restante = carrosParaAlugar;
        int total = carrosParaAlugar;
        float conta;
        float percent; //percentual de carros disponíveis

        for(int i = 0; i < carros.length; i++){
            if(carros[i] != null && carros[i].alugado){
                restante--;
            }
        }
        conta = (float)restante / total; //verificar

        percent = (conta*100);

        System.out.println(conta);
        System.out.println(restante);
        System.out.println(total);

        return percent;
    }
}
