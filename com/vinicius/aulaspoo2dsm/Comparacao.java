/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vinicius.aulaspoo2dsm;

import java.util.Scanner;

/**
 *
 * @author vinic
 */
public class Comparacao {
    public static void main(String[] args) {
        Scanner xxxx = new Scanner(System.in);
        
        int number1, number2;
        
        System.out.print("Digite o primeiro numero: ");
        number1 = xxxx.nextInt();
        System.out.print("Digite o segundo numero: ");
        number2 = xxxx.nextInt();
        
        if (number1 == number2){
            System.out.printf("%d e igual a %d%n", number1, number2);
        }
        if (number1 != number2){
            System.out.printf("%d e diferente de %d%n", number1, number2);
        }
        if (number1 <= number2){
            System.out.printf("%d e menor ou igual a %d%n", number1, number2);
        }
        if (number1 >= number2){
            System.out.printf("%d e maior ou igual a %d%n", number1, number2);
        }
        if (number1 > number2){
            System.out.printf("%d e maior que %d%n", number1, number2);
        }    
        if (number1 < number2){
            System.out.printf("%d e menor que %d%n", number1, number2);
        }  
    }
}
