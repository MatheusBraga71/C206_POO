package br.inatel.cdg;

import br.inatel.cdg.banda.Banda;
import br.inatel.cdg.empresario.Empresario;
import br.inatel.cdg.membro.Membro;
import br.inatel.cdg.musica.Musica;

public class Main {

    public static void main(String[] args) {

        Banda banda = new Banda("Audioslave", "Hard Rock");

        Membro m1 = new Membro("Chris Cornell", "Vocalista");
        Membro m2 = new Membro("Tom Morello", "Guitarrista");

        Musica musica1 = new Musica("Like a Stone", 3.57);
        Musica musica2 = new Musica("Show me How to Live", 4.00);
        Musica musica3 = new Musica("Shadow on the Sun", 4.13);

        //Empresario e1 = new Empresario("Tim", 12356);
        //banda.setEmpresario(e1);

        banda.addMembroNovo(m1);
        banda.addMembroNovo(m2);

        banda.addMusicaNova(musica1);
        banda.addMusicaNova(musica2);
        banda.addMusicaNova(musica3);

        banda.mostraInfo();
    }
}
