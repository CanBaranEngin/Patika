import java.util.Scanner;

public class Player {
    private Scanner input = new Scanner(System.in);
    private int damage;
    private int health;
    private int coin;
    private String charName;

    private String name;
   

    public Player(String name) {
        this.name = name;
        
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


        }

        System.out.println("Character who is choosen:  " + this.charName);
        
       
    }

    void initPlayer(GameChar gameChar){

        this.setDamage(gameChar.getDamage());
        this.setHealth(gameChar.getHealth());
        this.setCoin(gameChar.getCoin());
        this.setCharName(gameChar.getCharName());

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



}


    