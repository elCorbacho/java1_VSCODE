package D_Arreglos;

import java.util.Scanner;

public class D_3_ARREGLOS_ejercicio3_FORMA2 {

    /*Leer 5 numeros por teclado,
    almacenarlos en arreglo,
    realizar medio de los numeros positivos
    media de negativos
    contar numeros de ceros

     */


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int contadorpos = 0, sumapos = 0, contadorneg = 0, sumaneg = 0, contadorcero=0;
        float mediapos = 0, medianeg = 0;


        int[] numeros = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.println((i + 1) + ". Digite un numero: ");
            numeros[i] = entrada.nextInt(); //Para guardar el primer carácter que encuentre

            if (numeros[i] == 0) {
                contadorcero++;
            } else if (numeros[i] > 0) {
                sumapos += numeros[i];
                contadorpos++;
                mediapos = (float) sumapos / contadorpos;
            } else {
                sumaneg += numeros[i];
                contadorneg++;
                medianeg = (float) sumaneg / contadorneg;
            }
        }
        if (contadorpos > 0) {
            System.out.println("la media de los positivos es: " + mediapos + "\n");
        }
        if (contadorneg > 0) {
            System.out.println("la media de los negativos es: " + medianeg + "\n");
        }
        if (contadorcero > 0) {
            System.out.println("la cantidad de numeros con ceros es: " +contadorcero + "\n");

        }


        }
    }







