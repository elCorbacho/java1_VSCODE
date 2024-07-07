/* **************BUCLES IF, SWITCH, WHILE, DO WHILE, FOR

            for (inicializacion; condicion; aumento o decremento) {
                    instrucciones;
                    }


 */


package C_Condicional_While;

import java.util.Scanner;

public class C_4_Ejercicio11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);


        int num, sum=0;
        long producto = 1;

        for(int i=1;i<=20;i+=2){
            System.out.println(i);
            producto *= i;

        }
        System.out.println(producto);
    }
}




