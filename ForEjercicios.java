
import java.util.*;

public class ForEjercicios {
    public static void main(String[] args) {

        // 1. Tabla
        int n = 5;
        for (int i = 1; i <= 10; i++)
            System.out.println(n + " x " + i + " = " + (n * i));

        // 2. Suma pares
        int suma = 0;
        for (int i = 2; i <= 100; i += 2)
            suma += i;
        System.out.println("2. Suma: " + suma);

        // 3. Primos
        int cont = 0;
        for (int i = 2; i <= 50; i++) {
            boolean primo = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    primo = false;
                    break;
                }
            }
            if (primo) cont++;
        }
        System.out.println("3. Primos: " + cont);

        // 4. Serie exponencial
        int x = 2, res = 1;
        for (int i = 1; i <= 3; i++)
            res += Math.pow(x, i);
        System.out.println("4. Resultado: " + res);

        // 5. Triángulo
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < i; j++)
                System.out.print("*");
            System.out.println();
        }

        // 6. Promedio
        int[] arr = {10, 15, 20};
        suma = 0;
        for (int i = 0; i < arr.length; i++)
            suma += arr[i];
        System.out.println("6. Promedio: " + suma / arr.length);

        // 7. Mayor y menor
        int mayor = arr[0], menor = arr[0];
        for (int i : arr) {
            if (i > mayor) mayor = i;
            if (i < menor) menor = i;
        }
        System.out.println("Mayor: " + mayor + " Menor: " + menor);

        // 8. Número perfecto
        int num = 6, sum = 0;
        for (int i = 1; i < num; i++)
            if (num % i == 0) sum += i;
        System.out.println(sum == num ? "Perfecto" : "No");

        // 9. Vocales
        String txt = "Hola Mundo";
        int contV = 0;
        for (char c : txt.toLowerCase().toCharArray())
            if ("aeiou".indexOf(c) != -1) contV++;
        System.out.println("Vocales: " + contV);

        // 10. Factorial
        int fact = 1;
        for (int i = 1; i <= 5; i++)
            fact *= i;
        System.out.println("10. Factorial: " + fact);
    }
}
