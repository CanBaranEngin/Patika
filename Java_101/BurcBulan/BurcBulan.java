package Java_101.BurcBulan;
import java.util.Scanner;

public class BurcBulan {
    public static void main(String[] args) {
        

        Scanner input = new Scanner(System.in);
        int month, day;
        String burc = "";
        boolean isError = false;

        System.out.print("Doğduğunuz ay : ");
        month = input.nextInt();

        System.out.print("Doğduğunuz gün : ");
        day = input.nextInt();


        if (month == 1) {
            if (day >= 1 && day <= 31)
                if (day < 22) {
                    burc = "Oğlak burcu";
                } else
                    burc = "Kova burcu ";
        }


        if (month == 2) {
            if (day >= 1 && day <= 28)
                if (day < 20) {
                    burc = "Kova burcu";
                } else
                    burc = "Balık burcu ";
        }

        if (month == 3) {
            if (day >= 1 && day <= 31)
                if (day < 21) {
                    burc = "Balık burcu";
                } else burc = "Koç burcu ";
        }

        if (month == 4) {
            if (day >= 1 && day <= 30)
                if (day < 21) {
                    burc = "Koç burcu";
                } else burc = "Boğa burcu ";
        }

        if (month == 5) {
            if (day >= 1 && day <= 31)
                if (day < 22) {
                    burc = "Boğa burcu";
                } else burc = "İkizler burcu ";
        }

        if (month == 6) {
            if (day >= 1 && day <= 30)
                if (day < 23) {
                    burc = "İkizler burcu";
                } else burc = "Yengeç burcu ";
        }

        if (month == 7) {
            if (day >= 1 && day <= 31)
                if (day < 23) {
                    burc = "Yengeç burcu";
                } else burc = "Aslan burcu ";
        }

        if (month == 8) {
            if (day >= 1 && day <= 30)
                if (day < 23) {
                    burc = "Aslan burcu";
                } else burc = "Başak burcu ";
        }

        if (month == 9) {
            if (day >= 1 && day <= 31)
                if (day < 23) {
                    burc = "Başak burcu";
                } else burc = "Terazi burcu ";
        }

        if (month == 10) {
            if (day >= 1 && day <= 30)
                if (day < 23) {
                    burc = "Terazi burcu";
                } else burc = "Akrep burcu ";
        }

        if (month == 11) {
            if (day >= 1 && day <= 31)
                if (day < 22) {
                    burc = "Akrep burcu";
                } else burc = "Yay burcu ";
        }

        if (month == 12) {
            if (day >= 1 && day <= 30)
                if (day < 22) {
                    burc = "Yay burcu";
                } else burc = "Kova burcu ";
        } else

            System.out.print("Burcunuz : " + burc);


    }
}