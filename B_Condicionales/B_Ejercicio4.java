/*ejercicio 1 */



package B_Condicionales;

import javax.swing.*;

public class B_Ejercicio4 {
    public static void main(String[] args) {
        double compra,total;
        compra = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de su compra: "));

        if (compra >= 300) {
            total = compra - (compra * 0.2);
            JOptionPane.showMessageDialog(null, "Con el descuento del 20% usted debe pagar: "+total);
        }
        else {
            JOptionPane.showMessageDialog(null,"El costo es de: "+compra);
        }
    }
}
