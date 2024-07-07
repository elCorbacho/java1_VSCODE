package D_Arreglos;

import java.util.Scanner;

public class D_3_ARREGLOS_ejercicio10_ARRAY_orden {

    /*Leer por teclado una serie de 10 numeros enteros.
    La aplicacion debe indicarnos si los numeros estan ordenados
    Forma creciente, forma decreciente, o si estan desordenados

     */

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a[];

        a = new int[10];

        boolean creciente = false, decreciente = false;


        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + ". Digite un numero: ");
            a[i] = entrada.nextInt();
        }
        for (int i = 0; i < 9; i++) {
            System.out.print(a[i] + " ");
            if (a[i] < a[i + 1]) { //CRECIENTE 1 2 3 4 5.....
                creciente = true;
            }
            if (a[i] > a[i + 1]) { //decreciente 6 5 4 3 2.....
                decreciente = true;
            }
        }
        if (creciente == true && decreciente == false) {
            System.out.println("El arreglo esta en forma creciente");
        }
        else if (creciente == false && decreciente == true) {
            System.out.println("El arreglo esta en forma decreciente");
        }
        else if (creciente == true && decreciente == true) {
            System.out.println("la serie esta desordenada");
        }
        else if (creciente == false && decreciente == false) {
            System.out.println("todos los numeros son iguales");
        }

    }
}

