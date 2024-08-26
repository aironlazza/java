package aula22.Arquivos.Objetos;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Escrever {
    public static void main(String[] args) {
        File arquivo = new File("C:\\Users\\Admin\\Documents\\Pessoa.db");
        try{
            //transforma arquivos em formato de objeto
            ObjectOutputStream escrita = new ObjectOutputStream(new FileOutputStream(arquivo.getAbsolutePath()));
            Pessoa p1 = new Pessoa(); //criando o objeto para escrever no arquivo
            p1.setNome("João");
            p1.setSobrenome("Borges");
            p1.setIdade(13);
            escrita.writeObject(p1); //escrevendo o objeto no arquivo
            System.out.println("Escrito com sucesso");
            Pessoa p2 = new Pessoa(); //criando o objeto para escrever no arquivo
            p2.setNome("Jo");
            p2.setSobrenome("Bo");
            p2.setIdade(14);
            escrita.writeObject(p2); //escrevendo o objeto no arquivo
            System.out.println("Escrito com sucesso");
            escrita.close();
        }
        catch(IOException err){
            System.out.println("erro ao criar o arquivo.");
        }
    }
}
