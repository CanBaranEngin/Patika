package Java_101.ManavKasa;
import java.util.Scanner;

public class ManavKasaProgrami {

    public static void main(String[] args) {

        double armutk, elmak, domatesk, muzk, patlicank;
        double armutf=2.14, elmaf=3.67, domatesf=1.11, muzf=0.95, patlicanf=5.00;

        Scanner input = new Scanner(System.in);
        System.out.print("Armut Kaç Kilo(kg): ");
        armutk = input.nextDouble();
        System.out.print("Elma Kaç Kilo(kg): ");
        elmak = input.nextDouble();
        System.out.print("Domates Kaç Kilo(kg): ");
        domatesk = input.nextDouble();
        System.out.print("Muz Kaç Kilo(kg): ");
        muzk = input.nextDouble();
        System.out.print("Patlıcan Kaç Kilo(kg): ");
        patlicank = input.nextDouble();

        double Tutar = armutk*armutf+elmak*elmaf+domatesk*domatesf+muzf+muzk+patlicanf*patlicank;

        System.out.println("Toplam Tutar: "+Tutar + " TL");

    


        
    }
}