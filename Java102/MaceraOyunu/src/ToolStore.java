public class ToolStore extends NormalLocation {

    public ToolStore(Player player) {
        super(player,"Tool Store" );
       
    }

    @Override
    boolean onLocation(){
        System.out.println("-----------Welcome to the Tool Store----------");
        System.out.println("1- Weapons");
        System.out.println("2- Shields");
        System.out.println("3- Quit");
        System.out.print("Your Select ? : ");

        int selectCase=Location.input.nextInt();

        while(selectCase<1 || selectCase>3){
            System.out.println("Invalid value");
            selectCase=input.nextInt();

        }

        switch(selectCase){
            case 1: 
                printWeapon();
                buyWeapon();
                break;

            case 2: 
                printArmor();
                break;

            case 3:
                System.out.println("We look forward to seeing you again ");

        }

        return true;
    }

    public void printWeapon(){
        System.out.println("------Weapons------");
        System.out.println();
        for(Weapon w:Weapon.weapons()){
            System.out.println(w.getId() +" - "+ w.getName() + " <Price: " + w.getPrice() + " <Damage " + w.getDamage());
        }
        
        
    }

    public void buyWeapon(){

        System.out.println("Please select a weapon: ");

        int selectWeapon=input.nextInt();

        while(selectWeapon<1 || selectWeapon>Weapon.weapons().length){
            System.out.println("Invalid value");
            selectWeapon=input.nextInt();

        }

        Weapon selectedWeapon= Weapon.getWeaponObjByID(selectWeapon);
        
        if(selectedWeapon != null){

            if(selectedWeapon.getPrice() > this.getPlayer().getCoin()){
                System.out.println("You don't have enough coin ");
            }else{
                System.out.println("You bought a " + selectedWeapon.getName());
                int finalMoney=this.getPlayer().getCoin() - selectedWeapon.getPrice();
                this.getPlayer().setCoin(finalMoney);
                System.out.println("Money which your rise: " + this.getPlayer().getCoin());
                System.out.println("Your current weapon: " + this.getPlayer().getInventory().getWeapon().getName());
                this.getPlayer().getInventory().setWeapon(selectedWeapon);
                System.out.println("Your new weapon: " + this.getPlayer().getInventory().getWeapon().getName() );

        
            }
        }
    }

    public void printArmor(){
        System.out.println("------Armors------");
        
    }
    
}
