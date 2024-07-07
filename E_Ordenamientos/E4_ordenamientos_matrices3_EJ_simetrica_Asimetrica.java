package E_Ordenamientos;

import javax.swing.*;
import java.util.Scanner;

public class E4_ordenamientos_matrices3_EJ_simetrica_Asimetrica {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matriz [][], nFilas, nCol;
        boolean simetrica = true;

        nFilas = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de filas: "));
        nCol = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de filas: "));

        matriz = new int[nFilas][nCol];

        System.out.println("Digite una matriz: ");

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

        if (nFilas == nCol) {
            int i,j;
            i=0;
            while(i<nFilas && simetrica == true) {
                j=0;
                while(j<i && simetrica == true) {
                    if (matriz [i][j] != matriz[j][i]) {
                        simetrica = false;

                    }
                    j++;
                }
                i++;
            }
            if (simetrica == true) {
                JOptionPane.showMessageDialog(null,"la matriz es simetrica");
            }
            else {
                JOptionPane.showMessageDialog(null,"la matriz no es simetrica");
            }
        }
        else {
            JOptionPane.showMessageDialog(null,"la matriz no es simetrica");
        }

    }
}






