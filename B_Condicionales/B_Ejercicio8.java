/*ejercicio 5
* <=40 Horas = 16 x hora
* >=40 horas = 16 x hora las 1ras 40 horas y 20 por cada hora extra
*
*  */



package B_Condicionales;

import javax.swing.*;
import java.util.Scanner;

public class B_Ejercicio8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
            int n1, contador;
            System.out.println("DIGITE UN NUMERO ENTRE 0 Y 99,999 ");
            n1 = in.nextInt();

            if(n1 < 10){
                System.out.println("EL NUMERO TIENE 1 CIFRA");
            }
            else if(n1 < 100){
                System.out.println("EL NUMERO TIENE 2 CIFRAS");
            }
            else if(n1 < 1000){
                System.out.println("EL NUMERO TIENE 3 CIFRAS");
            }
            else if(n1 < 10000){
                System.out.println("EL NUMERO TIENE 4 CIFRAS");
            }
            else if(n1 < 100000){
                System.out.println("EL NUMERO TIENE 5 CIFRAS");
            }
            else{
                System.out.println("EL NUMERO ES MAYOR A LA CANTIDAD ACORDADA");
            }

        }
    }
