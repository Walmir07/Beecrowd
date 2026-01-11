package Java;
import java.util.Scanner;

public class Ex1014_Consumo{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int distanciaPerc = scanner.nextInt();
        double combustivelGasto = scanner.nextDouble();
        
        double consumoMedio = distanciaPerc / combustivelGasto;
        
        System.out.printf("%.3f km/l%n", consumoMedio);
        
        scanner.close();
    }
}
