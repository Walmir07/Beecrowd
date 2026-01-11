package Java;
import java.util.Scanner;

public class Ex1017_GastoCombustivel{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int tempoGasto = scanner.nextInt();
        int velocidadeMedia = scanner.nextInt();
        
        double distanciaPerc = tempoGasto * velocidadeMedia;
        
        double litrosNecessarios = distanciaPerc / 12;
        
        System.out.printf("%.3f%n", litrosNecessarios);
        
        scanner.close();
    }
}