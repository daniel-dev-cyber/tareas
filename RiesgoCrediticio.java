
import java.util.Scanner;

public class RiesgoCrediticio {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingreso mensual: ");
        double ingreso = sc.nextDouble();

        System.out.print("Historial (bueno, regular, malo): ");
        String historial = sc.next();

        System.out.print("Edad: ");
        int edad = sc.nextInt();

        String riesgo;

        if (historial.equals("malo") || ingreso < 1000) {
            riesgo = "Alto";
        } else if (historial.equals("regular")) {
            if (ingreso >= 1000 && edad >= 25) {
                riesgo = "Medio";
            } else {
                riesgo = "Alto";
            }
        } else {
            if (ingreso >= 2000) {
                riesgo = "Bajo";
            } else {
                riesgo = "Medio";
            }
        }

        System.out.println("Riesgo: " + riesgo);
    }
}
