
public class Main {
    public static void main(String[] args) {
        double[] liste = {1, 5, 8, 9, 15, 21, 35, 47};
        double sum = 0;
        for (int i = 0; i < liste.length; i++) {
            sum += (1 / liste[i]);
        }
        System.out.println("Harmonik ortalama : " + liste.length / sum);
    }
}