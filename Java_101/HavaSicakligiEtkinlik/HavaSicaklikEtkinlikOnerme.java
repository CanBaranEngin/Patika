package Java_101.HavaSicakligiEtkinlik;
import java.util.Scanner;


public class HavaSicaklikEtkinlikOnerme {
    public static void main(String[] args) {
        int sicaklik;
        Scanner input = new Scanner(System.in);
        System.out.print("Sıcaklık Değeri Giriniz: ");
        sicaklik=input.nextInt();

        if (sicaklik<5) {
            System.out.println("Kayak");
        }
        else if (5<=sicaklik && sicaklik<15 ) {
            System.out.println("Sinema");

        }
        else if (15<=sicaklik && sicaklik<25 ) {
            System.out.println("Piknik");

        }
        else {
            System.out.println("Yüzme");
        }
    
    
    }
    
}


    