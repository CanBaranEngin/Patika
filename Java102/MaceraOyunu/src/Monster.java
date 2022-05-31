public class Monster {

    private String name;
    private int id;
    private int damage;
    private int health;

    

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
        this.health = health;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}