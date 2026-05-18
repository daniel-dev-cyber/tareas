
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Contraseña numerica: ");
        int pass = sc.nextInt();

        if (pass > 1000 && pass < 9999) {
            System.out.println("Contraseña valida");
        } else {
            System.out.println("Contraseña invalida");
        }
    }
}
