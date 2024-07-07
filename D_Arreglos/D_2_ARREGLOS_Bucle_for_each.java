package D_Arreglos;

import javax.swing.*;
import java.util.Scanner;

public class D_2_ARREGLOS_Bucle_for_each {

    public static void main(String[] args) {
        String [] nombres = {"Andres","Maria","Luisa","Juan","Marcos","Roberto","Flor"};

        for (int i=0;i<5;i++) {   //metodo convencional para imprimir un array
            System.out.println(nombres[i]);
        }
        System.out.println("\n");

        for (int i=0;i<nombres.length;i++) {  // metodo mejorado para imprimir un arreglo para cuando no se elementos de un arreglo
            System.out.println(nombres[i]);
        }
        System.out.println("\n");

        for (String i:nombres) {  //METODO FOR EACH MEJORADO Y ESPECIFICO PARA ARREGLOS_______________________________
            System.out.println("Nombres: "+i); //            System.out.println(i);
        }

    }
}




