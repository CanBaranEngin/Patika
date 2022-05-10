public class Fighter {
    String name;
    int demage;
    int health;
    int weight;
    double dodge;
   


    public Fighter ( String name, int demage, int health, int weight, int dodge){

        this.name=name;
        this.demage=demage;
        this.health=health;
        this.weight=weight;
        this.dodge=dodge;

    }

    public int hit(Fighter foe){
        System.out.println("-----------");
        System.out.println(this.name + " => " + foe.name + " " + this.demage + " hasar vurdu. " );

        if(foe.dodge()) {
            System.out.println(foe.name + " gelen hasarı savurdu. ");
            return foe.health;
        }


        if(foe.health-this.demage<0){
            return 0;

        
        }

        return foe.health-this.demage;

        

    }


    public boolean dodge() {

        double randomValue = Math.random()*100;
        return randomValue <= this.dodge;


    }


    
  

    




}
