
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1.Sumar 2.Restar 3.Multiplicar 4.Dividir 5.Potencia");
        int op = sc.nextInt();

        double a = sc.nextDouble();
        double b = sc.nextDouble();

        switch (op) {
            case 1: System.out.println(a + b); break;
            case 2: System.out.println(a - b); break;
            case 3: System.out.println(a * b); break;
            case 4:
                if (b == 0) System.out.println("Error: división por cero");
                else System.out.println(a / b);
                break;
            case 5: System.out.println(Math.pow(a, b)); break;
            default: System.out.println("Entrada inválida");
        }
    }
}
