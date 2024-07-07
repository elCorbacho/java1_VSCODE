/* **CONDICIONAL WHILE
*
*       while (condicion) {
               Instrucciones;
           }

 * WHILE se ejecuta siempre y cuando se cumpla la condición
 * DO WHILE se ejecuta siempre

 */


package C_Condicional_While;


import java.util.Scanner;

public class C_1_While {
    public static void main(String[] args) {
        int i=10, a=1, contador, c=1;
        Scanner entrada = new Scanner (System.in);

        while (i>=1) {
            System.out.println(i);
            i = i - 1;
                    }

        while (a>=10) {
            System.out.println(a);
            a = a + 1;
        }

        System.out.println("Indique cuantos numeros quiere por pantalla");
        contador = entrada.nextInt();

        while (c<=contador) {
            System.out.println(c);
            c = c+1;

        }


    }
}
