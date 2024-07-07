package D_Arreglos;

public class D_1_ARREGLOS_teoria1 {

    public static void main(String[] args) {

        //COMO LLENAR ARREGLOS DE MANERA MANUAL
        //FORMA 1-----------------------------------------------------------
        int[] numeros = new int[3];

        numeros[0] = 7;
        numeros[1] = 10;
        numeros[2] = 13;

        System.out.println(numeros[0]); //imprime el indice 0

        for (int i = 0; i < 3; i++) {
            System.out.println(numeros[i]);
        }

        //FORMA 2-----------------------------------------------------------
        int[] numeros1 = {5, 7, 9, 10};

        for (int i = 0; i < 4; i++) {
            System.out.println(numeros1[i]);
        }
    }
}




