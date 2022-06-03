public class Cave extends BattleLoc {

    public Cave(Player player) {
        super(player, "Cave",new Zombie(), new Bounty("Food"),3);
        
    }
    
}
