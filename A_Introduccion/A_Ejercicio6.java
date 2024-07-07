package A_Introduccion;

import java.util.Scanner;

//...EJERCIO 1 SUMA DE TRES NOTAS...//


public class A_Ejercicio6 {
    public static void main(String[] args) {
        
        double a,b,resultado;
         
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el valor de a: ");
        a = entrada.nextDouble();
        
        System.out.println("Ingrese el valor de b: ");
        b = entrada.nextDouble();
                
        resultado = Math.pow(a,2) + Math.pow(b,2) + (2*(a*b));
        
        System.out.println("El resultado del cuadrado de la suma de a + b es: "+resultado);
        
    }
}
