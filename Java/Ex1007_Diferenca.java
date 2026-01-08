package Java;
import java.util.Scanner;

public class Ex1007_Diferenca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int valorA = scanner.nextInt();
        int valorB = scanner.nextInt();
        int valorC = scanner.nextInt();
        int valorD = scanner.nextInt();

        int diferenca = ((valorA * valorB) - (valorC * valorD));

        System.out.println("DIFERENCA = " + diferenca);

        scanner.close();
    }
}
