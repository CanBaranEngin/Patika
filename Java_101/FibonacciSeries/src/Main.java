public class Main {


    static int fibonnacciSum(int n){

        if (n==1 || n==2) {
            return 1;
        }

        int sum=fibonnacciSum(n-1) + fibonnacciSum(n-2);

        return sum;

    }
    
    
    
    public static void main(String[] args) throws Exception {

        System.out.println(fibonnacciSum(6));

        
        
    }
}
