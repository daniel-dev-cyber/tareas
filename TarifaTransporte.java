
import java.util.Scanner;

public class TarifaTransporte {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Distancia (km): ");
        double distancia = sc.nextDouble();

        System.out.print("Tipo (estudiante / adulto / mayor): ");
        String tipo = sc.next();

        System.out.print("Horario (normal / nocturno): ");
        String horario = sc.next();

        double costo = distancia * 2; // tarifa base

        // Descuentos por tipo
        if (tipo.equals("estudiante")) {
            costo = costo * 0.5;
        } else if (tipo.equals("mayor")) {
            costo = costo * 0.6;
        }

        // Recargo nocturno
        if (horario.equals("nocturno")) {
            costo = costo * 1.2;
        }

        System.out.println("Costo final: " + costo);

        sc.close();
    }
}