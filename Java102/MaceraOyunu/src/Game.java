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

        


    }
}
