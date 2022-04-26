package Java_101.SinifGecme;
import java.util.Scanner;

public class SinifGecme {
    public static void main(String[] args) {
        int Mat,Fiz,Tur,Kim,Muz,count=0;
        double Top=0,Ort;
        

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunu Girniz: ");
        Mat=input.nextInt();
        System.out.print("Fizik Notunu Girniz: ");
        Fiz=input.nextInt();
        System.out.print("Türkçe Notunu Girniz: ");
        Tur=input.nextInt();
        System.out.print("Kimya Notunu Girniz: ");
        Kim=input.nextInt();
        System.out.print("Müzik Notunu Girniz: ");
        Muz=input.nextInt();

        if ( Mat<=100 && Mat>0 ) {
            Top+=Mat;
            count++;
        }

        if ( Fiz<=100 && Fiz>0 ) {
            Top+=Fiz;
            count++;
        }

        if ( Tur<=100 && Tur>0 ) {
            Top+=Tur;
            count++;
        }
        if ( Kim<=100 && Kim>0 ) {
            Top+=Kim;
            count++;
        }
        if ( Muz<=100 && Muz>0 ) {
            Top+=Muz;
            count++;
        }

        Ort=Top/count;
        
        if (Ort<55){
            System.out.println("Sınıfta Kaldınız");
        }

        else {
            System.out.println("Tebrikler Geçtiniz.");
        }



        


        
    }
    
}
