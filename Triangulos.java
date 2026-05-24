
import java.util.Scanner;

public class Triangulos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        if (a + b > c && a + c > b && b + c > a) {

            if (a == b && b == c)
                System.out.println("Equilátero");

            else if (a == b || a == c || b == c)
                System.out.println("Isósceles");

            else
                System.out.println("Escaleno");

        } else {
            System.out.println("No válido");
        }

        sc.close();
    }
}
