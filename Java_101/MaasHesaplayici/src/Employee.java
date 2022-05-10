public class Employee {

    String name;
    int salary;
    int workHours;
    int hireYou;


    Employee(String name, int salary,int workHours, int hireYou ) {

        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYou=hireYou;



    }

    public double tax(){

        if (this.salary<1000){
            return 0;


        }else {
            return this.salary*3/100;
        }


    
    }

    public double bonus() {

        if(this.workHours<40) {
            return 0;
        }else {
            return (this.workHours-40)*30;
        }
    }


    public double raiseSalary(){
        int workYears=2022-this.hireYou;

        if(workYears<10){
            return this.salary*0.05;
        }
        
        else if (workYears>9 && workYears<20){
            return this.salary*0.1;
        }
        
        else {
            return this.salary*0.15;
        }

    }

    public void toPrintEmployee(){

        
        System.out.println("\n" + " -------" + "Kullanıcı Bilgileri" + "---------" + "\n");
        System.out.println("Adı : " + this.name + "\n" + "Maaşı :" + this.salary + "\n" + "Çalışma Saati : " + this.workHours + "\n" + 
        "Başlangıç Yılı : " + this.hireYou + "\n" + "Vergi : " + this.tax() + "\n" + "Bonus : " + this.bonus() + "\n"
        + "Maaş Artışı : " + this.raiseSalary() + "\n" + "Vergi ve Bonuslar ile birlikte maaş : " + (this.bonus()-this.tax()+this.salary) + 
        "\n" + "Toplam Maaş : " + (this.salary+this.bonus()-this.tax()+this.raiseSalary()));

    }





}
