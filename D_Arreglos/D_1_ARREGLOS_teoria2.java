package D_Arreglos;

import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Scanner;

/*
BUSQUEDA SECUENCIA:

arreglo[] = {3,1,2,5,4}; dato = 2;


 */



public class D_1_ARREGLOS_teoria2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //COMO LLENAR ARREGLOS PIDIENDOLE A LOS USUARIOS
        //FORMA 1-----------------------------------------------------------

        int nElementos;
        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de elementos: "));

        char [] letras = new char [nElementos];

            System.out.println("Digite los elementos del arreglo: ");
            for (int i=0; i<nElementos; i++) {
                System.out.println((i+1) + ". Digite un carácter: ");
                letras[i] = entrada.next().charAt(0); //Para guardar el primer carácter que encuentre
            }

        System.out.println("\nLos elementos del arreglo son: ");

        for (int i=0; i<nElementos;i++) {
            System.out.println(letras [i]+" ");
        }
    }
}




