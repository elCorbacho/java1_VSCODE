package D_Arreglos;
import java.util.Scanner;

public class D_3_ARREGLOS_ejercicio6_SUMAR_ARREGLOS {
    public static void main(String[] args) {

        int[] tablaA = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int[] tablaB = {13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24};

        // Crear la tabla C para mezclar los datos
        int[] tablaC = new int[24]; // Una tabla de 24 elementos para contener la mezcla

        // Mezclar las tablas A y B en la tabla C
        int indexC = 0; // Índice para la tabla C

        for (int i = 0; i < 12; i += 3) {
            // Agregar 3 elementos de la tabla A a la tabla C
            tablaC[indexC++] = tablaA[i];
            tablaC[indexC++] = tablaA[i + 1];
            tablaC[indexC++] = tablaA[i + 2];

            // Agregar 3 elementos de la tabla B a la tabla C
            tablaC[indexC++] = tablaB[i];
            tablaC[indexC++] = tablaB[i + 1];
            tablaC[indexC++] = tablaB[i + 2];
        }

        // Mostrar la tabla C mezclada
        System.out.println("Tabla C (Mezcla de Tabla A y Tabla B):");
        for (int value : tablaC) {
            System.out.print(value + " ");
        }
    }
}