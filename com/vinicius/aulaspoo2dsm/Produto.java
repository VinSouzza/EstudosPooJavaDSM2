/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vinicius.aulaspoo2dsm;

/**
 *
 * @author vinic
 */
import java.util.Scanner;
public class Produto {
    public static void main(String[] args) {
        double numero1, numero2, numero3, produto;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Escreva o primeiro número decimal: ");
        numero1 = input.nextDouble();
        System.out.println("Escreva o segundo número decimal: ");
        numero2 = input.nextDouble();
        System.out.println("Escreva o terceiro número decimal: ");
        numero3 = input.nextDouble();
        
        produto = numero1 * numero2 * numero3;
        
        System.out.println("O resultado da multiplicação entre todos os números é: "+ produto);
    }
    
}
