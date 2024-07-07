/* **************BUCLES IF, SWITCH, WHILE, DO WHILE, FOR

            for (inicializacion; condicion; aumento o decremento) {
                    instrucciones;
                    }


 */


package C_Condicional_While;

import java.util.Scanner;

public class C_4_Ejercicio14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int sueldo= 0, conteo=0, conteo1000=0, suma = 0;

        for(int i=1; i<=10; i++) {
            System.out.println("Ingrese el sueldo: ");
            sueldo = entrada.nextInt();
            conteo++;
            suma+=sueldo;
            if (sueldo >= 1000) {
                conteo1000++;
            }
        System.out.println("el sueldo total sumado es de : "+suma);
        if (conteo1000 >=1) {
            System.out.println("la cantidad de sueldos mayor a 1000 es de: "+conteo1000);
        }
        }


    }
}




