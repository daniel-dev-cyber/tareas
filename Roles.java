
import java.util.Scanner;

public class Roles {
    public static void main(String[] args) {
        String rol = new Scanner(System.in).next().toUpperCase();

        switch (rol) {
            case "ADMIN":
                System.out.println("Acceso total");
                break;
            case "USER":
                System.out.println("Acceso parcial");
                break;
            case "GUEST":
                System.out.println("Solo lectura");
                break;
            default:
                System.out.println("Rol inválido");
        }
    }
}
