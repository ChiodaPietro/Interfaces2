public class PersonEmployee extends Person implements Employee{
    private String qualification;
    private int salary;
    public PersonEmployee(String name, String surname, String security_number, String sex, String qualification, int salary){
        super(name, surname, security_number, sex );
        this.qualification=qualification;
        this.salary=salary;
    }
    @Override
    public void setQualification(String qualification){
        this.qualification=qualification;
    }
    @Override
    public void setSalary(int salary){
        this.salary=salary;
    }
    @Override
    public String getQualification(){
        return qualification;
    }
    @Override
    public int getSalary(){
        return salary;
    }
}
