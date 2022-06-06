import java.util.ArrayList;

public class Monster {

    private String name;
    private int id;
    private int damage;
    private int health;
    private int bounty;


    

    public Monster(int id,String name, int damage, int health,int bounty) {
        
        this.id = id;
        this.name=name;
        this.damage = damage;
        this.health = health;
        this.bounty=bounty;
    }
    public Monster(int id,String name, int damage, int health) {

        this.id = id;
        this.name=name;
        this.damage = damage;
        this.health = health;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDamage() {
        return this.damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return this.health;
    }

    public void setHealth(int health) {
        if(health<0){
            health=0;
        }
        this.health = health;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getBounty() {
        return this.bounty;
    }

    public void setBounty(int bounty) {
        this.bounty = bounty;
    }

    
}
