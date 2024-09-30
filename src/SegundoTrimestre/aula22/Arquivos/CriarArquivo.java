package SegundoTrimestre.aula22.Arquivos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CriarArquivo {
    public static void main(String[] args) {
        String path = "C:/Users/Admin/Documents/teste.txt";
        try{
            BufferedWriter arquivo = new BufferedWriter(new FileWriter(path));
            for(int i=0; i<10; i++){
                arquivo.append("Linha " + i + " do arquivo\n");
            }
            arquivo.close();
        }
        catch(IOException e){
            System.out.println("Não foi possível acessar o arquivo");
        }
    }
}
