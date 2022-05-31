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
        System.out.println("You are in " + this.getName());
        System.out.println("Be careful " + "you can face with " + this.randomMonsterNumber() + " " + this.getMonster().getName()+"s");
        System.out.println("<W>ar OR <R>un ");
        String selectCase = input.nextLine();
        selectCase=selectCase.toUpperCase();
        if(selectCase.equals("W")){
            System.out.println("War has been started!! ");
        }
        
        return true;
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
