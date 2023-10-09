/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;


public class Conta {
    private int numeroConta, senha;
    private String nomeCliente;
    private double saldo;
    
    public Conta(int numeroConta, int senha, String nomeCliente, double saldo){
        this.nomeCliente = nomeCliente;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.senha = senha;
    }
    
    public String getNomeCliente(){
        return nomeCliente;
    }
    
    public int getNumeroConta(){
        return numeroConta;
    }
    
    public double getSaldo(int senhaDigitada){
        if(senhaDigitada == senha){
            return saldo;
        }else{
            return -1;
        }
        
    }
    
    public boolean sacar(double valor, int senhaDigitada){
        if(senhaDigitada == senha && (valor > 0 && valor <= saldo)){
            saldo -= valor;
            return true;
        }else{
            return false;
        } 
        
    }
    
    public boolean depositar(double valor, int senhaDigitada){
        if(senhaDigitada == senha && valor > 0){
            saldo += valor;
            return true;
        }else{
            return false;
        }
        
    }
    public boolean tranferir(double valor, int senhaDigitada, Conta contaDestino){
        if(senhaDigitada == senha && (valor > 0 && valor <= saldo)){
            saldo -= valor;
            contaDestino.depositar(valor, senhaDigitada);
            return true;
        }else{
            return false;
        }
        
    }
}
