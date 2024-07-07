/* **************BUCLES IF, SWITCH, WHILE, DO WHILE, FOR

            for (inicializacion; condicion; aumento o decremento) {
                    instrucciones;
                    }


 */


package C_Condicional_While;

import java.util.Scanner;

public class C_4_Ejercicio10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, contador = 0, suma= 0;

        System.out.println("Ingrese el numero: ");
        numero = entrada.nextInt();

        while (contador <=10) {
            suma +=numero;
            contador++;
            System.out.println("variable numero es: "+numero);
            System.out.println("variable elementos es: "+contador);
            System.out.println("variable suma es: "+suma);
            System.out.println("Ingrese el numero: ");
            numero = entrada.nextInt();
        }

        int num, sum=0;

        for(int i=0;i<=9;i++){
            System.out.println("Escribe el numero "+(i+1));
            num=entrada.nextInt();
            sum+=num;
        }
        System.out.println("La suma de los numeros es: "+sum);
    }
}




