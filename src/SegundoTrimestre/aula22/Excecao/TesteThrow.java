package SegundoTrimestre.aula22.Excecao;

import java.util.Scanner;

public class TesteThrow {

    public static void main(String[] args) {
        OperacoesThrow op = new OperacoesThrow();
        try{
            op.divisao(8,0);
        }
        catch(ArithmeticException err){
            System.out.println(err);
        }
    }
}
