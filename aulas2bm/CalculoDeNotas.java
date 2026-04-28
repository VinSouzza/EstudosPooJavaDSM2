/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas2bm;

/**
 *
 * @author vinic
 */
public class CalculoDeNotas {
    public static void main(String[] args) {
        double nota1 = 7.5;
        double nota2 = 5.0;
        double nota3 = 8.0;
        
        double media = calcularMediaAritmetica(nota1,nota2,nota3);
        double maior = maiorNota(nota1,nota2,nota3);
        double menor = menorNota(nota1,nota2,nota3);
        String situacao = verificarSituacao(media);
        System.out.println("Média = "+media);
        System.out.println("Maior nota = "+maior);
        System.out.println("Menor nota = "+menor);
        System.out.println("Situação: "+situacao);
    }
    
    public static double calcularMediaAritmetica(double n1, double n2, double n3){
        return (n1 + n2 + n3) / 3.0;
    }
    
    public static double maiorNota(double n1, double n2, double n3){
        double maior = 0;
        if (n1 >= n2 && n1 >= n3){
            maior = n1;
        }else if(n2 >= n3 && n2 >= n1){
            maior = n2;
        }else{
            maior = n3;
        }
        
        return maior;
    }
    
    public static double menorNota(double n1, double n2, double n3){
        double menor = 0;
        if (n1 <= n2 && n1 <= n3){
            menor = n1;
        }else if(n2 <= n3 && n2 <= n1){
            menor = n2;
        }else{
            menor = n3;
        }
        
        return menor;
    }
    
    public static String verificarSituacao(double media){
        String resultado;
        if ( media >= 6.0){
            resultado = "Aprovado";
        }else{
            resultado = "Reprovado";
        }
        return resultado;
    }
}
