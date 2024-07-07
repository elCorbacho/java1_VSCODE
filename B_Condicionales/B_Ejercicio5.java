/*ejercicio 5
* <=40 Horas = 16 x hora
* >=40 horas = 16 x hora las 1ras 40 horas y 20 por cada hora extra
*
*  */



package B_Condicionales;

import javax.swing.*;

public class B_Ejercicio5 {
    public static void main(String[] args) {
        int horas,salario1,salario2,salario3,total;
        horas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de horas trabajadas: "));


        if (horas <= 40) {
            salario1 = horas * 16;
            JOptionPane.showMessageDialog(null, "Su sueldo por 40 o menos horas es de: "+salario1);
        }
        if (horas >40) {
            salario2 = (40 * 16) + ((horas - 40) * 20);
            JOptionPane.showMessageDialog(null,"Su sueldo por las 40 horas es de: "+salario2);
        }
    }
}
