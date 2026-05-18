
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Usuario: ");
        String user = sc.next();

        System.out.print("Contraseña: ");
        int pass = sc.nextInt();

        if (user.equals("admin") && pass == 1234) {
            System.out.println("Acceso correcto");
        } else {
            System.out.println("Acceso denegado");
        }
    }
}
