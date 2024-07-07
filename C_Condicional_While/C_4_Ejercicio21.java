/* **************BUCLES IF, SWITCH, WHILE, DO WHILE, FOR

            for (inicializacion; condicion; aumento o decremento) {
                    instrucciones;
                    }


 */


package C_Condicional_While;

import java.util.Scanner;

public class C_4_Ejercicio21 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, contadornegativo=0;



        for (int i = 1; i <= 10; i++) {
            System.out.println("Ingrese el numero: "+i);
            numero = entrada.nextInt();
                if (numero <0) {
                    contadornegativo++;
                }
        }

        System.out.println("Se han introducido un total de "+contadornegativo+" numeros negativos");

    }
}
