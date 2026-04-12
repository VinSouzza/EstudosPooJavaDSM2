package ExemploAvaliação;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author vinic
 */
public class Conta {
    private Integer numero;
    private Double saldo;
    
    public void inicializar(Integer numero, Double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }
    
    public Integer getNumero(){
        return numero;
    }

    public Double getSaldo() {
        return saldo;
    }
   
    
    public void depositar(Double valor){
        this.saldo += valor;
    }
    
    public void saque(Double valor){
        if (this.saldo < valor){
            System.out.println("Valor maior que o saldo atual, saque não realizado.");
        }else{
            this.saldo -= valor;
        }
    }
    
    public void transferir(Double valor, Conta contaDestino){
        this.saque(valor);
        contaDestino.depositar(valor);
    }
       
   
    
}
