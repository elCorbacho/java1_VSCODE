package E_Ordenamientos;

import java.util.Scanner;

public class E2_ordenamientos_insercion {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[], nElementos, pos, aux;

        System.out.println("Indique la cantidad de elementos: ");
        nElementos = entrada.nextInt();

        arreglo = new int[nElementos]; //asignamos el numero de elementos al arreglo

        System.out.println("Digite el arreglo: ");

        for (int i = 0; i < nElementos; i++) {
            System.out.println((i + 1) + ". Digite un numero: ");
            arreglo[i] = entrada.nextInt();
        }

        //Ordenamiento por insercion

        for (int i = 0; i < nElementos; i++) {
            pos = i;
            aux = arreglo[i];

            while ((pos > 0) && (arreglo[pos - 1] > aux)) {
                arreglo[pos] = arreglo[pos - 1];
                pos--;
            }

            arreglo[pos] = aux;
        }

        //----------------------------


        System.out.println("Orden ascendente: ");
        for (int i = 0; i < nElementos; i++) {
            System.out.print(arreglo[i] + " - ");
        }
        System.out.println("");

        System.out.println("Orden descendente: ");
        for (int i=(nElementos-1);i>=0;i--) {
            System.out.print(arreglo[i]+ " - ");
        }
    }
}



