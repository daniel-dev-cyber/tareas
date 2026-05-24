
import java.util.Scanner;

public class Calificacion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char nota = Character.toUpperCase(sc.next().charAt(0));

        switch (nota) {
            case 'A': System.out.println("Excelente"); break;
            case 'B': System.out.println("Bueno"); break;
            case 'C': System.out.println("Regular"); break;
            case 'D': System.out.println("Deficiente"); break;
            case 'F': System.out.println("Reprobado"); break;
            default: System.out.println("Letra inválida");
        }
    }
}
