package Java;
import java.util.Scanner;

public class Ex1009_SalarioComBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nomeVendedor = scanner.next();
        double salarioFixo = scanner.nextDouble();
        double totalVendas = scanner.nextDouble();

        double salarioFinal = salarioFixo + ((totalVendas * 15) / 100);

        System.out.printf("TOTAL = R$ %.2f%n", salarioFinal);

        scanner.close();
    }
}
