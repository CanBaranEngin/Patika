
public class Student {
    Course c1;
    Course c2;
    Course c3;
    Course soz1;
    Course soz2;
    Course soz3;

    String name;
    String stuNo;
    String classes;
    double avarega;
    Boolean isPass;


    Student ( String name, String stuNo, String classes, Course c1, Course c2, Course c3, Course soz1, Course soz2, Course soz3) {

        this.name = name;
        this.stuNo=stuNo;
        this.classes=classes;
        this.c1=c1;
        this.c2=c2;
        this.c3=c3;
        this.soz1=soz1;
        this.soz2=soz2;
        this.soz3=soz3;

        this.avarega=0.0;
        this.isPass= false;

    }


    void addBulkExamNote(int note1, int note2, int note3, int soz1,int soz2,int soz3) {

        if (note1>=0 && note1<=100) {
            this.c1.note=note1;

        }
        if (note2>=0 && note2<=100) {
            this.c2.note=note2;

        }
        if (note3>=0 && note3<=100) {
            this.c3.note=note3;

        }

        if (note3>=0 && note3<=100) {
            this.soz1.sozlu=soz1;

        }
        if (note3>=0 && note3<=100) {
            this.soz2.sozlu=soz2;

        }
        if (note3>=0 && note3<=100) {
            this.soz3.sozlu=soz3;

        }
     

        
    }

    


    void isPass() {
        this.avarega = (this.c1.note+this.c2.note+this.c3.note)/3*0.8 + (this.soz1.sozlu+this.soz2.sozlu+this.soz3.sozlu)/3*0.2 ;
        if (this.avarega > 55) {
            System.out.println("Sınıfı Başarılı Şekilde Geçtiniz: ");
            
        }else {
            System.out.println("Sınıfı geçemediniz.");

        }

        printNote();

    }



    void printNote () {

        System.out.println(this.c1.name + " Notu\t" + this.c1.note);
        System.out.println(this.c2.name + " Notu\t" + this.c2.note);
        System.out.println(this.c3.name + " Notu\t" + this.c3.note);
        System.out.println(this.soz1.name + " Notu\t" + this.soz1.note);
        System.out.println(this.soz2.name + " Notu\t" + this.soz2.note);
        System.out.println(this.soz3.name + " Notu\t" + this.soz3.note);

        System.out.println( "Ortalamanız : " + this.avarega);
    }
    
    
}
