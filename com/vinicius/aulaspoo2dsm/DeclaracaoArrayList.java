/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vinicius.aulaspoo2dsm;

import java.util.ArrayList;

/**
 *
 * @author vinic
 */
public class DeclaracaoArrayList {
    public static void main(String[] args) {
        //criando uma array list sem definir o tamanho inicial
        
        ArrayList<String> lista = new ArrayList<>();
        
        //adicionando elementos à lista
        
        lista.add("Elemento 1");
        lista.add("Elemento 2");
        lista.add("Elemento 3");
        lista.add("Elemento 4");
        lista.add("Elemento 5");
        
        //imprimindo elementos da lista
        for (String str : lista){
            System.out.println(str);
        }
        //imprimindo a posição 0
        System.out.println("Apenas a posição 0: "+ lista.get(0));
        
        //imprimindo o tamanho da lista
        System.out.println("Tamanho da lista: "+ lista.size());
    }
}
