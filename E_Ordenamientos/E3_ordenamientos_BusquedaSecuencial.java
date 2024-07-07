package E_Ordenamientos;

import java.util.Scanner;

public class E3_ordenamientos_BusquedaSecuencial {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[], nElementos, dato;
        boolean band = false;

        System.out.println("Indique la cantidad de elementos: ");
        nElementos = entrada.nextInt();

        arreglo = new int[nElementos]; //asignamos el numero de elementos al arreglo

        System.out.println("Digite el arreglo: ");

        for (int i = 0; i < nElementos; i++) {
            System.out.println((i + 1) + ". Digite un numero: ");
            arreglo[i] = entrada.nextInt();
        }

        System.out.println("Indique el dato que quiere buscar: ");
        dato = entrada.nextInt();


        //BUSQUEDA SECUENCIAL

        int i=0;
        while(i<nElementos && band == false) {
            if (arreglo[i] == dato) {
                band = true;

            }
            i++;
        }
        //=========================

        if(band == false) {
            System.out.println("El dato no se encontro en el arreglo");
        }
        else {
            System.out.println("eL numero ha sido encontrado en la posicion: "+(i-1));
        }


    }
}



