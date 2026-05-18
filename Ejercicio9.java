
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double n1, n2, n3;
        System.out.print("Nota 1: "); n1 = sc.nextDouble();
        System.out.print("Nota 2: "); n2 = sc.nextDouble();
        System.out.print("Nota 3: "); n3 = sc.nextDouble();

        double prom = (n1 + n2 + n3) / 3;

        if (prom >= 11) {
            System.out.println("Aprobado");
        } else if (prom > 8) {
            System.out.println("Recuperacion");
        } else {
            System.out.println("Desaprobado");
        }
    }
}
