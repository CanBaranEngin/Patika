package Java_101.Taksimetre;
import java.util.Scanner;

public class TaksimetreTutari {
    public static void main(String[] args) {
        int Km;
        float k_b_tut = 2.2f; 
        Scanner input = new Scanner(System.in);
        Km = input.nextInt();

        double tutar = Km*k_b_tut+10;

        tutar = (tutar<20) ? 20:tutar;
        System.out.println(tutar);


        
    }
    
}
