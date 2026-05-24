
import java.util.Scanner;

public class SistemaBecas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Promedio: ");
        double promedio = sc.nextDouble();

        System.out.print("Ingresos bajos (si/no): ");
        String ingresos = sc.next();

        System.out.print("Cursos desaprobados: ");
        int cursos = sc.nextInt();

        if (promedio >= 16 && ingresos.equals("si") && cursos == 0) {
            System.out.println("Beca completa");
        } else if (promedio >= 14 && (ingresos.equals("si") || cursos <= 1)) {
            System.out.println("Beca parcial");
        } else {
            System.out.println("No recibe beca");
        }

        sc.close();
    }
}
