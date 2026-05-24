
import java.util.Scanner;

public class ImpuestoProgresivo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingreso: ");
        double monto = sc.nextDouble();

        if (monto < 0) {
            System.out.println("Dato inválido");
        } else if (monto <= 1000) {
            System.out.println("Impuesto: " + (monto * 0.05));
        } else if (monto <= 5000) {
            System.out.println("Impuesto: " + (monto * 0.10));
        } else {
            System.out.println("Impuesto: " + (monto * 0.20));
        }

        sc.close();
    }
}
