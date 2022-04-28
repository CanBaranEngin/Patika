import java.util.Scanner;

public class UcakBileti {

   public static void main(String[] args) {
    int km,age,pessage_type;
    double km_per_price=0.1;
    Scanner input = new Scanner(System.in);

    System.out.print("Yapılacak km'yi giriniz: ");
    km = input.nextInt();
    System.out.print("Yaşınız: ");
    age= input.nextInt();
    System.out.print("Tek yön için: 1, gdişi dönüş için: 2 ");
    pessage_type= input.nextInt();
    if (pessage_type != 1 && pessage_type != 2) {
        System.out.println("Hatalı giriş yaptınız");
    }

    double total_cost = km*km_per_price;

    if (age<12) {

        double discount= total_cost*0.5; 
        double final_cost=total_cost-discount;
        if (pessage_type==2) {
            final_cost=final_cost-final_cost*0.2;
            System.out.println(final_cost);

        }else {
            System.out.println(final_cost);
        }

    }else if (12<age && age<24) {

        double discount= total_cost*0.1; 
        double final_cost=total_cost-discount;
        if (pessage_type==2) {
            final_cost=final_cost-final_cost*0.2;
            System.out.println(final_cost);
        }else {
            System.out.println(final_cost);
        }
    }else if (age>65) {

        double discount= total_cost*0.3; 
        double final_cost=total_cost-discount;
        if (pessage_type==2) {
            final_cost=final_cost-final_cost*0.2;
            System.out.println(final_cost);
        }
        else {
            System.out.println(final_cost);
        }
    }

    

    





 } 


   

   
    
    



    


}
