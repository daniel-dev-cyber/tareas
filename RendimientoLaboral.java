
import java.util.Scanner;

public class RendimientoLaboral {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Puntualidad (0-10): ");
        int puntualidad = sc.nextInt();

        System.out.print("Productividad (0-10): ");
        int productividad = sc.nextInt();

        System.out.print("Cumplimiento (0-10): ");
        int cumplimiento = sc.nextInt();

        double promedio = (puntualidad + productividad + cumplimiento) / 3.0;

        if (promedio >= 9) {
            System.out.println("Excelente");
        } else if (promedio >= 7) {
            System.out.println("Bueno");
        } else if (promedio >= 5) {
            System.out.println("Regular");
        } else {
            System.out.println("Deficiente");
        }

        sc.close();
    }
}
