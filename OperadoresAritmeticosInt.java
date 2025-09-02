import java.util.Scanner;

public class OperadoresAritmeticosInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de valores
        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int num2 = scanner.nextInt();

        // Operações
        int soma = num1 + num2;
        int subtracao = num1 - num2;
        int multiplicacao = num1 * num2;
        int divisao = num1 / num2; // divisão inteira
        int resto = num1 % num2;
        int potencia = (int) Math.pow(num1, num2); // casting para int

        // Saída
        System.out.println("\nResultados das operações:");
        System.out.println(num1 + " + " + num2 + " = " + soma);
        System.out.println(num1 + " - " + num2 + " = " + subtracao);
        System.out.println(num1 + " * " + num2 + " = " + multiplicacao);
        System.out.println(num1 + " / " + num2 + " = " + divisao);
        System.out.println(num1 + " % " + num2 + " = " + resto);
        System.out.println(num1 + " ^ " + num2 + " = " + potencia);

        scanner.close();
    }
}
