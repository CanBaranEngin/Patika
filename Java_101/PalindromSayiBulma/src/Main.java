public class Main {

    static boolean isPolindrom(int number) {
        int divide=number;
        int value;
        int reverseNumber=0;
        while(divide!=0) {


            value = divide%10;
            
            reverseNumber= (reverseNumber*10)+value;
            divide/=10;
            
            

        }

        

        if (number==reverseNumber){
            return true;

        }
           
        else {
            return false;

        }
            


    }
    public static void main(String[] args){

        System.out.println(isPolindrom(105)); 
        



    }
}
