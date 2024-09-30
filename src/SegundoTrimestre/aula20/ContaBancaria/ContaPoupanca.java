package SegundoTrimestre.aula20.ContaBancaria;

public class ContaPoupanca extends Conta{
    public ContaPoupanca(String titular, float depositoInicial){
        super(titular);
        saldo = depositoInicial;
        tipo = 'p';
    }
    public boolean sacar(float valor){
        if(saldo<valor)
            return false;
        else{
            saldo-=valor;
            return true;
        }
    }
    public String verificaSaldo(){
        return "Saldo atual: R$" + saldo;
    }
}
