package Java;
import java.util.Scanner;

public class Ex1006_Media2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double notaA = scanner.nextDouble();
        double notaB = scanner.nextDouble();
        double notaC = scanner.nextDouble();

        double pesoA = 2.0;
        double pesoB = 3.0;
        double pesoC = 5.0;

        double media = ((notaA * pesoA)+(notaB * pesoB)+(notaC * pesoC)) / (pesoA+pesoB+pesoC);

        System.out.printf("MEDIA = %.1f%n", media);

        scanner.close();
    }
}
