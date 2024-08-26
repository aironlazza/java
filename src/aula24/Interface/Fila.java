package aula24.Interface;

public class Fila implements Lista{
    private String[] elementos;
    private int tamanho;
    public Fila(){
        elementos = new String[10];
        tamanho=0;
    }
    @Override
    public void adiciona(String elemento) {
        elementos[tamanho] = elemento;
        tamanho++;
    }
    @Override
    public void remove() {
        if(tamanho>0){
            tamanho--;
            for(int i=0; i<tamanho; i++){
                elementos[i] = elementos[i+1];
            }
        }
    }
    @Override
    public String toString(){
        String retorno = "[";
        if(tamanho>0){
            for(int i=0; i<tamanho-1; i++){
                retorno += elementos[i] + " , ";
            }
            retorno += elementos[tamanho-1];
        }
        retorno += "]";
        return retorno;
    }
}
