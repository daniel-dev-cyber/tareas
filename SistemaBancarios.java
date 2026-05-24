
import java.util.Scanner;

public class SistemaBancarios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double saldo = 1000;
        int opcion;

        do {
            System.out.println("\n1. Depositar\n2. Retirar\n3. Consultar saldo\n4. Salir");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Monto a depositar: ");
                    double dep = sc.nextDouble();
                    if (dep > 0) saldo += dep;
                    else System.out.println("Monto inválido");
                    break;

                case 2:
                    System.out.print("Monto a retirar: ");
                    double ret = sc.nextDouble();
                    if (ret <= 0) System.out.println("Monto inválido");
                    else if (ret > saldo) System.out.println("Saldo insuficiente");
                    else saldo -= ret;
                    break;

                case 3:
                    System.out.println("Saldo actual: " + saldo);
                    break;

                case 4:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida");
            }
        } while (opcion != 4);
    }
}
