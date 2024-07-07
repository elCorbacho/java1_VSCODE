/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package A_Introduccion;

/**
 *
 * @author histo
 */

// CLASE MATH//
//---------------------------------------------------

public class F_Operadores_aritmeticos3 {
    public static void main(String[] args) {
        double raiz = Math.sqrt(36.67);         //sqrt solo funciona con double
        System.out.println(raiz);
        
        double base = 5, exponente = 2;         //potencia
        double resultado = Math.pow(base, exponente);
        System.out.println(resultado);        
        
        double numero = 7.890;                  //redondear
        long resultado1 = Math.round(numero);
        System.out.println(resultado1);
        
        double numero1 = Math.random();         //numero aleatorio
        System.out.println(numero1);
        
    }
    
}
