public class Main {
    public static void main(String[] args) throws Exception {

        Worker w1 = new Worker("Can baran", "555555555", "canbaranengin@ghfkdjkdf.com");
        Worker w2 = new Worker("Engin", "55551111", "engin@ghfkdjkdf.com");
        Worker w3 = new Worker("Mahmut", "55500000", "engin123@ghfkdjkdf.com");

        Academician a1 = new Academician("can baran", "5589652147", "deneme@deneme.com", "mat", "prof");
        officer o1 = new officer("Mahmut", "4556635345", "mahmut@mhmt.com", "librarian", "09.00 - 18.00");


        System.out.println( w1.getFirstLastName());
        a1.enter();
        a1.startLesson();
        o1.diningHall();

        

       
        


    }
}
