import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine(); // Consome a quebra de linha após o número

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Meu nome é " + nome + " e eu tenho " + idade + " anos.");

        scanner.close();
    }
}
