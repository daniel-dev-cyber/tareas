
import java.util.Scanner;

public class Conversor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;
        double valor;

        System.out.println("1.M a KM  2.KM a M  3.C a F  4.F a C");
        op = sc.nextInt();
        System.out.print("Valor: ");
        valor = sc.nextDouble();

        switch (op) {
            case 1: System.out.println(valor / 1000); break;
            case 2: System.out.println(valor * 1000); break;
            case 3: System.out.println((valor * 9/5) + 32); break;
            case 4: System.out.println((valor - 32) * 5/9); break;
            default: System.out.println("Opción inválida");
        }
    }
}
