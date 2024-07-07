/*Condicionales IF:

    if(condicion) {
        Instrucion1;
    }
    else{
        Instruccion2;
 */



package B_Condicionales;

import javax.swing.*;

public class A_Condicionales_IF {
    public static void main(String[] args) {

        int numero, dato = 10;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero a comparar: "));

        if (numero == dato) { //!= DESIGUALDAD O DISTINTO  / >, <, >=, <=
            JOptionPane.showMessageDialog(null,"El numero es 10");
        }
        else {
            JOptionPane.showMessageDialog(null,"el numero es diferente de 10");
        }
    }
}
