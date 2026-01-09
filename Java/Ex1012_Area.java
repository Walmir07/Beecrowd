package Java;
import java.util.Scanner;

public class Ex1012_Area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valorA = scanner.nextDouble();
        double valorB = scanner.nextDouble();
        double valorC = scanner.nextDouble();

        double triangulo = (valorA * valorC) / 2;
        double circulo = 3.14159 * Math.pow(valorC, 2);
        double trapezio = ((valorA + valorB) * valorC) / 2;
        double quadrado = valorB * valorB;
        double retangulo = valorA * valorB;

        System.out.printf("TRIANGULO: %.3f%n", triangulo);
        System.out.printf("CIRCULO: %.3f%n", circulo);
        System.out.printf("TRAPEZIO: %.3f%n", trapezio);
        System.out.printf("QUADRADO: %.3f%n", quadrado);
        System.out.printf("RETANGULO: %.3f%n", retangulo);

        scanner.close();
    }
}
