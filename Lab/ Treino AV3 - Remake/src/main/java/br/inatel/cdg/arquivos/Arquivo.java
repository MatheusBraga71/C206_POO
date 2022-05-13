package br.inatel.cdg.arquivos;

import br.inatel.cdg.exceptions.PrecoNegativoException;
import br.inatel.cdg.jogos.Jogo;

import java.io.*;
import java.util.ArrayList;

public class Arquivo {

    public void escrever(Jogo jogo){

        OutputStream os = null;
        OutputStreamWriter osw = null;
        BufferedWriter bw = null;

        try{
            os = new FileOutputStream("Jogos.txt", true);
            osw = new OutputStreamWriter(os);
            bw = new BufferedWriter(osw);

            bw.write("Jogo");
            bw.newLine();
            bw.write(jogo.getNome() + "\n");
            bw.write(jogo.getPreco() + "\n");
            bw.write(jogo.getGenero() + "\n");

        } catch(Exception e){
            System.out.println(e);
        } finally{
            try{
                bw.close();
            } catch(Exception e){
                System.out.println(e);
            }
        }
    }

    public ArrayList<Jogo> ler(){

        InputStream is = null;
        InputStreamReader isr = null;
        BufferedReader br = null;
        String lerLinha;

        ArrayList<Jogo> acheiNoArquivo = new ArrayList<>();

        try{
            is = new FileInputStream("Jogos.txt");
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);

            lerLinha = br.readLine();// setando a posição inicial do arquivo

            while(lerLinha != null){
                if(lerLinha.contains("Jogo")){
                    Jogo aux = new Jogo();
                    aux.setNome(br.readLine());

                    try{
                        aux.setPreco(Double.parseDouble(br.readLine()));

                    } catch(PrecoNegativoException e){
                        e.printStackTrace();
                    }
                    aux.setGenero(br.readLine());

                    acheiNoArquivo.add(aux);
                }
                lerLinha = br.readLine(); // voltando o cursor para o início
            }

        } catch(Exception e){
            System.out.println(e);
        } finally{
            try{
                br.close();
            } catch(Exception e){
                System.out.println(e);
            }
        }
         return acheiNoArquivo;
    }
}
