package Java_101.KullaniciGirisi;

import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        String userName,password,passwordN;
        int Choice;
        Scanner input = new Scanner(System.in);

        System.out.print("Kulanıcı Adınız: ");
        userName=input.nextLine();
        System.out.print("Şifreniz:");
        password=input.nextLine();
        
        if (userName.equals("baran") && password.equals("12345678")) {

            System.out.println("Giriş yapıldı.");
            
        }
        else {
            System.out.println("Şifre veya kullanıcı adını yanlış girdiniz");
            System.out.println("Şifreyi sıfırlamak ister misiniz ?, Sıfırlamak için 1'e basınız");
            Choice= input.nextInt();
            switch(Choice){
                case 1:
                    System.out.println("Şifreniz: ");
                    passwordN = input.nextLine();
                    if (passwordN.equals(password)) {
                        System.out.print("Aynı şifre girdiniz");
                       
                        
                    }else {
                        System.out.print("Şifreniz değiştirildi.");
                        password=passwordN;
                       
                    }
                break;

                default :
                    System.out.println("Şifre sıfırlanmadı");
                    break;
            }
        }
    }
}
