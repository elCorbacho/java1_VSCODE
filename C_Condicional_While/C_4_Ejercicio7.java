/* **************BUCLES IF, SWITCH, WHILE, DO WHILE, FOR

            for (inicializacion; condicion; aumento o decremento) {
                    instrucciones;
                    }


 */


package C_Condicional_While;

import java.sql.SQLOutput;
import java.util.Scanner;

public class C_4_Ejercicio7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, elementos = 0, suma= 0;
        float media;

        System.out.println("Ingrese el numero: ");
        numero = entrada.nextInt();

        while (numero >= 0) {
            suma +=numero;
            elementos++;
            System.out.println("variable numero es: "+numero);
            System.out.println("variable elementos es: "+elementos);
            System.out.println("variable suma es: "+suma);
            System.out.println("Ingrese el numero: ");
            numero = entrada.nextInt();
        if (elementos ==0) {
            System.out.println("la division por 0 no existe");
        }
        else {
            media = (float) numero/elementos;
            System.out.println("El promedio es: "+media);
        }


        }
    }
}


