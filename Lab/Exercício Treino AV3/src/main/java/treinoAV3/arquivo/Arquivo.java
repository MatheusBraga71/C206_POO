package treinoAV3.arquivo;

import treinoAV3.exceptions.PrecoNegativo;
import treinoAV3.jogos.Jogo;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Arquivo {

    private List<Jogo> ordenar = new ArrayList<>();

    public void escrever(Jogo jogo) {

        // Escrita dos dados em arquivo
        OutputStream os = null;
        OutputStreamWriter osw = null;
        BufferedWriter bw = null;

        try {
            os = new FileOutputStream("Jogos.txt", true);
            osw = new OutputStreamWriter(os);
            bw = new BufferedWriter(osw);

            bw.write("Jogo");
            bw.newLine();
            bw.write(jogo.getNome() + "\n");
            bw.write(jogo.getPreco() + "\n");
            bw.write(jogo.getGenero() + "\n");

        } catch (Exception e) {
            System.out.println(e);

        } finally {
            try {
                bw.close();

            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    // Leitura dos dados de um arquivo
    public ArrayList<Jogo> ler() {

        InputStream is = null;
        InputStreamReader isr = null;
        BufferedReader br = null;
        String lerLinha;

        ArrayList<Jogo> found = new ArrayList<>();

        try {
            is = new FileInputStream("Jogos.txt");
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);

            lerLinha = br.readLine();

            while (lerLinha != null) {
                if (lerLinha.contains("Jogo")) {
                    Jogo aux = new Jogo();
                    aux.setNome(br.readLine());
                    try {
                        aux.setPreco(Double.parseDouble(br.readLine()));
                    } catch (PrecoNegativo e) {
                        e.printStackTrace();
                    }
                    aux.setGenero(br.readLine());

                    found.add(aux);
                }
                lerLinha = br.readLine();
            }
        } catch (Exception e) {
            System.out.println(e);

        } finally {
            try {
                br.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        return found;
    }
}


