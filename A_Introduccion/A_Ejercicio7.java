package A_Introduccion;

import java.util.Scanner;

//...EJERCICIO 1 SUMA DE TRES NOTAS...//

public class A_Ejercicio7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double horas,semanas,dias,equivalente;


        System.out.println("Ingrese la cantidad de horas que desea calcular su equivalencia: ");
        horas = entrada.nextDouble();

        dias = horas/24;
        semanas = dias/7;

        System.out.println("Los dias equivalentes son: "+dias);
        System.out.println("Las semanas equivalentes son: "+semanas);
        
    }
}
