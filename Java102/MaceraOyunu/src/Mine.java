import java.util.Random;
import java.util.ArrayList;

public class Mine extends BattleLoc {

    Random r =new Random();
    int ranNumber =r.nextInt(3)+1;
    
    public Mine(Player player) {
        super(player, "Mine",new Snake(), new Bounty(null),5);
        
    }







    public void dropItem(){

        
    }


}
