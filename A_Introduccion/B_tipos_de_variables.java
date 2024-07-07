package A_Introduccion;

/**
 *
 * @author histo
 */
public class B_tipos_de_variables {
    public static void main(String[] args) {
            System.out.println("hola pepe");

            byte bite = 12;
            System.out.println("Numero byte "+bite);

            short corto = 12456;
            System.out.println("Numero short "+corto);

            int entero = 1299995;
            System.out.println("Numero entero "+entero);

            long largo = 1299998985;
            System.out.println("Numero long "+largo);

            float decimal = 3.45f;  //se le indica con f que es float
            System.out.println("Numero float "+decimal);

            double decimal1 = 3.45989898;  //ocupan mucho mas memoria
            System.out.println("Numero decima double "+decimal1);

            //VARIABLES TIPO CARACTERES 

            char caracter = 'a';
            System.out.println("caracter: "+caracter);

            //VARIABLE TIPO BOOLEANDO 
            boolean decision = true;
            System.out.println("la desicion es: "+decision);

            //VARIABLE TIPO PRIMITIVO / NO PRIMITIVO

            //int numero = null;  //un dato tipo primitivo no puede almacenar datos vacios
            //System.out.println("Tipo de dato: "+numero);
            //NO PRIMITIVO permite almacenar valor null

            Integer numero = null;
            System.out.println("el dato primitivo: " +numero);

            //cadenas son tipo de dato no primitio STRING
            String palabra = "hola que tal esto es una cadena"; // Comilla simple se utiliza en 1 solo caracter '', para cadena se usa comilla dobel ""
            System.out.println(palabra);
   

        }
    }
//VARIABLE ENTERO

