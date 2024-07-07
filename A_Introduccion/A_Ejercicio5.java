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


public class A_Ejercicio5 {
    public static void main(String[] args) {
        double participacion, examen1, examen2, examenfinal, total;
         
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese su nota de participacion: ");
        participacion = entrada.nextDouble();
        
        System.out.println("Ingrese su nota del primer examen: ");
        examen1 = entrada.nextDouble();
 
        System.out.println("Ingrese su nota del segundo examen: ");
        examen2 = entrada.nextDouble();
        
        System.out.println("Ingrese su nota del examen final: ");
        examenfinal = entrada.nextDouble();
               
        total = (participacion*0.1) + (examen1 * 0.25) + (examen2 * 0.25) + (examenfinal * 0.40);

        System.out.println("Su nota final es: "+total);
        
    }
}
