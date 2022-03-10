public class Plataforma {

    String nome;
    String criador;

    Jogo[] jogos;

    public Plataforma(){
        jogos = new Jogo[15];
    }

    void mostraInfo(){
        System.out.println("Nome da plataforma: " + nome);
        System.out.println("Criador da plataforma: " + criador);

        for (Jogo jogo : jogos) {
            if (jogo != null) {
                jogo.mostraInfo();
            }
        }
    }

    void adicionarJogo(Jogo jogo){
        boolean flag = true;
        for(int i = 0; i< jogos.length; i++){
            if(jogos[i] == null && flag){
                jogos[i] = jogo;
                flag = false;
                System.out.println("Jogo Adicionado!");
            }
        }
        if(flag)
            System.out.println("Sem espaço na plataforma!");
    }

    void mostraMaisCaroBarato(){
        Jogo caro = new Jogo();
        caro.preco = -1;

        Jogo barato = new Jogo();
        barato.preco = 1000;

        for(int i=0;i< jogos.length;i++){
            if(jogos[i] != null){
                if(jogos[i].preco > caro.preco) {
                    caro.nome = jogos[i].nome;
                    caro.preco = jogos[i].preco;
                }
                if(jogos[i].preco < barato.preco) {
                    barato.nome = jogos[i].nome;
                    barato.preco = jogos[i].preco;
                }
            }
        }
        System.out.println("Nome do jogo mais caro: " + caro.nome);
        System.out.println("Nome do jogo mais barato: " + barato.nome);
    }

    void calculaDlc(){
        int total = 0;
        for (Jogo jogo : jogos) {
            if (jogo != null) {
                if (jogo.dlc)
                    total++;
            }
        }
        System.out.println("Quantidade de jogos que possuem DLC: " + total);
    }
}
