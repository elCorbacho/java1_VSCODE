/*ejercicio 1 */



package B_Condicionales;

import javax.swing.*;

public class B_Ejercicio1 {
    public static void main(String[] args) {

        int numero;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero a verificar: "));

        if (numero % 10 == 0) {
            JOptionPane.showMessageDialog(null,"El numero es multiplo de 10");
        }
        else {
            JOptionPane.showMessageDialog(null,"el numero no es multiplo de 10");
        }
    }
}
