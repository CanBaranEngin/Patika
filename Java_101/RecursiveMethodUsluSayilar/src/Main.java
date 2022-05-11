import java.util.Scanner;

public class Main {

    static int ustBulma(int n, int taban) {

        if(n==0){
            return 1;
        }

        return taban*ustBulma(n-1, taban);


    }


    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        System.out.print("Taban değerini giriniz :");
        int taban = input.nextInt();
        System.out.print("üs değerini giriniz :");
        int n = input.nextInt();

        input.close();

        System.out.println("Sonuç :" + ustBulma(n, taban));

        

       
    }
}
