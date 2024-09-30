package SegundoTrimestre.aula20.ContaBancaria;

import java.util.Scanner;

public class Banco {
    static Scanner ler = new Scanner(System.in);
    public static void main(String[] args) {
        char opcMenu;
        ContaCorrente[] listaC = new ContaCorrente[5];
        ContaPoupanca[] listaP = new ContaPoupanca[5];
        int contC = 0;
        int contP = 0;
        do{
            System.out.println("Bem vindo(a). Selecione uma opção:");
            System.out.println("c - cadastrar uma conta");
            System.out.println("l - listar contas");
            System.out.println("e - entrar em uma conta");
            System.out.println("s - sair");
            System.out.print("->");
            opcMenu = ler.next().charAt(0);
            switch (opcMenu){
                case 'c'->{
                    System.out.println("Tipo de conta:");
                    System.out.println("c - corrente");
                    System.out.println("p - poupança");
                    System.out.print("->");
                    char tipo = ler.next().charAt(0);
                    System.out.println("Digite o nome do titular: ");
                    ler.nextLine();
                    String titular = ler.nextLine();
                    if(tipo == 'c'){
                        System.out.println("Valor do limite da conta: ");
                        ContaCorrente c1 = new ContaCorrente(titular, ler.nextFloat());
                        System.out.println("Defina a senha da conta: ");
                        c1.setSenha(ler.next());
                        System.out.println("Conta criada com sucesso.");
                        System.out.println("ID da conta: " + c1.getId());
                        listaC[contC++] = c1;
                    }
                    else if(tipo == 'p'){
                        System.out.print("valor do depósito inicial: ");
                        ContaPoupanca c1 = new ContaPoupanca(titular, ler.nextFloat());
                        System.out.println("Defina a senha da conta: ");
                        c1.setSenha(ler.next());
                        System.out.println("Conta criada com sucesso.");
                        System.out.println("ID da conta: " + c1.getId());
                        listaP[contP++] = c1;
                    }
                    else
                        System.out.println("Tipo de conta inválido;");
                }
                case 'l'->{
                    if(contC>0){
                        System.out.println("Contas Correntes:");
                        for(int i=0; i<contC; i++){
                            listaC[i].listarDados();
                            System.out.println();
                        }
                    }
                    if(contP>0){
                        System.out.println("Contas Poupança:");
                        for(int i=0; i<contP; i++){
                            listaP[i].listarDados();
                            System.out.println();
                        }
                    }
                }
                case 'e'->{
                    System.out.println("Digite o ID da conta: ");
                    boolean encontrado = false;
                    String id = ler.next();
                    for(int i=0; i<contC; i++){
                        if(listaC[i].getId().equals(id)){
                            encontrado = true;
                            ContaCorrente c1 = listaC[i];
                        }
                    }
                    if(encontrado){ //corrente

                    }
                    else{
                        for(int i=0; i<contP; i++){
                            if(listaP[i].getId().equals(id)){
                                encontrado = true;
                                ContaPoupanca c1 = listaP[i];
                            }
                        }
                        if(encontrado){ //poupança

                        }
                        else
                            System.out.println("Conta não encontrada;");
                    }
                }
            }
        }
        while(opcMenu!='s');
        System.out.print("Saindo.");
    }
    public static void acessarCorrente(ContaCorrente c1, String id){
        System.out.println("Conta encontrada: "+ c1.getTitular());
        System.out.println("Digite a senha da conta: ");
        if(c1.validaAcesso(id, ler.next())){
            char opcConta;
            do{
                System.out.println("Bem vindo(a), " + c1.getTitular());
                System.out.println("Saldo atual: " + c1.getSaldo());
                System.out.println("Selecione uma opção: ");
                System.out.println("s - sacar");
                System.out.println("d - depositar");
                System.out.println("t - trocar nome do titular");
                System.out.println("m - mudar senha");
                System.out.println("s - sair");
                System.out.print("->");
                opcConta = ler.next().charAt(0);
                switch (opcConta){
                    case 's'->{
                        System.out.println("Digite o valor para sacar: ");
                        if(c1.sacar(ler.nextFloat())){
                            System.out.println("Valor sacado com sucesso.");
                            System.out.println(c1.verificaSaldo());
                        }
                        else{
                            System.out.println("Saldo insuficiente.");
                            System.out.println(c1.verificaSaldo());
                        }

                    }
                    case 'd'->{
                        System.out.println("Digite o valor para depositar: ");
                        c1.depositar(ler.nextFloat());
                    }
                    case 't'->{
                        System.out.println("Nome atual: " + c1.getTitular());
                        System.out.println("Digite o novo nome do titular: ");
                        ler.nextLine();
                        c1.setTitular(ler.nextLine());
                    }
                }
            }
            while(opcConta!='s');
        }
        else
            System.out.println("Senha incorreta.");
    }
}
