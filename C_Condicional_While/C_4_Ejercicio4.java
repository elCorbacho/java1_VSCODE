/* **************BUCLES IF, SWITCH, WHILE, DO WHILE, FOR

            for (inicializacion; condicion; aumento o decremento) {
                    instrucciones;
                    }


 */


package C_Condicional_While;

import java.util.Scanner;

public class C_4_Ejercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, contador;
        contador = 0;

        System.out.println("Ingrese el numero a revisar: ");
        numero = entrada.nextInt();

        while (numero >= 0) {
            contador++;
            System.out.println("Ingrese el numero a revisar: ");
            System.out.println(("lleva un contador de : "+contador));
            numero = entrada.nextInt();
        }
    }
}


