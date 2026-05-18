
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Salario: ");
        double salario = sc.nextDouble();

        System.out.print("Años de trabajo: ");
        int años = sc.nextInt();

        if (años > 5 && salario < 2000) {
            System.out.println("Bono alto");
        } else if (años > 5 || salario < 2000) {
            System.out.println("Bono medio");
        } else {
            System.out.println("Sin bono");
        }
    }
}
