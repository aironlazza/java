package SegundoTrimestre.aula20.ContaBancaria;

import java.util.Random;

public class Conta {
    public Conta(String titular){
        this.titular = titular;
    }
    private String titular;
    private String id = geraId();
    protected float saldo;
    private String senha;
    protected char tipo;
    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    private String geraId(){
        return "id" + new Random().nextInt(100,1000);
    }
    public String getId() {
        return id;
    }
    public float getSaldo() {
        return saldo;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public String listarDados(){
        return "Titular: " + titular + "\nID: " + id + "\nSaldo: " + saldo + "\n";
    }
    public void depositar(float valor){
        saldo += valor;
    }
    public boolean validaAcesso(String id, String senha){
        if(id.equals(this.id) && senha.equals(this.senha))
            return true;
        else
            return false;
    }
}
