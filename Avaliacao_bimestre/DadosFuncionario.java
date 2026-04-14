/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Avaliacao_bimestre;

/**
 *
 * @author vinic
 */
public class DadosFuncionario {
    
    private int codigoFuncionario;
    private double salarioBruto;

    public int getCodigoFuncionario() {
        return codigoFuncionario;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public void setCodigoFuncionario(int codigoFuncionario) {
        this.codigoFuncionario = codigoFuncionario;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }
    
    public double calcularValeAlimentacao(){
        if (salarioBruto <= 2000.0){
            return 300.0;
        }
        return 0.0;
    }
}
