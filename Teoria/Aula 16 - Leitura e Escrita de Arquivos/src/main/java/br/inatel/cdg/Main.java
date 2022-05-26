package br.inatel.cdg;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Map<String, String> professores_disciplinas = new HashMap<>();

        try{
            Path arquivo = Paths.get("professores_disciplina.txt");
            List<String> conteudo = Files.readAllLines(arquivo);

            conteudo.forEach((linha ->{
                String[] linhaQuebrada = linha.split("="); // Método Split faz a quebra da linha
                professores_disciplinas.put(linhaQuebrada[0], linhaQuebrada[1]);
            }));

            professores_disciplinas.forEach((professor, disciplina) ->{
                System.out.println("Professor: " + professor);
                System.out.println("Disciplina: " + disciplina);
                System.out.println("");
            });
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}
