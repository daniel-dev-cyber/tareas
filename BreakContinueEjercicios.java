
public class BreakContinueEjercicios {
    public static void main(String[] args) {

        // 1. Salir al negativo
        for (int n : new int[]{5, 3, -1, 7}) {
            if (n < 0) break;
        }

        // 2. Solo impares
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) continue;
            System.out.print(i + " ");
        }
        System.out.println();

        // 3. Buscar número
        int[] arr = {5, 8, 3, 9};
        for (int x : arr) {
            if (x == 3) {
                System.out.println("Encontrado");
                break;
            }
        }

        // 4. Validar edad
        int[] edades = {-5, 0, 20};
        for (int e : edades) {
            if (e <= 0) continue;
            System.out.println("Edad válida: " + e);
            break;
        }

        // 5. Sumar positivos
        int suma = 0;
        for (int n : new int[]{5, -3, 4}) {
            if (n < 0) continue;
            suma += n;
        }
        System.out.println("Suma: " + suma);

        // 6. Primer múltiplo de 7
        for (int i = 1; i < 100; i++) {
            if (i % 7 == 0) {
                System.out.println(i);
                break;
            }
        }

        // 7. Límite suma
        suma = 0;
        for (int i = 1; i < 100; i++) {
            suma += i;
            if (suma > 50) break;
        }
        System.out.println(suma);

        // 8. Omitir múltiplos de 5
        for (int i = 1; i <= 50; i++) {
            if (i % 5 == 0) continue;
            System.out.print(i + " ");
        }
        System.out.println();

        // 9. Intentos clave
        String clave = "abc";
        String[] intentos = {"123", "abc"};
        for (String intento : intentos) {
            if (intento.equals(clave)) {
                System.out.println("Correcto");
                break;
            }
        }

        // 10. Filtrar caracteres
        String texto = "abc123";
        for (char c : texto.toCharArray()) {
            if (Character.isDigit(c)) continue;
            System.out.print(c);
        }
    }
}
