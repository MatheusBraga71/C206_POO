package AV3.arquivos;

import AV3.exception.PrejuizoException;
import AV3.pedidos.Pedido;

import java.io.*;
import java.util.ArrayList;

public class Arquivo {

    // Escrita de dados no arquivo
    public void escrever(Pedido pedido){

        OutputStream os = null;
        OutputStreamWriter osw = null;
        BufferedWriter bw = null;

        try{
            os = new FileOutputStream("Pedidos.txt", true);
            osw = new OutputStreamWriter(os);
            bw = new BufferedWriter(osw);

            bw.write("Pedido");
            bw.newLine();
            bw.write(pedido.getId() + "\n");
            bw.write(pedido.getTipoMadeira() + "\n");
            bw.write( pedido.getPrecoProducao() + "\n");
            bw.write(pedido.getPrecoVenda() + "\n");

        }catch(Exception e){
            System.out.println(e);
        }finally {
            try{
                bw.close();
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }

    // Leitura de dados no arquivo
    public ArrayList<Pedido> ler(){

        InputStream is = null;
        InputStreamReader isr = null;
        BufferedReader br = null;
        String linhaLer;

        ArrayList<Pedido> found = new ArrayList<>();

        try{
            is = new FileInputStream("Pedidos.txt");
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);

            linhaLer = br.readLine();

            while (linhaLer != null) {
                if (linhaLer.contains("Pedido")) {
                    Pedido aux = new Pedido();
                    aux.setId(Integer.parseInt(br.readLine()));
                    aux.setTipoMadeira(br.readLine());
                    aux.setPrecoProducao(Double.parseDouble(br.readLine()));
                    try {
                        aux.setPrecoVenda(Double.parseDouble(br.readLine()));
                    } catch (PrejuizoException e) {
                        e.printStackTrace();
                    }
                    found.add(aux);
                }
                linhaLer = br.readLine();
            }
        }catch(Exception e){
            System.out.println(e);
        }finally {
            try{
                br.close();
            }catch(Exception e){
                System.out.println(e);
            }
        }
        return found;
    }
}
