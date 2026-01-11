package Java;
import java.util.Scanner;

public class Ex1019_ConversaoDeTempo{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int segundos = scanner.nextInt();
        
        int minutos = segundos / 60;
        segundos = segundos % 60;
            
        int horas = minutos / 60;
        minutos = minutos % 60;
        
        System.out.println(horas + ":" + minutos + ":" + segundos);
        
        scanner.close();
    }
}
