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
public class TodasContas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        Conta1 primeiroObjeto = new Conta1();
        
        System.out.println("Digite o nome do primeiro objeto: ");
        String nome = entrada.nextLine();
        
        primeiroObjeto.setName(nome);
        
        System.out.println("Digite o nome do segundo objeto: ");
        Conta2 segundoObjeto = new Conta2(entrada.nextLine());
        
        System.out.printf("O nome de todos os objetos é %s %s", primeiroObjeto.getName(), segundoObjeto.getName());
    }
}
