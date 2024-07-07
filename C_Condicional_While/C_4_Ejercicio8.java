/* **************BUCLES IF, SWITCH, WHILE, DO WHILE, FOR

            for (inicializacion; condicion; aumento o decremento) {
                    instrucciones;
                    }


 */


package C_Condicional_While;

import java.util.Scanner;

public class C_4_Ejercicio8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero = 1;

        System.out.println("Ingrese el numero: ");
        numero = entrada.nextInt();

        while (numero >= 0) {
            System.out.println("El numero es: "+numero+"\n");
            System.out.println("Ingrese el numero: \n");
            numero = entrada.nextInt();


        }
    }
}


