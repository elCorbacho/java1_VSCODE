/* **************BUCLES IF, SWITCH, WHILE, DO WHILE, FOR

            for (inicializacion; condicion; aumento o decremento) {
                    instrucciones;
                    }


 */


package C_Condicional_While;

import java.util.Scanner;

public class C_4_Ejercicio17 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int articulo, litros, costolitro, fact_subtotal, fact_total=0, litros1=0, contador600=0;



        for (int i = 1; i <= 5; i++) {
            System.out.println("Factura numero: "+i+" - Ingrese el código del articulo: ");
            articulo = entrada.nextInt();

            System.out.println("Factura numero: "+i+" - Ingrese cantidad de litros vendidos: ");
            litros = entrada.nextInt();
                if (i==1) {
                    litros1 = litros;
                }

            System.out.println("Factura numero: "+i+" - Ingrese el precio por litro: ");
            costolitro = entrada.nextInt();

            fact_subtotal = litros * costolitro;
                if (fact_subtotal >=600) {
                    contador600++;
                }

            fact_total += fact_subtotal;

        }
        System.out.println("la facturación total es del: "+fact_total);
        System.out.println("La cantidad de litros vendidos del articulo 1 es: "+litros1);
        System.out.println("La cantidad de facturas por mas de 600 es de : "+contador600);


    }
}
