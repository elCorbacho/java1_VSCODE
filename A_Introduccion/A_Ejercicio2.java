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


public class A_Ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float horas,salario,sum;
        
        System.out.println("Digite las horas semanales: ");
        horas = entrada.nextFloat();
        
        System.out.println("Digite salario por hora: ");
        salario = entrada.nextFloat();
                
        sum = horas * salario;
        
        System.out.println("\nSu salario semanal es: "+sum);
        
        
        
    }
}
