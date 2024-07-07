package E_Ordenamientos;

import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class E4_ordenamientos_matrices1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //matrices tienen dos pares de corchetes

        int matriz[][], nFilas, nCol;   //manera manual de rellenar matriz

        nFilas = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de Filas: "));
        nCol = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de columnas"));

        matriz = new int[nFilas][nCol];

        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nCol; j++) {
                System.out.print("Matriz [" + i + "] [" + j + "]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }
        System.out.println("La matriz es: ");
        for (int i=0; i<nFilas;i++) {
            for (int j=0; j<nCol;j++) {
                System.out.print(matriz [i][j]);
            }
            System.out.println("");
        }
    }
}



