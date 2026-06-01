import java.util.*;

public class WhileEjercicios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Suma de dígitos
        int n = 123;
        int suma = 0;
        while (n > 0) {
            suma += n % 10;
            n /= 10;
        }
        System.out.println("1. Suma dígitos: " + suma);

        // 2. Número invertido
        n = 123;
        int inv = 0;
        while (n > 0) {
            inv = inv * 10 + n % 10;
            n /= 10;
        }
        System.out.println("2. Invertido: " + inv);

        // 3. Contar positivos
        int[] nums = {5, -2, 8, 0};
        int i = 0, cont = 0;
        while (nums[i] != 0) {
            if (nums[i] > 0) cont++;
            i++;
        }
        System.out.println("3. Positivos: " + cont);

        // 4. Fibonacci
        int a = 0, b = 1, j = 0;
        while (j < 5) {
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
            j++;
        }
        System.out.println();

        // 5. Adivinar número (simulado)
        int secreto = 50, guess = 30;
        while (guess != secreto) {
            if (guess < secreto) System.out.println("Mayor");
            else System.out.println("Menor");
            guess = 50;
        }

        // 6. Factorial
        n = 5;
        int fact = 1;
        while (n > 1) {
            fact *= n;
            n--;
        }
        System.out.println("6. Factorial: " + fact);

        // 7. Promedio notas
        double[] notas = {15, 18, 17};
        double sum = 0;
        i = 0;
        while (i < notas.length) {
            sum += notas[i];
            i++;
        }
        System.out.println("7. Promedio: " + (sum / notas.length));

        // 8. Menor número
        int[] arr = {7, 3, 9, 1};
        int menor = arr[0];
        i = 0;
        while (i < arr.length) {
            if (arr[i] < menor) menor = arr[i];
            i++;
        }
        System.out.println("8. Menor: " + menor);

        // 9. Decimal a binario
        n = 10;
        String bin = "";
        while (n > 0) {
            bin = (n % 2) + bin;
            n /= 2;
        }
        System.out.println("9. Binario: " + bin);

        // 10. Contraseña
        String clave = "1234", user = "0000";
        while (!user.equals(clave)) {
            user = "1234";
        }
        System.out.println("10. Acceso correcto");
    }
}
