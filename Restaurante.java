
import java.util.Scanner;

public class Restaurante {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1.Desayuno 2.Almuerzo 3.Cena");
        int op = sc.nextInt();

        switch (op) {
            case 1:
                System.out.println("1.Café $3 2.Pan $2");
                break;
            case 2:
                System.out.println("1.Pollo $10 2.Arroz $8");
                break;
            case 3:
                System.out.println("1.Sopa $6 2.Carne $12");
                break;
            default:
                System.out.println("Opción inválida");
        }
    }
}
