package D_Arreglos;

import java.util.Scanner;

public class D_3_ARREGLOS_ejercicio13_numerosPARimpar {

    /*Leer 5 elementos numericos que se introduciran ordenados de forma creciente.
    estos los guardaremos en una tabla de tamaño 10
    Leer un numero N, e insertarlo en el lugar adecuado para que la tabla continue ordenada

     */

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int tabla[] = new int[10];              //arreglo principal donde se guardarn los numeros introducidos por el usuario
        int contadorpares = 0;
        int contadorimpares = 0;


        for (int i = 0; i < 10; i++) {          //Bucle para guardar los numeros por teclado.
            System.out.print((i + 1) + ". Inserte un número: ");
            tabla[i] = entrada.nextInt();
            if (tabla[i] % 2 == 0) {
                contadorpares++;                //contador para dar el tamaño de números del arreglo de pares

            } else {
                contadorimpares++;              //contador para dar el tamaño de números del arreglo de impares
            }
        }

        int pares[] = new int[contadorpares];      //creacion de arreglo de pares con el tamaño del contador de pares
        int impares[] = new int[contadorimpares];   //creacion de arreglo de impares con el tamaño del contadores de impares

        contadorpares = 0;                            //se vuelve a cero para usarlo como contador de posicion en el arreglo de pares
        contadorimpares = 0;                          //se vuelve a cero para usarlo como contador de posicion en el arreglo de impares

        for (int i = 0; i < 10; i++) {                 //bucle para recorrer el arreglo de numeros por teclado
            if (tabla[i] % 2 == 0) {                //condicion para determinar posicion del arreglo que sea par
                pares[contadorpares] = tabla[i];    //en la posicion 0 del arreglo de pares se le asigna el valor de la posicion i del arreglo de numeros
                contadorpares++;                    //contador aumenta a 1 para que en siguiente bucle asigne el valor en la posicion siguiente
            }
            if (tabla[i] % 2 != 0) {
                impares[contadorimpares] = tabla[i];
                contadorimpares++;
            }
        }

        //**FORMA 1 PARA IMPRIMIR UN ARREGLO DETERMINADO
        System.out.print("Los numeros pares son: ");
        for (int i=0; i<contadorpares; i++) {
            System.out.print(pares[i]+ ", ");
        }

        System.out.println();

        System.out.print("Los numeros impares son: ");
        for (int i=0; i<contadorimpares; i++) {
            System.out.print(impares[i]+ ", ");
        }

        System.out.println();

        //**FORMA 2 PARA IMPRIMIR UN ARREGLO DETERMINADO
        System.out.print("Los numeros pares son: ");
        for (int i : pares) {                  //IMPRIME EL ARREGLO DE PARES
            System.out.print(i + ", ");
        }
        System.out.println();

        System.out.print("Los numeros impares son: ");
        for (int i : impares) {                //IMPRIME EL ARREGLO DE IMPARES
            System.out.print(i + ", ");
        }
    }
}

