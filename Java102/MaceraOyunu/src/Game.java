import java.util.Scanner;

public class Game {
    private Scanner input = new Scanner(System.in);
    

    

    public void start(){
        System.out.println("Welcome to the Adventure Game: ");
        System.out.println("Please select a name of character: ");
        String playerName = input.nextLine();
        Player player=new Player(playerName);
        System.out.println(player.getName() + " Welcome");
        player.selectChar();
        Boolean stop=true;
        Location location=null;
        while(stop){
            player.printInfo();
            System.out.println();
            System.out.println("-----Locations-------");
            System.out.println();
            System.out.println("1- Safe House --> This location is safe for you. There is no enemy.");
            System.out.println("2- Tool Store --> You can buy weapon and shield in this location.");
            System.out.println("3- Cave --> You have to be careful. You can face with monster.");
            System.out.println("4- Forest --> You have to be careful. You can face with monster.");
            System.out.println("5- River --> You have to be careful. You can face with monster.");
            System.out.println("0- Quit the Game");
            System.out.println("Please select location which you want to go");
            int selectLoc= input.nextInt();

            if(selectLoc==0){
                stop=false;
            }else{

                switch(selectLoc){
                    case 1:
                        location=new SafeHouse(player);
                        if(player.getInventory().getList().size()==3){
                            System.out.println("*****************************************************");
                            System.out.println("********* Congratulations You Won the Game **********");
                            System.out.println("*****************************************************");
                            stop=false;
                            break;
                        }
                        break;
                    
                    case 2:
                        location=new ToolStore(player);
                        break;

                    case 3:
                        if(!player.getInventory().getList().contains("Food")){
                            location=new Cave(player);
                            break;
                        }else{
                            System.out.println("You already have food special item, please select another location");
                            location=new SafeHouse(player);
                            break;
                            
                        }
                     
                    case 4:
                        if(!player.getInventory().getList().contains("Wood")){
                            location=new Forest(player);
                            break;
                        }else{
                            System.out.println("You already have wood special item, please select another location");
                            location=new SafeHouse(player);
                         break;
                        
                    }
                    case 5:
                        if(!player.getInventory().getList().contains("River")){
                            location=new River(player);
                            break;
                        }else{
                            System.out.println("You already have water special item, please select another location");
                            location=new SafeHouse(player);
                            break;
                        }
                    
                    default:
                        System.out.println("Invalid number, please select location.");
                        location=new SafeHouse(player);
                        break;
        
                }
        
                if(!location.onLocation()){
                    System.out.println("Game Over");
                    break;
                }

            }


                
                
            


        }
            
            
    
        
        


    }
}
