/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diagramaVeiculos;

/**
 *
 * @author vinic
 */
public class TesteVeiculo {
    public static void main(String[] args) {
        Automovel carroVin = new Automovel();
        Motocicleta motoVin = new Motocicleta();
        
        System.out.println("=== AUTOMOVEL ===");
        carroVin.ligar();
        carroVin.acelerar(120);
        carroVin.frear(0);
        carroVin.desligar();
        carroVin.setAno(2010);
        carroVin.setValor(20000.00);
        System.out.println("Valor de venda à vista do carro é: "+ Veiculo.calcularValorVenda(carroVin));
        System.out.println("=== FIM AUTOMOVEL ===");
        
        System.out.println("=== MOTOCICLETA ===");
        motoVin.ligar();
        motoVin.acelerar(50);
        motoVin.frear(0);
        motoVin.desligar();
        motoVin.setChassi("102329");
        motoVin.setPlaca("EDX3123");
        motoVin.setValor(8000.00);
        System.out.println("Valor de venda a vista da moto é: "+ Veiculo.calcularValorVenda(motoVin));
        System.out.println("A placa da moto é: "+motoVin.getPlaca() + " e o chassi é: "+motoVin.getChassi());
    }
}
