/* **************BUCLES IF, SWITCH, WHILE, DO WHILE, FOR

            for (inicializacion; condicion; aumento o decremento) {
                    instrucciones;
                    }


 */


package C_Condicional_While;

import java.sql.SQLOutput;
import java.util.Scanner;

public class C_4_Ejercicio16 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, mult;

        System.out.println("Ingrese el numero: ");
        numero = entrada.nextInt();

        for (int i = 1; i <= 10; i++) {
            mult=numero * i;
            System.out.println(+mult+"\n");
            System.out.println(numero + "x" + i+ "=" +mult );
        }
    }
}
