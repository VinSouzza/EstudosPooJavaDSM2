/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vinicius.aulaspoo2dsm;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author vinic
 */
public class AplicandoArrayList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList<>();
        
        double soma = 0.0;
        int quantidade = 0;
        double media = 0.0;
        int numArray = 0;
        System.out.println("Escreva a quantidade de numeros: ");
        quantidade = input.nextInt();
        
        for(int i = 0; i < quantidade; i++){
            System.out.println("Digite o "+(i+1)+"° numero: ");
            numArray = input.nextInt();
            array.add(numArray);
            soma += numArray;
            
            //array.add(input.nextInt());
            //soma += array.get(i);
        }
        
        for (int num : array){
            System.out.println(num);
        }
        
        media = soma / array.size();
        
        System.out.printf("%nA media e: %.2f", media);
    }
}
