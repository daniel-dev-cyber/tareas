
import java.util.Scanner;

public class Logica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String op = sc.next().toUpperCase();
        boolean a = sc.nextBoolean();
        boolean b = sc.nextBoolean();

        switch (op) {
            case "AND": System.out.println(a && b); break;
            case "OR": System.out.println(a || b); break;
            case "XOR": System.out.println(a ^ b); break;
            default: System.out.println("Operador inválido");
        }
    }
}
