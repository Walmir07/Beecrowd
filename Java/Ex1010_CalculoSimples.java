package Java;
import java.util.Scanner;

public class Ex1010_CalculoSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int codigo1 = scanner.nextInt();
        int quantidade1 = scanner.nextInt();
        double valor1 = scanner.nextDouble();

        int codigo2 = scanner.nextInt();
        int quantidade2 = scanner.nextInt();
        double valor2 = scanner.nextDouble();

        double valorTotal = quantidade1 * valor1 + quantidade2 * valor2;

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorTotal);

        scanner.close();
    }
}
