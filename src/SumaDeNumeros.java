import java.util.Scanner;
public class SumaDeNumeros {
    public static void main (String[] args){
// Crear un objeto Scaner para leer los datos de la consola
        Scanner scanner = new Scanner(System.in);
        System.out.println("Selecciona un número para la suma : ");
        int numero1 = scanner.nextInt();
// Solicitar al usuario que ingrese elprimer número
        System.out.println("Selecciona un segundo número para la suma : ");
        int numero2 = scanner.nextInt();
// Solicitar al usuario que ingrese el segundo número

        int suma = numero1 + numero2;
// Calcular la suma de los dos números
        System.out.println("La suma de los dos números es : " + suma);

    }
}



