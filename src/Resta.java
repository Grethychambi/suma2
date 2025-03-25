import java.util.Scanner;

public class Resta {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer los datos de la consola
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el primer número
        System.out.println("Selecciona un número para la resta: ");
        int numero1 = scanner.nextInt();

        // Solicitar al usuario que ingrese el segundo número
        System.out.println("Selecciona un segundo número para la resta: ");
        int numero2 = scanner.nextInt();

        // Calcular la resta de los dos números
        int resta = numero1 - numero2;

        // Imprimir el resultado de la resta en la consola
        System.out.println("La resta de los dos números es: " + resta);
    }
}