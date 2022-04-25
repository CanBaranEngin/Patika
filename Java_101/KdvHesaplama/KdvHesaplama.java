package Java_101.KdvHesaplama;
import java.util.Scanner;

public class KdvHesaplama {    
    public static void main(String[] args) {
        double Tutar;
        float kdv=0.18f;
        double kdvu=0.8;

        
        Scanner input = new Scanner(System.in);
        System.out.println("Tutar Giriniz:");
        Tutar = input.nextDouble();

        double kdvtut = (Tutar<1000) ? Tutar*kdv : Tutar*kdvu;

        System.out.print("Kdv'li tutar: ");
        System.out.println(Tutar+kdvtut);
        System.out.println("Kdv miktarı:"+kdvtut);

    }

    
}
