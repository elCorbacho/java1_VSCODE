/*ejercicio 5
* <=40 Horas = 16 x hora
* >=40 horas = 16 x hora las 1ras 40 horas y 20 por cada hora extra
*
*  */



package B_Condicionales;

import javax.swing.*;

public class B_Ejercicio7 {
    public static void main(String[] args) {
        int numero1, numero2, numero3;
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero: "));
        numero3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tercer numero: "));

        if ((numero1 > numero2) && (numero2 > numero3)) {
            JOptionPane.showMessageDialog(null, "El orden es" + numero1 + "-" + numero2 + "-" + numero3);
        }
        if ((numero2 > numero1) && (numero2 > numero3)) {
            JOptionPane.showMessageDialog(null, "El orden es" + numero1 + "-" + numero2 + "-" + numero3);
        }
    }
}

