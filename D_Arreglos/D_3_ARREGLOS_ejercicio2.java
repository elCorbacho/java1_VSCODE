package D_Arreglos;

import java.util.Scanner;

public class D_3_ARREGLOS_ejercicio2 {

    /*Leer 5 numeros guardarlos en un arreglo y mostrarlos en el orden reverso

     */


    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int [] numeros = new int [5];

        for (int i=0; i<5; i++) {
            System.out.println((i+1) + ". Digite un numero: ");
            numeros[i] = entrada.nextInt(); //Para guardar el primer carácter que encuentre
        }

        System.out.println("\nLos caracteres del arreglo son: ");

        for (int i=numeros.length -1;i>=0;i--) {  //MÉTODO FOR EACH MEJORADO Y ESPECIFICO PARA ARREGLOS_______________________________
            System.out.println(i); //            System.out.println(i);
        }


    }
}




