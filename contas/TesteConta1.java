/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contas;

import java.util.Scanner;

/**
 *
 * @author vinic
 */
public class TesteConta1 {
    public static void main(String[] args) {
        
        
        //Cria um objeto Scanner para obter entrada a partir da janela
        Scanner input = new Scanner(System.in);
        
        //cria um objeto Conta 1 e o atribui a minha conta 
        Conta1 minhaConta = new Conta1();
        
        System.out.printf("O nome inicial para name é: %s%n%n", minhaConta.getName());
       
        //solicita e lê o nome
        System.out.println("Por favor, entre com nome:");
        String nome = input.nextLine();
        
        minhaConta.setName(nome);
        
        System.out.printf("Agora o nome para name é: %s%n%n", minhaConta.getName());

    }
}
