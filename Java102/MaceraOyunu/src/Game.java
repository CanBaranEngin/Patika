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
        
        Location location=null;
        while(true){
            player.printInfo();
            System.out.println();
            System.out.println("-----Locations-------");
            System.out.println();
            System.out.println("1- Safe House --> This location is safe for you. There is no enemy.");
            System.out.println("2- Tool Store --> You can buy weapon and shield in this location.");
            System.out.println("Please select location which you want to go");
            int selectLoc= input.nextInt();
    
            switch(selectLoc){
                case 1:
                    location=new SafeHouse(player);
                    break;
                
                case 2:
                    location=new ToolStore(player);
                    break;
                
                default:
                    location=new SafeHouse(player);
    
            }
    
            if(!location.onLocation()){
                System.out.println("Game Over");
                break;
            }
            
            
    



        }
            
            
    
        
        


    }
}
