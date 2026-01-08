package Java;
import java.util.Scanner;

public class Ex1003_SomaSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int valorA = scanner.nextInt();
        int valorB = scanner.nextInt();

        int soma = valorA + valorB;

        System.out.println("SOMA = " + soma);

        scanner.close();
    }
}
