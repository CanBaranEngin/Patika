public class SafeHouse extends NormalLocation {

    public SafeHouse(Player player) {
        super(player,"Safe House");
        
    }

    @Override
    boolean onLocation(){
        System.out.println("You ara in Safe House");
        System.out.println("Your health is renewed");
        this.getPlayer().setHealth(this.getPlayer().getInitHealth());
        return true;
    }
    
}
