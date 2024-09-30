package SegundoTrimestre.aula22.Arquivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LerArquivo {
    public static void main(String[] args) {
        String path = "C:/Users/Admin/Documents/teste.txt";
        try{
            BufferedReader arquivo = new BufferedReader(new FileReader(path));
            String texto = "";
            String linha = "";
            while(linha != null){
                linha = arquivo.readLine();
                if(linha != null)
                    texto+=linha + '\n';
            }
            System.out.println(texto);
        }
        catch(IOException e){
            System.out.println("Não foi possível acessar o arquivo");
        }
    }
}
