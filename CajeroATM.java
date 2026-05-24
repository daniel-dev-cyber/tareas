
import java.util.Scanner;

public class CajeroATM {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int intentos = 0;
        int pinCorrecto = 1234;
        double saldo = 1000;

        while (intentos < 3) {

            System.out.print("Ingrese PIN: ");
            int pin = sc.nextInt();

            if (pin == pinCorrecto) {

                System.out.println("1. Retirar");
                System.out.println("2. Consultar saldo");
                int op = sc.nextInt();

                switch (op) {

                    case 1:
                        System.out.print("Monto: ");
                        double monto = sc.nextDouble();

                        if (monto > saldo) {
                            System.out.println("Fondos insuficientes");
                        } else if (monto > 500) {
                            System.out.println("Excede límite diario");
                        } else {
                            saldo -= monto;
                            System.out.println("Retiro exitoso");
                            System.out.println("Nuevo saldo: " + saldo);
                        }
                        break;

                    case 2:
                        System.out.println("Saldo actual: " + saldo);
                        break;

                    default:
                        System.out.println("Opción inválida");
                }

                break; // salir del while si PIN es correcto

            } else {
                intentos++;
                System.out.println("PIN incorrecto");
            }
        }

        if (intentos == 3) {
            System.out.println("Cuenta bloqueada");
        }

        sc.close();
    }
}
