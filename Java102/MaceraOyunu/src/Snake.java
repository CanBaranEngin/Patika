import java.util.Random;

public class Snake extends Monster {
    static Random r = new Random();
    private static int damage=r.nextInt(3)+3;


    
    public Snake() {
        super(4, "Snake", damage, 12);
       
    }


}