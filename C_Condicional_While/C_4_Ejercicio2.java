/* **************BUCLES IF, SWITCH, WHILE, DO WHILE, FOR

            for (inicializacion; condicion; aumento o decremento) {
                    instrucciones;
                    }


 */


package C_Condicional_While;

import java.util.Scanner;

public class C_4_Ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        double revisar, resultado;

        System.out.println("Ingrese el numero a revisar: ");
        revisar = entrada.nextInt();

        while (revisar !=0) {

                if (revisar >=1) {
                    System.out.println("el numero: "+revisar+" es positivo");

                }
                else if (revisar <=-1) {
                    System.out.println("el numero: "+revisar+" es negativo");
                }
            System.out.println("Ingrese el numero a revisar: ");
            revisar = entrada.nextInt();



        }
    }
}

