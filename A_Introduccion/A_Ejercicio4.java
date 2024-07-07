package A_Introduccion;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author histo
 */

import java.util.Scanner;

//...EJERCIO 1 SUMA DE TRES NOTAS...//


public class A_Ejercicio4 {
    public static void main(String[] args) {
        double salario, comision, venta, total;
        
        salario = 1000;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de autos vendidos: ");
        comision = entrada.nextDouble();
      
        Scanner entrada1 = new Scanner(System.in);
        System.out.println("Ingrese el total de venta de automoviles: ");
        venta = entrada1.nextDouble();
        
        total = salario + (comision * 150) + (venta * 0.05);
        
        System.out.println("Su salario mensual es de: "+total);
        
    }
}
