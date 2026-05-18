
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c;
        System.out.print("Lado 1: "); a = sc.nextInt();
        System.out.print("Lado 2: "); b = sc.nextInt();
        System.out.print("Lado 3: "); c = sc.nextInt();

        if (a + b > c && a + c > b && b + c > a) {
            if (a == b && b == c) {
                System.out.println("Equilatero");
            } else if (a == b || b == c || a == c) {
                System.out.println("Isosceles");
            } else {
                System.out.println("Escaleno");
            }
        } else {
            System.out.println("No forma triangulo");
        }
    }
}
