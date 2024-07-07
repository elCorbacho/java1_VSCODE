/* **CALCULADORA
*
*
*
*
* */

package B_Condicionales;

import java.util.Scanner;

public class B_Ejercicio12_cajero {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int op,saldo,ingreso,retiro,resultado;

        saldo = 1000;

        System.out.println("\n...BANCO DE SH1L3...");
        System.out.println("\nSu saldo inicial es de: "+saldo+"\n");
        System.out.println("\nIndique la operación deseada: ");
        System.out.println("\n1: Ingresar dinero a la cuenta\n2: Retirar dinero de la cuenta\n3: Salir de la aplicación\n");
        op = entrada.nextInt();
        System.out.println("\n");

        switch (op) {
            case 1: System.out.println("¿Cuanto dinero desea ingresar a su cuenta: \n");
                ingreso = entrada.nextInt();
                resultado = saldo + ingreso;
                System.out.println("Su nuevo saldo es: "+resultado);
                
            case 2: System.out.println("¿Cuanto dinero desea retirar de su cuenta: \n");
                retiro = entrada.nextInt();
                    if (retiro > saldo) {
                        System.out.println("Su saldo es insuficiente");
                    }
                    else {
                        resultado = saldo - retiro;
                        System.out.println("su nuevo saldo es: "+resultado);
                    }

            case 3: System.out.println("Saliendo de aplicación");
                break;

            default: System.out.println("Operación incorrecta");
        }


    }
}
