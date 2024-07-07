package E_Ordenamientos;

public class E4_ordenamientos_matrices5_EJ_diagonal1resto0 {
    public static void main(String[] args) {

        int[][] matriz = new int[7][7];

        int num = 0;

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (i == j) {
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = 0;
                }
            }
        }

        System.out.println("Matriz final");
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(matriz[i][j]+"  ");
            }
            System.out.println("");
        }

    }
}






