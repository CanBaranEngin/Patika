public class Weapon {
    private String name;
    private int id;
    private int damage;
    private int price;

    public Weapon(String name,int id, int damage, int price) {
        this.id = id;
        this.damage = damage;
        this.price = price;
        this.name=name;
    }

    public static Weapon[] weapons(){

        Weapon[] weaponList = new Weapon[3];

        weaponList[0]= new Weapon("Pistol", 1, 2, 5);
        weaponList[1]= new Weapon("Sword", 2, 3, 35);
        weaponList[2]= new Weapon("Rifle", 3, 7, 45);
        return weaponList;

    }

    public static Weapon getWeaponObjByID(int id){
        for(Weapon w:Weapon.weapons()){
            if(w.getId() == id) {
                return w;
            }

        }

        return null;
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

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }


    
}
