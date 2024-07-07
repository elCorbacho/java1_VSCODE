/*ejercicio 1 */



package B_Condicionales;

import javax.swing.*;

public class B_Ejercicio2 {
    public static void main(String[] args) {

        int numero1,numero2;

        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero: "));

        if (numero1 > numero2) {
            JOptionPane.showMessageDialog(null,"El numero 1 es mayor al numero 2");
        }
        if (numero1 < numero2) {
            JOptionPane.showMessageDialog(null, "El numero 2 es mayor al numero 1");
        }
        else {
            JOptionPane.showMessageDialog(null,"el numero 1 y 2 son iguales");
        }
    }
}
