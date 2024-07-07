/*ejercicio 1 */



package B_Condicionales;

import javax.swing.*;

public class B_Ejercicio3 {
    public static void main(String[] args) {

        char letra;

        letra = JOptionPane.showInputDialog("Ingrese una letra: ").charAt(0);


        if (Character.isUpperCase(letra)) {
            JOptionPane.showMessageDialog(null, "La letra es mayuscula");
        }
        else {
            JOptionPane.showMessageDialog(null,"la letra no es mayuscula");
        }
    }
}
