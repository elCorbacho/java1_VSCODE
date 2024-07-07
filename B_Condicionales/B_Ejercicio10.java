/* **CALCULADORA
*
*
*
*
* */




package B_Condicionales;

import javax.swing.*;
import java.util.Scanner;

public class B_Ejercicio10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        char OP,S,s,R,r,P,p,D,d;
        int resultado,n1,n2;

        System.out.println("\n...CALCULADORA V1...");
        System.out.println("\nIndique el primer numero: \n");
        n1 = entrada.nextInt();
        System.out.println("\nIndique la operación deseada: ");
        System.out.println("\nS: Suma\nR: Resta \nP: Multiplicación \nD: Division\n ");
        OP = entrada.next().charAt(0);
        System.out.println("\nIndique el segundo numero: ");
        n2 = entrada.nextInt();

        switch (OP) {
            case 's':
            case 'S':
                resultado = n1 + n2;
                System.out.println("la suma de: "+n1+"+"+n2+" es: "+resultado);
                break;

            case 'R':
            case 'r':
                resultado = n1 - n2;
                System.out.println("la resta de: "+n1+"-"+n2+" es: "+resultado);
                break;

            case 'p':
            case 'P':
                resultado = n1 * n2;
                System.out.println("la multiplicación de: "+n1+"*"+n2+" es: "+resultado);
                break;

            case 'd':
            case 'D':
                resultado = n1 / n2;
                System.out.println("la division de: "+n1+"/"+n2+" es: "+resultado);
                break;

            default:
                System.out.println("Operación incorrecta");
        }


    }
}
