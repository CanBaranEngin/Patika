abstract class GameChar {

    private int damage;
    private int health;
    protected int coin;
    private int ID;
    private String charName;


    public GameChar(int ID,String charName,int damage, int health, int coin) {
        this.ID=ID;
        this.charName=charName;
        this.damage = damage;
        this.health = health;
        this.coin = coin;
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

    public int getCoin() {
        return this.coin;
    }

    public void setCoin(int coin) {
        this.coin = coin;
    }


    public String getCharName() {
        return this.charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }


    public int getID() {
        return this.ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }



    
}
