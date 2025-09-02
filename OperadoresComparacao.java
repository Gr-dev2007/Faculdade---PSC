import java.util.Scanner;

public class OperadoresComparacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de valores
        System.out.print("Digite o primeiro número inteiro: ");
        int a = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int b = scanner.nextInt();

        // Comparações
        System.out.println("\nResultados das comparações:");
        System.out.println(a + " == " + b + " ? " + (a == b));
        System.out.println(a + " != " + b + " ? " + (a != b));
        System.out.println(a + " > " + b + " ? " + (a > b));
        System.out.println(a + " < " + b + " ? " + (a < b));
        System.out.println(a + " >= " + b + " ? " + (a >= b));
        System.out.println(a + " <= " + b + " ? " + (a <= b));

        scanner.close();
    }
}
