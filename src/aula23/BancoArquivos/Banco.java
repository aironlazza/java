package aula23.BancoArquivos;

import java.io.*;
import java.util.Scanner;

public class Banco {
    static Scanner ler = new Scanner(System.in);
    public static void EscritaContasC(ContaCorrente[] lista){
        File pathC = new File("C:\\Users\\Admin\\Documents\\ContaC.db");
        try{
            ObjectOutputStream escrita = new ObjectOutputStream(new FileOutputStream(pathC.getAbsolutePath()));
            escrita.writeObject(lista);
            escrita.close();
        }
        catch(IOException err){
            System.out.println("erro ao criar o arquivo.");
        }
    }
    public static ContaCorrente[] LeituraContasC(){
        File pathC = new File("C:\\Users\\Admin\\Documents\\ContaC.db");
        ContaCorrente[] lista = new ContaCorrente[200];
        try{
            ObjectInputStream leitura = new ObjectInputStream(new FileInputStream(pathC.getAbsoluteFile()));
            ContaCorrente c;
            lista = (ContaCorrente[]) leitura.readObject();
            leitura.close();
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
        return lista;
    }
    public static void main(String[] args) {

        ContaCorrente[] lista = LeituraContasC();
        for(int i=0; i<2; i++){
            System.out.println(lista[i]);
        }
    }
}
