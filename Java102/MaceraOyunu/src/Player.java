import java.util.Scanner;

public class Player {
    private Scanner input = new Scanner(System.in);
    private int damage;
    private int health;
    private int initHealth;
    private int coin;
    private String charName;
    private String name;
    private Inventory inventory;
   

    public Player(String name) {
        this.name = name;
        this.inventory= new Inventory();
        
        
    }


    

    void selectChar(){

        GameChar[] charList= {new Samurai(),new Archer(),new Knight()};
        System.out.println("-----------------------------------------");

        for(GameChar gmChar:charList){
            System.out.println("ID: " + gmChar.getID() + "\t Character: "+gmChar.getCharName()+ "\t Damage: " + gmChar.getDamage()+ "\t Health: " + gmChar.getHealth() + "\t Coin: " + gmChar.getCoin());
        }

        System.out.println("Please select character role (for choose character role please enter the id number) ! ");

        int charSelect = input.nextInt();
        

        

        switch(charSelect){
            case 1:
                initPlayer(new Samurai());
                break;

            case 2:
                initPlayer(new Archer());
                break;

            case 3:
                initPlayer(new Knight());
                break;

            default:
                initPlayer(new Samurai());
                break;


        }

        System.out.println("Character who is choosen: " + this.getCharName());
       
    }

    


    public void initPlayer(GameChar gameChar){

        this.setDamage(gameChar.getDamage());
        this.setHealth(gameChar.getHealth());
        this.setInitHealth(gameChar.getHealth());
        this.setCoin(gameChar.getCoin());
        this.setCharName(gameChar.getCharName());

    }

    public void printInfo(){

        System.out.println("Your Weapon: " + this.getInventory().getWeapon().getName() +
        " Your Armor: " + this.getInventory().getArmor().getName()+
        " Your Block: " + this.getInventory().getArmor().getBlock() +
        " Your Damage: " + this.getTotalDamage() +
        " Your Health: " + this.getHealth() + " Your Coin: " + this.getCoin() +
        " Your Items: " + this.getInventory().getList());;

        //" 
        
        

    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Scanner getInput() {
        return this.input;
    }

    public void setInput(Scanner input) {
        this.input = input;
    }

    public int getTotalDamage(){
        return damage+this.getInventory().getWeapon().getDamage();
    }

    public int getDamage() {
        return damage;
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


    public Inventory getInventory() {
        return this.inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }


    public int getInitHealth() {
        return this.initHealth;
    }

    public void setInitHealth(int initHealth) {
        this.initHealth = initHealth;
    }


  




}


    