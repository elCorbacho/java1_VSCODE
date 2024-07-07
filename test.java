import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        System.out.println("Bienvenido a la calculadora");
        int n1, n2, n3, suma;
        double resultado;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        n1 = sc.nextInt();
        System.out.println("Ingrese el segundo número: ");
        n2 = sc.nextInt();
        System.out.println("Ingrese el tercer número: ");
        n3 = sc.nextInt();
        suma = n1 + n2 + n3;
        resultado = suma / 3;
        System.out.println("La suma de los números es: " + suma);
    }

}