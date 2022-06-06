import java.util.ArrayList;
import java.util.Random;


public abstract class BattleLoc extends Location {

    private Monster monster;
    private Bounty bounty;
    private int maxMonstValue;
    private int hitChance;
    

    public BattleLoc(Player player, String name, Monster monster, Bounty bounty,int maxMonstValue) {
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
                earnBounty();
                if(this.getMonster().getName().equals("Snake")){
                    dropBounty();
                }
            
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

                    hitChance=randomHitChance();

                    if(hitChance==0){
                        System.out.println("You hitted the " + this.getMonster().getName());
                        this.getMonster().setHealth(this.getMonster().getHealth()-this.getPlayer().getTotalDamage());
                        afterHit();


                    }if(this.getMonster().getHealth()>0 && hitChance==1){
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

    public int randomHitChance(){
        Random c = new Random();
        return c.nextInt(2);

    }

    public void earnBounty(){
        if (!this.getMonster().getName().equals("Snake")){
            this.getPlayer().getInventory().getList().add(this.getBounty().getName());
            System.out.println("You earn " +this.getBounty().getName()+ " special item." );

        }

    }

    public void dropBounty(){
        int value = (int)(Math.random()*100);
        if(value<15){
            int valueSec=(int)(Math.random()*100);
            if(valueSec<20){
                System.out.println("You dropped Rifle !!");
                this.getPlayer().getInventory().setWeapon(new Weapon("Rifle", 3, 7, 45));
                System.out.println("Your current weapon: "+ this.getPlayer().getInventory().getWeapon().getName() );
            }else if(valueSec>20 && valueSec<50) {
                System.out.println("You dropped Sword !!");
                this.getPlayer().getInventory().setWeapon(new Weapon("Sword", 2, 3, 35));
                System.out.println("Your current weapon: "+ this.getPlayer().getInventory().getWeapon().getName());
            }
            else{
                System.out.println("You dropped Pistol !!");
                this.getPlayer().getInventory().setWeapon(new Weapon("Pistol", 1, 2, 25));
                System.out.println("Your current weapon: "+ this.getPlayer().getInventory().getWeapon().getName());
            }
        }

        if(value>15 && value<30){
            int valueSec=(int)(Math.random()*100);
            if(valueSec<20){
                System.out.println("You dropped Light Armor !!");
                this.getPlayer().getInventory().setArmor(new Armor("Light", 1, 1, 15));
                System.out.println("Your current armor: "+ this.getPlayer().getInventory().getArmor().getName());
            }else if(valueSec>20 && valueSec<50) {
                System.out.println("You dropped Mid Armor !!");
                this.getPlayer().getInventory().setArmor(new Armor("Mid", 2, 3, 25));
                System.out.println("Your current armor: "+ this.getPlayer().getInventory().getArmor().getName());
            }
            else{
                System.out.println("You dropped Heavy Armor !!");
                this.getPlayer().getInventory().setArmor(new Armor("Heavy", 3, 5, 40));
                System.out.println("Your current armor: "+ this.getPlayer().getInventory().getArmor().getName());
            }
        }

        if(value>30 && value<55){
            int valueSec=(int)(Math.random()*100);
            if(valueSec<20){
                System.out.println("You dropped 10 coin !!");
                this.getPlayer().setCoin(this.getPlayer().getCoin()+10);
            }else if(valueSec>20 && valueSec<50) {
                System.out.println("You dropped 5 coin !!");
                this.getPlayer().setCoin(this.getPlayer().getCoin()+5);
            }
            else{
                System.out.println("You dropped 1 coin !!");
                this.getPlayer().setCoin(this.getPlayer().getCoin()+1);
            }


        }else{
            System.out.println("Unfortunately didn't drop any item.");
        }




    }

    public Monster getMonster() {
        return this.monster;
    }

    public void setMonster(Monster monster) {
        this.monster = monster;
    }

    public Bounty getBounty() {
        return this.bounty;
    }

    public void setBounty(Bounty bounty) {
        this.bounty = bounty;
    }

    public int getMaxMonstValue() {
        return this.maxMonstValue;
    }

    public void setMaxMonstValue(int maxMonstValue) {
        this.maxMonstValue = maxMonstValue;
    }


    public int getHitChance() {
        return this.hitChance;
    }

    public void setHitCahnce(int hitCahnce) {
        this.hitChance = hitChance;
    }





}
