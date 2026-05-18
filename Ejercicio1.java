
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println("Positivo");
        } else if (num < 0) {
            System.out.println("Negativo");
        } else {
            System.out.println("Cero");
        }

        if (num % 2 == 0) {
            System.out.println("Par");
        } else {
            System.out.println("Impar");
        }
    }
}
