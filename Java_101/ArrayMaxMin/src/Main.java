import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
       int[] list={15,12,788,1,-1,-778,2,0};
       ArrayList<Integer> lowerNumbers = new ArrayList<Integer>();
       ArrayList<Integer> upperNumbers = new ArrayList<Integer>();
       int enkucuk=0; 
       int enbuyuk=0;
       int girilen = 5;

       for(int i:list){

        if (girilen>i){

            lowerNumbers.add(i); 

        }else {

            upperNumbers.add(i);
        }


        }

        for(int s=0; s<lowerNumbers.size()-1;s++){

            if(Math.abs(girilen-lowerNumbers.get(s))<Math.abs(girilen-lowerNumbers.get(s+1))){

                enkucuk=lowerNumbers.get(s);

                



            }
            else {
                enkucuk=lowerNumbers.get(s+1);
            }

            

        }

        for(int t=0; t<upperNumbers.size()-1;t++){

            if(Math.abs(girilen-upperNumbers.get(t))<Math.abs(girilen-upperNumbers.get(t+1))){

                enbuyuk=upperNumbers.get(t);

                



            }
            else {
                enbuyuk=upperNumbers.get(t+1);
            }

            

        }

        

        

        System.out.println("Girilen sayıdan küçük en yakın sayı: "+ enkucuk); 
        System.out.println("Girilen sayıdan büyük en yakın sayı: " + enbuyuk);
       

    }
       

       
}
