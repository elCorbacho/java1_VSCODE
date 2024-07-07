/* **************BUCLES IF, SWITCH, WHILE, DO WHILE, FOR

            for (inicializacion; condicion; aumento o decremento) {
                    instrucciones;
                    }
 */
package C_Condicional_While;
import java.util.Scanner;
public class C_3_For {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int contador;

        System.out.println("Digite entrada: ");
        contador = entrada.nextInt();

        for (int i=2; i<=contador; i+=2) {
            System.out.println(i);
        }
    }
}
