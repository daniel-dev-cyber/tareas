
import java.util.Scanner;

public class Estacionamiento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tipo = sc.nextInt();
        int horas = sc.nextInt();
        double tarifa = 0;

        switch (tipo) {
            case 1: tarifa = 2; break; // Moto
            case 2: tarifa = 5; break; // Auto
            case 3: tarifa = 10; break; // Camion
            default: System.out.println("Tipo inválido"); return;
        }

        double total = tarifa * horas;
        System.out.println("Total: " + total);
    }
}
