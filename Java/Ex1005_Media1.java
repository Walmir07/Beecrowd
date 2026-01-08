package Java;
import java.util.Scanner;

public class Ex1005_Media1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double notaA = scanner.nextDouble();
        double notaB = scanner.nextDouble();

        double pesoA = 3.5; 
        double pesoB = 7.5;

        double media = ((notaA * pesoA) + (notaB * pesoB)) / (pesoA + pesoB);

        System.out.printf("MEDIA = %.5f%n", media);

        scanner.close();
    }
}
