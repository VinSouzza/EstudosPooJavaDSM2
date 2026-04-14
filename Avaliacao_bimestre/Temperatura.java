/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Avaliacao_bimestre;

import java.util.Scanner;

/**
 *
 * @author vinic
 */
public class Temperatura {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = input.nextDouble();
        
        double F = celsius * 1.8 + 32;
        double K = celsius + 273.15;
        double Re = celsius * 0.8;
        double Ra = celsius * 1.8 + 32 + 459.67;
        
        System.out.printf("Fahrenheit: %.2f°F\n", F);
        System.out.printf("Kelvin: %.2fK\n", K);
        System.out.printf("Réaumur: %.2f°Re\n", Re);
        System.out.printf("Rankine: %.2f°Ra\n", Ra);
    }
}
