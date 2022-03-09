public class Deck {

    String dono;

    Carta[] cartas;

    public Deck(){
        cartas = new Carta[15];
    }

    void adicionarCarta(Carta carta){
        boolean flag = true;
        for(int i = 0; i < cartas.length; i++){
            if(cartas[i] == null && flag) {
                cartas[i] = carta;
                flag = false;
                System.out.println("Carta adicionada!");
            }
        }
        if(flag)
            System.out.println("Sem espaço no deck!");
    }

    void mostraInfo(){
        System.out.println("Dono do deck: " + dono);

        for (Carta carta : cartas) {
            if (carta != null)
                carta.mostraInfo();
        }
    }

    void calculaPoderMedio(){
        int total = 0;
        int qtdCartas = 0;
        float media;
        for (Carta carta : cartas) {
            if (carta != null) {
                total += carta.poder;
                qtdCartas++;
            }
        }
        media = (float)total/qtdCartas;

        System.out.println("O poder total das cartas é: " + total);
        System.out.println("O poder médio é: " + media);
    }

    void calculaClassificacao(){
        int qtdSoldado = 0;
        int qtdArqueiro = 0;
        int qtdPesado = 0;

        for (Carta carta : cartas) {
            if (carta != null) {
                if (carta.classificacao.equals("soldado"))
                    qtdSoldado++;
                else if (carta.classificacao.equals("arqueiro"))
                    qtdArqueiro++;
                else
                    qtdPesado++;
            }
        }

        System.out.println("Quantidade de soldados: " + qtdSoldado);
        System.out.println("Quantidade de arqueiros: " + qtdArqueiro);
        System.out.println("Quantidade de pesados: " + qtdPesado);
    }
}
