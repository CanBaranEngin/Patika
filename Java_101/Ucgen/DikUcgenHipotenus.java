package Java_101.Ucgen;
import java.util.Scanner;


public class DikUcgenHipotenus {
    public static void main(String[] args) {
        int a, b;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("İlk dik kenarı giriniz: ");
        a= input.nextInt();
        System.out.print("İkinci dik kenarı giriniz: ");
        b= input.nextInt();

        double hip = Math.sqrt(Math.pow(a,2)+Math.pow(b, 2));
        System.out.println("Hipotenüs: " + hip);

        double Alan = a*b/2;
        System.out.println("Üçgenin Alanı: " + Alan);
        
    }
}
