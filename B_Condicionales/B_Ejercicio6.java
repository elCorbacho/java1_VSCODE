/*ejercicio 5
* <=40 Horas = 16 x hora
* >=40 horas = 16 x hora las 1ras 40 horas y 20 por cada hora extra
*
*  */



package B_Condicionales;

import javax.swing.*;

public class B_Ejercicio6 {
    public static void main(String[] args) {
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero: "));

        if (numero % 2 ==0) {
            JOptionPane.showMessageDialog(null, "El numero es par");
        }
        else {
            JOptionPane.showMessageDialog(null,"El numero no es par");
        }
    }
}
