package A_Introduccion;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author histo
 */

import javax.swing.JOptionPane;
import java.util.Scanner;

//...EJERCIO 1 SUMA DE TRES NOTAS...//


public class A_Ejercicio1 {
    public static void main(String[] args) {
        int nota1,nota2,nota3,suma;
        
        nota1 = Integer.parseInt(JOptionPane.showInputDialog("Digite la nota 1: ")); //transforma el texto en un INTEGER con Integer.parseInt()
        nota2 = Integer.parseInt(JOptionPane.showInputDialog("Digite la nota 2: ")); //transforma el texto en un INTEGER con Integer.parseInt()
        nota3 = Integer.parseInt(JOptionPane.showInputDialog("Digitela nota 3: ")); //transforma el texto en un INTEGER con Integer.parseInt()   
        
        suma = nota1 + nota2 + nota3;
        
        JOptionPane.showMessageDialog(null, "la suma de las notas es: "+suma);

        
        
        Scanner entrada = new Scanner(System.in);
        float n1,n2,n3,sum;
        
        System.out.println("Digite las tres notas: ");
        n1 = entrada.nextFloat();
        n2 = entrada.nextFloat();
        n3 = entrada.nextFloat();
        
        sum = n1+n2+n3;
        
        System.out.println("Digite las tres notas: "+sum);
        
        
        
    }
}
