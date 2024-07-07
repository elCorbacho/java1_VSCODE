package D_Arreglos;

import java.util.Scanner;

public class D_3_ARREGLOS_ejercicio11_ {

    /*Leer 5 elementos numericos que se introduciran ordenados de forma creciente.
    estos los guardaremos en una tabla de tamaño 10
    Leer un numero N, e insertarlo en el lugar adecuado para que la tabla continue ordenada

     */

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] tabla = new int[10];

        for (int i = 0; i < 5; i++) {
            System.out.print((i + 1) + ". Digite un numero: ");
            tabla[i] = entrada.nextInt();
        }
        for (int i = 5; i < 10; i++) {
            System.out.print((i + 1) + ". Digite un numero para continuar con el array: ");
            tabla[i] = entrada.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            System.out.print((tabla[i]+" "));
        }








    }
}

