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


public class A_Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float guillermo, luis, juan,total;
                       
        System.out.println("Indique el sueldo de guillermo: ");
        guillermo = entrada.nextFloat();
        
        luis = guillermo/2;
        juan = luis/2;
                  
        total = guillermo + luis + juan;
        
        System.out.println("\nLa suma de los tres salarios es: "+total);
        
        
        
    }
}
