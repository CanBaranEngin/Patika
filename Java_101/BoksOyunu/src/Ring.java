public class Ring {

    Fighter f1;
    Fighter f2;

    int maxweight;
    int minweight;


    public Ring(Fighter f1, Fighter f2, int maxweight, int minweight){

        this.f1=f1;
        this.f2=f2;
        this.maxweight=100;
        this.minweight=70;




    }

    public void run(){

        if (checkWeight()) {

        

            while (f1.health >0 && f2.health >0) {

                System.out.println("====== YENİ ROUND ======");

                if (fighterChoose()) {
                    f2.health = f1.hit(f2);
                    if(isWin()) {
                        break;
                    }

                }else {
                    f1.health = f2.hit(f1);
                    if(isWin()) {
                        break;
                    }

                }


                

                

                printScore();

            }
        }else {
            System.out.println("Sporcuların  ağırlıkları uyuşmuyor.");
        }



    }





    

    public boolean checkWeight(){

        return ((f1.weight<maxweight && f1.weight>minweight) && (f2.weight<maxweight && f2.weight>minweight));
    
        
    }

    public boolean fighterChoose(){

        int fighterChanceValue=((int)(Math.random() * ((3 - 1))));
        if (fighterChanceValue==1){
            return true;
        }
        else {
            return false;

        }
        
    }

    public boolean isWin() {
        if(f1.health == 0) {
            System.out.println("Maçı kazanan: " + f2.name);
            return true;
        }else if (f2.health == 0) {
            System.out.println("Maçı kazanan: " + f1.name);
            return true;

        } else {
            return false;
        }
    }


    public void printScore() {

        System.out.println("-----------------");

        System.out.println(f1.name + " oyuncunun sağlığı " + f1.health);

        System.out.println(f2.name + " oyuncunun sağlığı " + f2.health);




    }


    
    
}
