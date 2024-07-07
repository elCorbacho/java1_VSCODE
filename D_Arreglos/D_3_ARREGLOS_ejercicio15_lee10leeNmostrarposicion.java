package D_Arreglos;

import java.util.Scanner;

public class D_3_ARREGLOS_ejercicio15_lee10leeNmostrarposicion {

/*
Leer 10 enteros crecientemente
leer un numero N y buscarlo en la tabla
Se debe mostrar la posicion en que se encuentra
Si no esta indicarlo con mensaje


 */

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo1[] = new int[10];
        boolean creciente = true;
        int numero;
        int pos = 0;
        boolean estado = false;

        System.out.println("Datos del arreglo");
        //Llenado del primer arreglo arreglo
        do {
            for (int i = 0; i < 10; i++) {
                System.out.print((i + 1) + ". Digite un numero: ");
                arreglo1[i] = entrada.nextInt();
            }
            //Comprobar si el arreglo esta de forma creciente
            for (int i = 0; i < 9; i++) {
                if (arreglo1[i] < arreglo1[i + 1]) {//Ordenado de forma creciente 1-2-3...
                    creciente = true;
                }
                if (arreglo1[i] > arreglo1[i + 1]) {//Ordenado de forma decreciente 3-2-1...
                    creciente = false;
                    break;
                }
            }
            if (creciente == false) {
                System.out.println("El arreglo no esta en forma creciente, digite de nuevo los números");
            }
        } while (creciente == false);

        System.out.println("Digite el numero a buscar en la tabla: ");
        numero = entrada.nextInt();

        int i = 0;
        while (i<10 && arreglo1[i]<numero) {
            i++;
        }

        if (i==10) {
            System.out.println("numero no encontrado");
        }
        else {
            System.out.println("el numero se encuentra en la posicion: "+i);
        }





    }
}








