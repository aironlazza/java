package aula22.Arquivos.Objetos;

import java.io.*;

public class Ler {
    public static void main(String[] args) {
        File arquivo = new File("C:\\Users\\Admin\\Documents\\Pessoa.db");
        try{
            ObjectInputStream leitura = new ObjectInputStream(new FileInputStream(arquivo.getAbsoluteFile()));
            System.out.println();
            Pessoa p = (Pessoa) leitura.readObject();
            System.out.println(p);
            p = (Pessoa) leitura.readObject();
            System.out.println(p);

        }
        catch(ClassNotFoundException e){
            System.out.println("classe não encontrada");
        }
        catch(FileNotFoundException err){
            System.out.println("arquivo não encontrado");
        }
        catch(IOException err){
            System.out.println("erro ao ler o arquivo");
        }
    }
}
