package E_Ordenamientos;

import java.sql.SQLOutput;
import java.util.Scanner;

public class E1_ordenamientos_burbuja {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[], nElementos, aux;

        System.out.println("Indique la cantidad de elementos: ");
        nElementos = entrada.nextInt();

        arreglo = new int[nElementos]; //asignamos el numero de elementos al arreglo

        for (int i = 0; i < nElementos; i++) {
            System.out.println((i + 1) + ". Indique el numero ");
            arreglo[i] = entrada.nextInt();
        }

        //METODO BURBUJA
        for (int i = 0; i < (nElementos - 1); i++) {
            for (int j = 0; j < nElementos - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {  //si numero actual es > a numero siguiente
                    aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;

                }
            }
        }
        //mostrando arreglo
        for (int i=0; i<nElementos;i++) {
            System.out.print(arreglo[i]+" - ");
        }
        System.out.println();

        for (int i=(nElementos-1); i>=0;i--) {
            System.out.print(arreglo[i]+ " - ");
        }
    }
}

