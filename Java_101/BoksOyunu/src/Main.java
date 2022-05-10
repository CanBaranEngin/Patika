public class  Main {

    public static void main(String[] args) {
        Fighter f1 = new Fighter("Alan", 10, 100, 90,20);
        Fighter f2 = new Fighter("Bob", 20, 80, 80, 40);

        Ring r = new Ring(f1, f2, 110, 80);

        r.run();
    }
    
}
