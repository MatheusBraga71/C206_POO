package br.inatel.cdg.banda;

import br.inatel.cdg.empresario.Empresario;
import br.inatel.cdg.membro.Membro;
import br.inatel.cdg.musica.Musica;

public class Banda {

    private String nome;
    private String genero;

    private Membro[] membros = new Membro[3];
    private Musica[] musicas = new Musica[5];

    private Empresario empresario;

    public void setEmpresario(Empresario empresario) {
        this.empresario = empresario;
    }

    public void mostraInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("Gênero: " + genero);

        System.out.println("Membros: ");
        for(int i = 0; i < membros.length; i++){
            if(membros[i] != null){
                System.out.println("Nome: " + membros[i].getNome() + ". Função: " + membros[i].getFuncao());
            }
        }

        System.out.println("Musicas: ");
        for(int i = 0; i < musicas.length; i++){
            if(musicas[i] != null){
                System.out.println("Nome: " + musicas[i].getNome() + ". Duração: " + musicas[i].getDuracao() + " minutos.");
            }
        }

        if(empresario != null){
            System.out.println("Nome do empresário: " + empresario.getNome());
            System.out.println("CNPJ do empresario: " + empresario.getCnpj());
        }
    }

    public void addMusicaNova(Musica musica){
        boolean flag = true;
        for(int i = 0; i < musicas.length; i++){
            if(musicas[i] == null && flag){
                musicas[i] = musica;
                flag = false;
            }
        }
    }

    public void addMembroNovo(Membro membro){
        boolean flag = true;
        for(int i = 0; i < membros.length; i++){
            if(membros[i] == null && flag){
                membros[i] = membro;
                flag = false;
            }
        }
    }

    public Banda(String nome, String genero){
        this.nome = nome;
        this.genero = genero;
    }
}
