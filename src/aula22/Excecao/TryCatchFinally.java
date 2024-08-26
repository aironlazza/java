package aula22.Excecao;

import java.util.InputMismatchException;

import java.util.Scanner;

public class TryCatchFinally {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        boolean erro;
        do{
            erro = false;
            try{
                System.out.print("Digite um número: ");
                int n1 = ler.nextInt();
                System.out.print("Digite outro número: ");
                int n2 = ler.nextInt();
                int result = n1/n2;
                System.out.println(n1 + " / " + n2 + " = " + result);
            }
            catch(ArithmeticException err){
                System.out.println("ERRO: O divisor deve ser diferente de zero.");
                erro = true;
            }
            catch(InputMismatchException err){
                System.out.println("ERRO: Os valores inseridos devem ser números inteiros.");
                ler.next();
                erro = true;
            }
            catch(Exception e){
                System.out.println("ERRO: Algo deu errado");
                erro = true;
            }
//            finally{
//                //sempre é executado
//            }
        }
        while(erro);


    }
}
