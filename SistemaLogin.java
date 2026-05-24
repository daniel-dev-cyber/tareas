
import java.util.Scanner;

public class SistemaLogin {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String user = "admin";
        String pass = "1234";
        int intentos = 0;

        while (intentos < 3) {
            System.out.print("Usuario: ");
            String u = sc.next();

            System.out.print("Clave: ");
            String p = sc.next();

            if (u.equals(user) && p.equals(pass)) {
                System.out.println("Acceso permitido");
                break;
            } else {
                intentos++;
                System.out.println("Error");
            }
        }

        if (intentos == 3) {
            System.out.println("Cuenta bloqueada");
        }

        sc.close();
    }
}
