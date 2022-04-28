

import java.util.Scanner;

public class ArtikYilHesaplama {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Yıl Giriniz : ");
		
		int year = input.nextInt();
		
		if (year %4 == 0 && year %100!=0) {
			System.out.println("Year is " + year + " Artik Yil");
		}else if(year %100 == 0) {
			if(year %400 == 0) {
				System.out.println("Year is " + year + " Artik Yil");
			}else {
				System.out.println("Girdiginiz yil artik yil degildir.");
			}
			
		}else {
			System.out.println("Girdiginiz yil artik yil degildir.");
		}
		
		
	}

}