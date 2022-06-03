import java.util.ArrayList;


public class Inventory {
    private Weapon weapon;
    private Armor armor;
    private ArrayList<String> itemList = new ArrayList<>();

    public Inventory(){
        this.weapon = new Weapon("Punch", 0, 0, 0);
        this.armor = new Armor("Empty", 0, 0, 0);
        
    }
    

    public Weapon getWeapon() {
        return this.weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }


    public Armor getArmor() {
        return this.armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }


    public ArrayList<String> getList() {
        return this.itemList;
    }

    public void setList(ArrayList<String> list) {
        this.itemList = itemList;
    }


    
    
}
