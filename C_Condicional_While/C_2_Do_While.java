/* **CONDICIONAL WHILE
*
*       while (condición) {
               Instrucciones;
           }

 * WHILE se ejecuta siempre y cuando se cumpla la condición
 * DO WHILE se ejecuta siempre, primero se ejecutan las instrucciones al menos una vez, luego ejecuta el while siempre y cuando se cumplan las condiciones

        Ciclo do While
        *

        do {
            Instrucciones;

        }while (condición);

 */


package C_Condicional_While;


import java.util.Scanner;

public class C_2_Do_While {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int i = 1, a = 10, b=1, contador;

        System.out.println("Ingrese la cantidad a repetir");
        contador = entrada.nextInt();

        do {
            System.out.println(i);
            i++;

        } while (i <= 10);

        do {
            System.out.println(a);
            a--;

        } while (a>=1);

        do {
            System.out.println(b);
            b++;

        } while (b<=contador);
    }
}
