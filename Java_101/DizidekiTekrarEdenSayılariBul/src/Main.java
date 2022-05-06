import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> evenNumbers = new ArrayList<Integer>();
        ArrayList<Integer> evenNumbersDub = new ArrayList<Integer>();
        
        int[] liste = {12,34,35,46,57,12,34,40,60,89,103,40};

        for (int i:liste){

            if (i%2==0){
                evenNumbers.add(i);

            }
        }

        for(int s = 0; s < evenNumbers.size(); s++) {  
            for(int t = s + 1; t < evenNumbers.size(); t++) {  
                if(evenNumbers.get(s) == evenNumbers.get(t))  
                    System.out.println(evenNumbers.get(t));  
            }  
        }  



        }



        

    
    
}
