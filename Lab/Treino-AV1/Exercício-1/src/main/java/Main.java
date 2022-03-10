public class Main {

    public static void main(String[] args) {

        Plataforma p1 = new Plataforma();
        p1.nome = "Coleção boa";
        p1.criador = "Matheus";

        Jogo j1 = new Jogo();
        j1.nome = "Dying Light";
        j1.genero = "Sobrevivência";
        j1.preco = 150;
        j1.dlc  = true;

        Jogo j2 = new Jogo();
        j2.nome = "God of War";
        j2.genero = "RPG";
        j2.preco = 80;
        j2.dlc  = false;

        Jogo j3 = new Jogo();
        j3.nome = "Mortal Kombat";
        j3.genero = "Luta";
        j3.preco = 110;
        j3.dlc  = true;

        p1.adicionarJogo(j1);
        p1.adicionarJogo(j2);
        p1.adicionarJogo(j3);

        p1.mostraInfo();

        p1.mostraMaisCaroBarato();

        p1.calculaDlc();

    }
}
