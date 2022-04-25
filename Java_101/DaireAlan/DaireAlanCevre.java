package Java_101.DaireAlan;
import java.util.Scanner;




public class DaireAlanCevre {
    public static void main(String[] args) {
        double pi = 3.14;
        Scanner input = new Scanner(System.in);
        System.out.print("Yarıçap Giriniz: ");
        int r = input.nextInt();
        System.out.print("Merkez Açı Giriniz: ");
        int a = input.nextInt();
    
        double Alan = pi*r*r;
        double Cevre = 2*pi*r;
        double Daire_dilimi = (pi*(r*r)*a)/360;

        System.out.println("Dairenin Alanı: "+Alan);
        System.out.println("Dairenin Çevresi: "+Cevre);
        System.out.println("Daire Diliminin Alanı: "+Daire_dilimi);


    }
    


    
}
