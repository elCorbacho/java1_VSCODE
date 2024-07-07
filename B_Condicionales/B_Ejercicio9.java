/*ejercicio 5
* <=40 Horas = 16 x hora
* >=40 horas = 16 x hora las 1ras 40 horas y 20 por cada hora extra
*
*  */



package B_Condicionales;

import java.util.Scanner;

public class B_Ejercicio9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int d, m, y;
        System.out.println("\nDigite el dia: ");
        d = entrada.nextInt();
        System.out.println("\nDigite el mes: ");
        m = entrada.nextInt();
        System.out.println("\nDigite el año: ");
        y = entrada.nextInt();

        if (((d >=1) && (d<=30)) && ((m>=1) && (m<=12))) {
            System.out.println("la fecha: "+d+"-"+m+"-"+y+" es correcta");
        }
        else {
            System.out.println("la fecha: "+d+"-"+m+"-"+y+" es incorrecta");
        }


    }
}
