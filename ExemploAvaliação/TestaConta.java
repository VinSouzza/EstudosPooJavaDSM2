/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExemploAvaliação;

/**
 *
 * @author vinic
 */
public class TestaConta {
    public static void main(String[] args) {
        Conta conta1 = new Conta();
        Conta conta2 = new Conta();
        
        conta1.inicializar(1, 100.0);
        conta2.inicializar(2, 50.0);
        
        System.out.println("Saldo inicial da conta 1: "+ conta1.getSaldo());
        System.out.println("Saldo inicial da conta 2: "+ conta2.getSaldo());
        
        conta1.depositar(50.0);
        System.out.println("Saldo apos deposito conta1: "+ conta1.getSaldo());

        conta1.saque(220.0);
        System.out.println("Saldo apos saque conta1: "+ conta1.getSaldo());
        
        conta1.transferir(30.0, conta2);
        
        System.out.println("Saldo de conta 1 apos a transferencia de conta 1 para conta 2: "+ conta1.getSaldo());
        System.out.println("Saldo de conta 21 apos a transferencia de conta 1 para conta 2: "+ conta2.getSaldo());
        
        
        
        
        
    }
}
