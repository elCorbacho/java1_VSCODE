/* **************BUCLES IF, SWITCH, WHILE, DO WHILE, FOR

            for (inicializacion; condicion; aumento o decremento) {
                    instrucciones;
                    }


 */


package C_Condicional_While;

import java.util.Scanner;

public class C_4_Ejercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, suma;
        suma = 0;

        System.out.println("Ingrese el numero a revisar: ");
        numero = entrada.nextInt();

        while (numero != 0) {
            suma = suma + numero;
            System.out.println("Ingrese el numero: ");
            System.out.println(("lleva un total sumado de: "+suma));
            numero = entrada.nextInt();
            }
        }
    }


