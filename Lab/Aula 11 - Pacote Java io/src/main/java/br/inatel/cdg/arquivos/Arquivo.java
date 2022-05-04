package br.inatel.cdg.arquivos;

import br.inatel.cdg.funcionarios.Funcionario;

import javax.imageio.stream.FileCacheImageInputStream;
import java.io.*;
import java.lang.reflect.AccessibleObject;
import java.util.ArrayList;

public class Arquivo {

    // ESCRITA DE ARQUIVOS
    public void escrever(Funcionario funcionario) {

        OutputStream os = null;
        OutputStreamWriter osw = null;
        BufferedWriter bw = null;
        String linhaEscrever;

        try {
            //append true escreve abaixo do que tem no arquivo, false ele sobrescreve
            os = new FileOutputStream("Funcionarios.txt", true);
            osw = new OutputStreamWriter(os);
            bw = new BufferedWriter(osw);

            bw.write("Funcionario"); //especie de flag para a leitura
            bw.newLine();
            bw.write(funcionario.nome + "\n");
            bw.write(funcionario.idade + "\n");
            bw.write(funcionario.cpf + "\n");

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

    // LEITURA DE ARQUIVOS
    public ArrayList<Funcionario> ler(){

        InputStream is = null;
        InputStreamReader isr = null;
        BufferedReader br = null;
        String linhaLer; // String auxiliar para a leitura do arquivo

        ArrayList<Funcionario> acheiNoArquivo = new ArrayList<>();

        try{
            is = new FileInputStream("Funcionarios.txt");
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);

            linhaLer = br.readLine(); //Colocando o 'cursor' no início do arquivo

            while(linhaLer != null){ //Ler o arquivo enquanto tiver coisa pra ler
                if(linhaLer.contains("Funcionario")){
                    Funcionario aux = new Funcionario();
                    aux.nome = br.readLine();
                    aux.idade = Integer.parseInt(br.readLine()); //Converte a String para inteiro
                    aux.cpf = br.readLine();

                    acheiNoArquivo.add(aux);
                }
                linhaLer = br.readLine(); // Para voltar no inicio do arquivo novamente
            }

        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            try{
                br.close();
            }
            catch(Exception e){
                System.out.println(e);
            }
        }

        return acheiNoArquivo;
    }

}
