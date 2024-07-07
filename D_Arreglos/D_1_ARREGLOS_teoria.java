package D_Arreglos;

public class D_1_ARREGLOS_teoria {
    public static void main(String[] args) {

        // Un array o arreglo es una estructura de datos que permite almacenar conjunto de datos de un mismo tipo
        // No se puede cambiar durante la ejecuccion del programa
        // Tipo_de_variable[] nombre_del_array = new Tipo_de_variable[dimension]

        int [] edad = new int [4];
        long [] edad1 = new long [4];
        float [] estatura = new float [3];
        double [] estatura1 = new double [3];
        boolean [] estado = new boolean [5];
        char [] sexo = new char [2];
        String [] nombre = new String [2];

        //PARA DAR VALORES A UN ARREGLO

        int [] numeros = new int [3];
        numeros [0] = 5;
        numeros [1] = 7;
        numeros [2] = 9;

        //PARA DAR VALORES DE MANERA INMEDIATA A UN ARREGLO

        int[] numeros1 = {5,7,9};
        System.out.println(numeros1);

    }
}

