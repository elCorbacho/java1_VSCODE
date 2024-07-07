package A_Introduccion;

import java.util.Scanner;


/**
 *
 * @author histo
 */

//ENTRADA DE DATOS -----------------Usuario digita datos y esto se guarda en una variabel

public class D_entrada_salida_datos {    
    
    public static void main(String[] args) {  
        Scanner doble = new Scanner(System.in);   //se importa modulo de entrada de datos se deja "instanciada"
        double numero;
        System.out.println("Digite los decimales: ");
        numero = doble.nextDouble();
        System.out.println("El resultado es: "+numero);
        
        Scanner cadena = new Scanner(System.in);
        String texto;
        System.out.println("Introduzca la cadena: ");
        texto = cadena.nextLine(); //next -->guarda el texto hasta que encuentra un espacio // con nextLine guarda el texto completo
        System.out.println("La cadena es: "+texto);

        Scanner caracter = new Scanner(System.in);
        char character;
        System.out.println("Introduzca el caracter: ");
        character = caracter.next().charAt (0);  //charAt guada hasta el primer caracter
        System.out.println("El caracter es: "+character);
        
        Scanner entero = new Scanner(System.in);   //Ingreso de variable entera
        int enteros;
        System.out.println("Digite un entero: ");
        enteros = entero.nextInt();
        System.out.println("El entero es: "+enteros);
    }
    
}
