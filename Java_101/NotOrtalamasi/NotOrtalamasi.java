package Java_101.NotOrtalamasi;
import java.util.Scanner;


public class NotOrtalamasi {    
    public static void main(String[] args) {
        double Mat, Fiz,Kim,Tur,Tar,Muz;
        Scanner input = new Scanner(System.in);

        System.out.println("Matematik notunuzu giriniz");
        Mat = input.nextDouble();

        System.out.println("Fizik notunuzu giriniz");
        Fiz = input.nextDouble();

        System.out.println("Kimya notunuzu giriniz");
        Kim = input.nextDouble();

        System.out.println("Türkçe notunuzu giriniz");
        Tur= input.nextDouble();

        System.out.println("Tarih notunuzu giriniz");
        Tar = input.nextDouble();

        System.out.println("Müzik notunuzu giriniz");
        Muz = input.nextDouble();

        double Ort = (Mat+Fiz+Kim+Tur+Tar+Muz)/6;

        System.out.println("Not ortalamanız:"+Ort);

        String GecmeDurum = (Ort>60) ? "Sınıfı Geçti":"Sınıfta Kaldı";
        System.out.println("Sınıfı Geçme Durumu:" +GecmeDurum);
       
   
    }
    
}