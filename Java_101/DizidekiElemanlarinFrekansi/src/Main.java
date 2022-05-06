
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        
    int [] Dizi = {10, 20, 20, 10, 10, 20, 5, 20, 50, 50, 60, 80, 80, 80};

    Arrays.sort(Dizi);

   

    for(int i=0; i<Dizi.length;i++) {
        int count=0;
        for(int j=0; j<Dizi.length; j++) {
            if(Dizi[i]==Dizi[j]) {
                count+=1;
                
            }
        }
        System.out.println(Dizi[i] + " sayısı " + count +" kere tekrar edildi");
        i +=(count-1);
    }
    
        
    }
    


}
