

public class Main {
    public static void main(String[] args) {
        //Criação de um objeto Deck
        Deck deck = new Deck();
        deck.dono = "Matheus";

        Carta c1 = new Carta();
        c1.nome = "Mago Negro";
        c1.poder = 10;
        c1.classificacao = "soldado";

        Carta c2 = new Carta();
        c2.nome = "Legolas";
        c2.poder = 12;
        c2.classificacao = "arqueiro";

        Carta c3 = new Carta();
        c3.nome = "Gimli";
        c3.poder = 15;
        c3.classificacao = "Pesado";

        Carta c4 = new Carta();
        c4.nome = "Aragorn";
        c4.poder = 21;
        c4.classificacao = "soldado";

        deck.adicionarCarta(c1);
        deck.adicionarCarta(c2);
        deck.adicionarCarta(c3);
        deck.adicionarCarta(c4);

        deck.mostraInfo();

        deck.calculaPoderMedio();

        deck.calculaClassificacao();

    }
}
