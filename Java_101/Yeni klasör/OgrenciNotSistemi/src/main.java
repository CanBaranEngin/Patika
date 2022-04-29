public class main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut", "TRH", "555");
        Teacher t2 = new Teacher("Graham", "FZK", "0000");
        Teacher t3 = new Teacher("Külyutmaz", "BIO", "1111");

        Course tarih = new Course("Tarih", "101", "TRH");
        tarih.addTeacher(t1);
        Course fizik = new Course("Fizik", "102", "FZK");
        fizik.addTeacher(t2);
        Course Biyo = new Course("Biyoloji", "103", "BIO");
        Biyo.addTeacher(t3);

        Student s1 = new Student("Şaban", "123", "4", tarih, fizik, Biyo,tarih,fizik,Biyo);
        s1.addBulkExamNote(100, 78, 50,90,80,70);
        s1.isPass();

        Student s2 = new Student("Necmi", "124", "5", tarih, fizik, Biyo,tarih,fizik,Biyo);
        s2.addBulkExamNote(55, 20, 100,90,80,70);
        s2.isPass();

        
        

        





        
    }
    
}
