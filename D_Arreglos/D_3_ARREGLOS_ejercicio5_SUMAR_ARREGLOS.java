package D_Arreglos;

import java.util.Scanner;

public class D_3_ARREGLOS_ejercicio5_SUMAR_ARREGLOS {

    /*Leer 10 numeros enteros, guardarlos en un arreglo
    mostrarlos en orden
    primero
    ultimo
    segundo
    penultimo
    tercero

     */


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a[],b[],c[];

        a = new int [10];
        b = new int [10];
        c = new int [20];

        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + ". Digite un numero para la primera tabla: ");
            a[i] = entrada.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + ". Digite un numero para la segunda tabla: ");
            b[i] = entrada.nextInt();
        }

        int j = 0;

        for (int i = 0; i < 10; i++) {
            c[j] = a[i];
            j++;
            c[j] = b[i];
            j++;
        }

        System.out.println("\nEl tercer arreglo es: ");
        for (int i = 0; i < 20; i++) {
            System.out.print(c[i] + " ");
        }






    }
}
