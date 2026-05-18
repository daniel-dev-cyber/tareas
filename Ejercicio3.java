
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Monto: ");
        double monto = sc.nextDouble();

        System.out.print("Cliente VIP? (true/false): ");
        boolean vip = sc.nextBoolean();

        if (monto > 500 && vip) {
            System.out.println("Descuento 20%");
        } else if (monto > 500) {
            System.out.println("Descuento 10%");
        } else {
            System.out.println("Sin descuento");
        }
    }
}
