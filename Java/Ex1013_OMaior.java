package Java;
import java.util.Scanner;

public class Ex1013_OMaior {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int valorA = scanner.nextInt();
        int valorB = scanner.nextInt();
        int valorC = scanner.nextInt();

        int maiorDeDois = (valorA + valorB + Math.abs(valorA - valorB)) / 2;

        int maiorDeTres = (maiorDeDois + valorC + Math.abs(maiorDeDois - valorC)) / 2;

        System.out.println(maiorDeTres + " eh o maior");

        scanner.close();
    }
}
