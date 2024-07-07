/* **CALCULADORA
*
*
*
*
* */




package B_Condicionales;

import java.util.Scanner;

public class B_Ejercicio11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int nota;

        System.out.println("\nIngrese la nota de 0 a 10 que obtuvo: ");
        nota = entrada.nextInt();

        if ((nota >=0) && (nota <=3)) {
            System.out.println("Su nota: " + nota + " Es insuficiente");
        }
        else if ((nota >=4) && (nota <=5)) {
            System.out.println("Su nota: " + nota + " Es suficiente");
        }
        else if ((nota >=6) && (nota <=7)) {
            System.out.println("Su nota: " + nota + " Es bien");
        }
        else if ((nota >=8) && (nota <=9)) {
            System.out.println("Su nota: " + nota + " Es notable");
        }
        else if (nota ==10) {
            System.out.println("Su nota: " + nota + " Es sobresaliente");
        }
        else {
            System.out.println("Nota ingresada incorrecta");
        }
    }
}
