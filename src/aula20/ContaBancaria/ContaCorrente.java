package aula20.ContaBancaria;

public class ContaCorrente extends Conta{
    public ContaCorrente(String titular, float limite){
        super(titular);
        this.limite = limite;
        saldo = 0;
        tipo = 'c';
    }
    private float limite;

    public boolean sacar(float valor){
        if(this.saldo + this.limite<valor)
            return false;
        else{
            this.saldo -= valor;
            return true;
        }
    }
    public String verificaSaldo(){
        return "Saldo atual: R$" + saldo + "\nLimite da conta: R$" + limite;
    }
}
