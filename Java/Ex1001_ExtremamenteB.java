package Java;
import java.util.Scanner;

public class Ex1001_ExtremamenteB {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int valorA = scanner.nextInt();
        int valorB = scanner.nextInt();

        int x = valorA + valorB;

        System.out.println("X = " + x);

        scanner.close();
    }

}
