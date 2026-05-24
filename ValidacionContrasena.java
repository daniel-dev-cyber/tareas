
import java.util.Scanner;

public class ValidacionContrasena {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese contraseña: ");
        String clave = sc.next();

        if (clave.length() < 8) {
            System.out.println("Debe tener al menos 8 caracteres");
        } else if (!clave.matches(".*[A-Z].*")) {
            System.out.println("Falta una mayúscula");
        } else if (!clave.matches(".*\\d.*")) {
            System.out.println("Falta un número");
        } else if (!clave.matches(".*[^a-zA-Z0-9].*")) {
            System.out.println("Falta un símbolo");
        } else {
            System.out.println("Contraseña segura ✅");
        }

        sc.close();
    }
}
