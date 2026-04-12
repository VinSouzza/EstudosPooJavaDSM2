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
public class ParOuImpar {
        public static void main(String[] args) {
        System.out.println("Vinicin top da galera");
        Scanner scanner = new Scanner(System.in);
        
        int num1, num2, result;
        
        System.out.print("Digite um número: ");
        num1 = scanner.nextInt();
        num2 = 2;
        result = num1 % num2;
        if (result == 0) {
            System.out.print("O número digitado é par");
        }else{
            System.out.print("O número digitado é impar");
        }
        scanner.close();
    }
}
