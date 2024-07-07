/* **************BUCLES IF, SWITCH, WHILE, DO WHILE, FOR

            for (inicializacion; condicion; aumento o decremento) {
                    instrucciones;
                    }


 */


package C_Condicional_While;

import java.util.Scanner;

public class C_4_Ejercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, aleatorio, contador = 0;
        aleatorio = (int) (Math.random()*100);
        System.out.println(aleatorio);

        do {
            System.out.println("Ingrese el numero para adivinar: ");
            numero = entrada.nextInt();

            if (aleatorio > numero ) {
                System.out.println("El el numero es menor");
            }
            else if (aleatorio < numero)  {
                System.out.println("El numero es mayor");
            }
            contador++;

        } while (numero != aleatorio);
        System.out.println("Adivinaste el numero aleatorio: "+aleatorio+" con un total de" +contador+ " intentos");
        }
    }


