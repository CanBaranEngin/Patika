import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.print("Dizinin Boyutu n: ");
        int n = input.nextInt();
        int[] numberList = new int[n];
        for(int i=0; i<n;i++) {
            System.out.println("Dizinin " + (i+1) + "."+" elemanını giriniz." );
            int s = input.nextInt();
            numberList[i]=(s);
        }

        Arrays.sort(numberList);

        for (int s=0; s<numberList.length;s++){
            System.out.print(" "+ numberList[s]);
        }

    }
}
