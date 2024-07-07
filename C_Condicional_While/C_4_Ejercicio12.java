/* **************BUCLES IF, SWITCH, WHILE, DO WHILE, FOR

            for (inicializacion; condicion; aumento o decremento) {
                    instrucciones;
                    }


 */


package C_Condicional_While;

import java.util.Scanner;

public class C_4_Ejercicio12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero;
        long factorial = 1;


        System.out.println("Ingrese un numero a factorizar: ");
        numero = entrada.nextInt();

        for(int i=1; i<=numero; i++) {
            factorial = factorial *i;
        }
        System.out.println(factorial);
    }
}




