
import java.util.Scanner;

public class EvaluadorNumeros {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int num = sc.nextInt();

        // Positivo, negativo o cero
        if (num > 0) {
            System.out.println("Positivo");
        } else if (num < 0) {
            System.out.println("Negativo");
        } else {
            System.out.println("Cero");
        }

        // Par o impar
        if (num % 2 == 0) {
            System.out.println("Par");
        } else {
            System.out.println("Impar");
        }

        // Múltiplos
        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("Múltiplo de 3 y 5");
        } else if (num % 3 == 0) {
            System.out.println("Múltiplo de 3");
        } else if (num % 5 == 0) {
            System.out.println("Múltiplo de 5");
        } else {
            System.out.println("No es múltiplo de 3 ni de 5");
        }

        sc.close();
    }
}
