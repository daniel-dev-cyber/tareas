
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Edad: ");
        int edad = sc.nextInt();

        if (edad >= 0 && edad <= 12) {
            System.out.println("Niño");
        } else if (edad <= 17) {
            System.out.println("Adolescente");
        } else if (edad <= 64) {
            System.out.println("Adulto");
        } else {
            System.out.println("Adulto mayor");
        }
    }
}
