package Java;
import java.util.Scanner;

public class Ex1008_Salario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroFuncionario = scanner.nextInt();
        int horasTrabalhadas = scanner.nextInt();
        double valorHora = scanner.nextDouble();

        double salario = horasTrabalhadas * valorHora;

        System.out.println("NUMBER = " + numeroFuncionario);
        System.out.printf("SALARY = U$ %.2f%n", salario);

        scanner.close();
    }
}
