package Java_101.VucutKitle;
import java.util.Scanner;

public class VucutKitleEndeksi {

    public static void main(String[] args) {

        double boy, kilo;

        Scanner input = new Scanner(System.in);
        System.out.print("Boy Giriniz(metre cinsinden): ");
        boy = input.nextDouble();
        System.out.print("Kilo Giriniz(kg): ");
        kilo = input.nextDouble();

        double vki = kilo/(boy*boy);
        System.out.println("Vücut Kitle Endeksiniz: "+vki);



        
    }
    
    
}
