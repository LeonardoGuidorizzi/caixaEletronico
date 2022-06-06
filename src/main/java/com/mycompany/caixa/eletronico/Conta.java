
package com.mycompany.caixa.eletronico;


public class Conta {
    private String agencia = "ag-123" ;
    private String conta = "1234-5678";
    private double saldo = 10000;
    
    public double verificarSaldo(){
        return getSaldo();
        
    }
    public void realizarDeposito(double valorDeposito){
        
        //primeiro metodo this.saldo = this.saldo + valorDeposito;
        
        //segundo metodo this.saldo += valorDeposito;
        
        setSaldo(valorDeposito + getSaldo());
        
    }
    public void realizarSaque(double valorSaque){
        setSaldo(getSaldo() - valorSaque);
    }
    
    /*declaração dos métodos de get:*/
     public String getAgencia(){
         return agencia;
        
       }
       public String getConta(){
           return conta;
       }
       public double getSaldo(){
           return saldo;
       }
    /*Declaração dos métodos de set:*/
    /*métodos setAgencia*/
       public void setAgencia(String agencia){
           this.agencia = agencia;
       }
       /*métodos setConta*/
       public void setConta(String conta){
           this.conta = conta;
       }
       /*métodos setSaldo*/
       public void setSaldo(double saldo){
           this.saldo = saldo;
       }
}
