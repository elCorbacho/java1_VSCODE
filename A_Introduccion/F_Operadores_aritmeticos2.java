/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package A_Introduccion;

/**
 *
 * @author histo
 */

// Operador de incremento y decremento//
//---------------------------------------------------

public class F_Operadores_aritmeticos2 {
    public static void main(String[] args) {
        int x = 5;
        
         x ++; // X = X + 1 = x+=1
        
        System.out.println(x);
        
        int y = 5;
        y --; // y = y - 1 = x-=1
        System.out.println(y);
        
        int a = 5, b;
        b = a++;                    //primero asigna la A al B y luego causa la adicion
        System.out.println(b);
        System.out.println(a);
        
        int c = 5, d;
        d = ++c;                    //primero causa la adicion en C y luego se lo asigna a D
        System.out.println(d);

        int f = 5, g;
        g = --f;                    //primero causa la sustraccion en g y luego se lo asigna a f
        System.out.println(g);        
    }
    
}
