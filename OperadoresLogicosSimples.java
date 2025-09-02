import java.util.Scanner;

public class OperadoresLogicosSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entradas como booleanos
        System.out.print("Tem mais de 18 anos? (true/false): ");
        boolean maiorDeIdade = scanner.nextBoolean();

        System.out.print("Tem convite? (true/false): ");
        boolean temConvite = scanner.nextBoolean();

        System.out.print("É sócio VIP? (true/false): ");
        boolean socioVIP = scanner.nextBoolean();

        // Operadores lógicos
        boolean podeEntrar = (maiorDeIdade && socioVIP) || temConvite; // E + OU
        boolean naoPodeEntrar = !podeEntrar; // NÃO lógico

        // Saída
        System.out.println("\nResultados:");
        System.out.println("Pode entrar no clube? " + podeEntrar);
        System.out.println("Não pode entrar no clube? " + naoPodeEntrar);

        scanner.close();
    }
}
