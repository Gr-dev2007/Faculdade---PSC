public class OperadoresAtribuicao {
    public static void main(String[] args) {
        int x = 10; // atribuição simples (=)
        System.out.println("Valor inicial de x: " + x);

        x += 5; // x = x + 5
        System.out.println("Depois de x += 5: " + x);

        x -= 2; // x = x - 3
        System.out.println("Depois de x -= 3: " + x);

        x *= 3; // x = x * 2
        System.out.println("Depois de x *= 2: " + x);

        x /= 5; // x = x / 4
        System.out.println("Depois de x /= 4: " + x);

        x %= 2; // x = x % 3
        System.out.println("Depois de x %= 3: " + x);
    }
}
