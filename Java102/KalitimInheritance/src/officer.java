public class officer extends Worker {

    private String department;
    private String shift;

    public officer(String firstLastname, String mpno, String email,String department,String shift) {
        super(firstLastname, mpno, email);
        this.department=department;
        this.shift=shift;
    }
    

    public String getDepartment() {
        return this.department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getShift() {
        return this.shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public void work(){
        System.out.println(this.getFirstLastName()+" Started the work ");
    }


    
    
}
