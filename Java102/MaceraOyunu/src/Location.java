import java.util.Scanner;

abstract class Location {
    public static Scanner input = new Scanner(System.in);
    Player player;
    String name;


    public Location(Player player, String name) {
        this.player = player;
        this.name = name;
    }

    abstract boolean onLocation();


    public Player getPlayer() {
        return this.player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
