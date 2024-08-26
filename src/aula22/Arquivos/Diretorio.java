package aula22.Arquivos;

import java.io.File;

public class Diretorio {
    public static void main(String[] args) {
        File path = new File("C:\\Users\\Admin\\Documents\\PastaTeste");
        if(path.exists()){
            System.out.println("A pasta já existe");
        }
        else{
            System.out.println("A pasta 'PastaTeste' será criada");
            if(path.mkdirs())
                System.out.println("Pasta criada.");
            else
                System.out.println("não foi possível criar a pasta");
        }
    }
}
