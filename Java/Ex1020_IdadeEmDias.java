package Java;
import java.util.Scanner;

public class Ex1020_IdadeEmDias{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int dias = scanner.nextInt();
        
        int anos = dias / 365;
        dias = dias % 365;
        System.out.println(anos + " ano(s)");
            
        int meses = dias / 30;
        dias = dias % 30;
        System.out.println(meses + " mes(es)");
        
        System.out.println(dias + " dia(s)");
        
        scanner.close();
    }
}
