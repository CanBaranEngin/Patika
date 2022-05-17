public class Worker {

    private String firstLastName;
    private String mpno;
    private String email;


   public Worker(String firstLastname, String mpno, String email){
       this.firstLastName=firstLastname;
       this.mpno=mpno;
       this.email=email;
   }

   public String getFirstLastName(){
    return this.firstLastName;
   }
   public String getMpno(){
    return this.mpno;
   }
   public String getEmail(){
    return this.email;
   }
   public void setFirstLastName(String firstLastname){
    this.firstLastName=firstLastName;

   }
   public void setMpno(String mpno){
    this.mpno=mpno;

   }
   public void setEmail(String email){
    this.email=email;

   }

   public void enter(){
       System.out.println(this.firstLastName+" Started the work ");
   }

   public void exit(){
    System.out.println(this.firstLastName+" out of the work ");
   }

   public void diningHall(){
    System.out.println(this.firstLastName+" went to the dininghall ");
   }











   
}

    

