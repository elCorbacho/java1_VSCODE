/* **************BUCLES IF, SWITCH, WHILE, DO WHILE, FOR

            for (inicializacion; condicion; aumento o decremento) {
                    instrucciones;
                    }


 */


package C_Condicional_While;

import java.sql.SQLOutput;
import java.util.Scanner;

public class C_4_Ejercicio15 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int edad = 0, suma_edad = 0, contador18 = 0, contador_altura175 = 0;
        float altura = 0, suma_altura = 0, media_edad, media_altura;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Ingrese la edad: ");
            edad = entrada.nextInt();
            suma_edad += edad;
            System.out.println("Ingrese la altura: ");
            altura = entrada.nextFloat();
            suma_altura += altura;


            if (edad > 18) {
                contador18++;
            }

            if (altura > 1.75) {
                contador_altura175++;
            }
        }

        media_edad = (float) suma_edad / 5;
        media_altura = (float) suma_altura / 5;

            System.out.println("la media de edad es: " + media_edad);
            System.out.println("La media de altura es: " + media_altura);
            System.out.println("la cantidad de mayores de 18 es : "+contador18);
            System.out.println("la cantidad de personas con altura mayor a 1.75 es de: "+contador_altura175);
    }
}




