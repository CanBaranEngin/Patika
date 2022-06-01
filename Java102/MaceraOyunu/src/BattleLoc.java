import java.util.Random;

public abstract class BattleLoc extends Location {

    private Monster monster;
    private String bounty;
    private int maxMonstValue;


    public BattleLoc(Player player, String name, Monster monster, String bounty,int maxMonstValue) {
        super(player, name);
        this.monster=monster;
        this.bounty=bounty;
        this.maxMonstValue=maxMonstValue;
        
    }

    @Override
    public boolean onLocation() {
        int monstnum = this.randomMonsterNumber();
        System.out.println("You are in " + this.getName());
        System.out.println("Be careful " + "you can face with " + monstnum + " " + this.getMonster().getName()+"s");
        System.out.println("<W>ar OR <R>un ");
        String selectCase = input.nextLine();
        selectCase=selectCase.toUpperCase();
        if(selectCase.equals("W")){
            System.out.println("War has been started!! ");
            if(combat(monstnum)){
                System.out.println(this.getPlayer().getName() + " Congratulations you defeated all enemies !");
                return true;

            }
            if(this.getPlayer().getHealth() <= 0){
                System.out.println("You died");
                return false;
            }
            

        }
        
        return true;
    }

    public boolean combat(int monstnum){
        System.out.println(monstnum);

        for(int i=0; i< monstnum; i++){
            playerStatus();
            System.out.println();
            monsterStatus(i+1);
            int initMonsterHealt=this.getMonster().getHealth();
            
            while(this.getPlayer().getHealth()>0 && this.getMonster().getHealth()>0){

                System.out.println("<P>unch or <R>un");
                String selectCombat=input.nextLine().toUpperCase();

                if(selectCombat.equals("P")){
                    System.out.println("You hitted the " + this.getMonster().getName());
                    this.getMonster().setHealth(this.getMonster().getHealth()-this.getPlayer().getTotalDamage());
                    afterHit();

                    if(this.getMonster().getHealth()>0){
                        System.out.println();
                        System.out.println("Monster hitted the " + this.getPlayer().getName());
                        int monsterHitDamage=this.getMonster().getDamage()-this.getPlayer().getInventory().getArmor().getBlock();
                        if(monsterHitDamage<0){
                            monsterHitDamage=0;
                        }
                        this.getPlayer().setHealth(this.getPlayer().getHealth() - monsterHitDamage);
                        afterHit();
                    } 
                }else {
                    return false;
                }

            }

            if (this.getMonster().getHealth()<this.getPlayer().getHealth()){
                System.out.println("You defeated enemy");
                System.out.println("You earn " + this.getMonster().getBounty() + " coin." );
                this.getPlayer().setCoin(this.getPlayer().getCoin()+this.getMonster().getBounty());
            }

            if (this.getPlayer().getHealth()<=0){
                return false;
            }

            this.getMonster().setHealth(initMonsterHealt);

        }




        return true;
    }

    public void afterHit(){
        System.out.println("Your Healh :" + this.getPlayer().getHealth());
        System.out.println("Health of  " + this.getMonster().getName() + " " + this.getMonster().getHealth() );
        System.out.println();
    }

    public void monsterStatus(int i){

        System.out.println(i + ". " + this.getMonster().getName() + " Values");
        System.out.println("----------------------");
        System.out.println("Health: " + this.getMonster().getHealth());
        System.out.println("Damage: " + this.getMonster().getDamage());
        System.out.println("Bounty: " + this.getMonster().getBounty());
    }

    public void playerStatus(){

        System.out.println("Player Values");
        System.out.println("----------------------");
        System.out.println("Health: " + this.getPlayer().getHealth());
        System.out.println("Weapon: " + this.getPlayer().getInventory().getWeapon().getName());
        System.out.println("Armor: " + this.getPlayer().getInventory().getArmor().getName());
        System.out.println("Block: " + this.getPlayer().getInventory().getArmor().getBlock());
        System.out.println("Damage: " + this.getPlayer().getTotalDamage());
        System.out.println("Coin: " + this.getPlayer().getCoin());
    }
    
    public int randomMonsterNumber(){
        Random r = new Random();
        return r.nextInt(this.getMaxMonstValue())+1;
    }


    public Monster getMonster() {
        return this.monster;
    }

    public void setMonster(Monster monster) {
        this.monster = monster;
    }

    public String getBounty() {
        return this.bounty;
    }

    public void setBounty(String bounty) {
        this.bounty = bounty;
    }

    public int getMaxMonstValue() {
        return this.maxMonstValue;
    }

    public void setMaxMonstValue(int maxMonstValue) {
        this.maxMonstValue = maxMonstValue;
    }


}
