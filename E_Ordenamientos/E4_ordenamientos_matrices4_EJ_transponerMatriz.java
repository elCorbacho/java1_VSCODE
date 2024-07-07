package E_Ordenamientos;

import javax.swing.*;
import java.util.Scanner;

public class E4_ordenamientos_matrices4_EJ_transponerMatriz {
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

        System.out.println("La matriz original es: ");
        for (int i=0; i<nFilas;i++) {
            for (int j=0; j<nCol;j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }

        //TRANSPONIENDO LA MATRIZ
        int aux;
        for (int i=0; i<nFilas;i++) {
            for (int j=0; j<i;j++) {
                aux= matriz [i][j];
                matriz [i][j] = matriz [j][i];
                matriz [j][i] = aux;
            }
        System.out.println("");
        }

        System.out.println("La matriz transpuesta es: ");
        for (int i=0; i<nFilas;i++) {
            for (int j=0; j<nCol;j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
    }
}






