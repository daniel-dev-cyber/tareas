
import java.util.Scanner;

public class DiasSemana {
    public static void main(String[] args) {
        int dia = new Scanner(System.in).nextInt();

        switch (dia) {
            case 1: System.out.println("Lunes - Laborable"); break;
            case 2: System.out.println("Martes - Laborable"); break;
            case 3: System.out.println("Miércoles - Laborable"); break;
            case 4: System.out.println("Jueves - Laborable"); break;
            case 5: System.out.println("Viernes - Laborable"); break;
            case 6:
            case 7:
                System.out.println((dia == 6 ? "Sábado" : "Domingo") + " - Fin de semana");
                break;
            default: System.out.println("Número inválido");
        }
    }
}
