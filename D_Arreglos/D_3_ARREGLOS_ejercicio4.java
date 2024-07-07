package D_Arreglos;

import java.util.Scanner;

public class D_3_ARREGLOS_ejercicio4 {

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

        int[] numeros = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + ". Digite un numero: ");
            numeros[i] = entrada.nextInt(); //Para guardar el primer carácter que encuentre
        }

        System.out.println(numeros[0] + ", " + numeros[9] + ", " + numeros[1] + ", " + numeros[8] + ", " + numeros[2]);
    }
}
