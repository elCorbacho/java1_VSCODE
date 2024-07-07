/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package A_Introduccion;

import javax.swing.JOptionPane;

/**
 *
 * @author histo
 */
public class E_Entrada_salida_datos_joption {
    
    public static void main(String[] args) {  
        String cadena;
        int entero;
        char letra;
        double decimal;
        
        cadena = JOptionPane.showInputDialog("Digite una cadena: ");
        entero = Integer.parseInt(JOptionPane.showInputDialog("Digite entero: ")); //transforma el texto en un INTEGER con Integer.parseInt()
        letra = JOptionPane.showInputDialog("Ingrese un caracter: ").charAt(0);
        decimal = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un decimal: ")); //transforma el texto a un double con Double.parseDouble()
        
        JOptionPane.showMessageDialog(null, "La cadena es: "+cadena);
        JOptionPane.showMessageDialog(null, "El entero es: "+entero);
        JOptionPane.showMessageDialog(null, "El caracter es: "+letra);
        JOptionPane.showMessageDialog(null, "El decimal es: "+decimal);

        

        


    
    }
    
}