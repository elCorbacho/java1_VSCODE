/* **************BUCLES IF, SWITCH, WHILE, DO WHILE, FOR

            for (inicializacion; condicion; aumento o decremento) {
                    instrucciones;
                    }


 */


package C_Condicional_While;

import java.util.Scanner;

public class C_4_Ejercicio19 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int nota, reprobados=0,condicionales=0, aprobados=0;



        for (int i = 1; i <= 6; i++) {
            System.out.println("Ingrese la nota numero: "+i);
            nota = entrada.nextInt();
                if (nota <4) {
                    reprobados++;
                }

                else if (nota ==4) {
                    condicionales++;
                }

                else {
                    aprobados++;
                }

        }

        System.out.println("la cantidad de aprobados es: "+aprobados+"\nLos condicionales son: "+condicionales+"\nLos reprobados son: "+reprobados);


    }
}
