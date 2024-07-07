package D_Arreglos;

import java.util.Scanner;

public class D_3_ARREGLOS_ejercicio11_correcto {

    /*Leer 5 elementos numericos que se introduciran ordenados de forma creciente.
    estos los guardaremos en una tabla de tamaño 10
    Leer un numero N, e insertarlo en el lugar adecuado para que la tabla continue ordenada

     */

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] arreglo = new int[10];
        boolean creciente = true;
        int numero,sitio_num=0, j=0;


        System.out.println("Llenar el arreglo");

        do {
            for (int i = 0; i < 5; i++) {
                System.out.print((i + 1) + ". Digite un numero: ");
                arreglo[i] = entrada.nextInt();
            }

            //COMPROBAR SI ARREGLO ESTA ORDENADO EN FORMA CRECIENTE
            for (int i=0;i<4;i++) {
                if (arreglo [i] < arreglo [i+1]) { //creciente
                    creciente = true;
                }
                if (arreglo[i] > arreglo[i+1]) { //decreciente
                    creciente = false;
                    break;
                }
            }
            if (creciente == false) {
                System.out.println("\nEl arreglo no esta ordenado en forma creciente, vuelva a digitar\n");
            }


        } while (creciente == false);

        System.out.println("\nDigite un elemento a insertar: ");
        numero = entrada.nextInt();

        while(arreglo[j] < numero && j<5) { //para darnos cuentas en que posicion vamos a introducir el numero
            sitio_num++;
            j++;
        }

        //por ultimo vamos a trasladar una posicion en el arreglo a los elementos que van detras del numero

        for (int i=4;i>sitio_num;i--) {
            arreglo[i+1] = arreglo [i];
        }

        //insertamos el numero que el usuario puso
        arreglo[sitio_num] = numero;

        System.out.println("\nEl arreglo queda: ");
        for (int i=0;i<6;i++) {
            System.out.print(arreglo[i]+" ");
        }
        System.out.println();





    }
}

