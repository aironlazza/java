package SegundoTrimestre.aula24.JavaDoc;

/**
 * Classe que pode realizar algumas operações (matemáticas ou não).
 * @author Airon
 * @version 1.0
 *
 */
public class Operacoes {
    /**
     * Método que divide dois números inteiros.
     * @since a versão 1.0
     * @param n1 dividendo.
     * @param n2 divisor.
     * @return o resultado da divisão de n1 por n2.
     * @throws ArithmeticException caso o valor de n2 seja igual a 0.
     */
    public int divide(int n1, int n2)throws ArithmeticException{
        if(n2==0)
            throw new ArithmeticException("Não é possível dividir por 0");
        return n1 / n2;
    }

    /**
     * Método que concatena duas Strings.
     * @param s1 primeira String
     * @param s2 segunda String
     * @return a junção das duas Strings em uma só, separando-as por espaço.
     */
    public String soma(String s1, String s2){
        return s1 +" "+ s2;
    }
    public int Soma(int n1, int n2){
        return n1+n2;
    }
}
