/* **************BUCLES IF, SWITCH, WHILE, DO WHILE, FOR

            for (inicializacion; condicion; aumento o decremento) {
                    instrucciones;
                    }


 */


package C_Condicional_While;

import java.util.Scanner;

public class C_4_Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, modulo;

        System.out.println("Ingrese el numero a revisar: ");
        numero = entrada.nextInt();

        while (numero != 0) {
            if (numero % 2 == 0) {
                System.out.println("el numero: " + numero + " es par");

            } else {
                System.out.println("el numero: " + numero + " es impar");
            }
            System.out.println("Ingrese el numero a revisar: ");
            numero = entrada.nextInt();
        }
    }
}


