public class PersonStudentEmployee extends Person implements Student, Employee{
    private int badge_number;
    private String school_name;
    private String Class;
    private String qualification;
    private int salary;
    public PersonStudentEmployee(String name, String surname, String security_number, String sex, int badge_number, String school_name, String aClass, String qualification, int salary){
        super(name, surname, security_number, sex);
        this.badge_number=badge_number;
        this.school_name=school_name;
        this.Class=aClass;
        this.qualification=qualification;
        this.salary=salary;
    }

    @Override
    public void setQualification(String qualification) {
        this.qualification=qualification;
    }

    @Override
    public void setSalary(int salary) {
        this.salary=salary;
    }

    @Override
    public int getSalary() {
        return salary;
    }

    @Override
    public String getQualification() {
        return qualification;
    }

    @Override
    public void setBadge_number(int badge_number) {
        this.badge_number=badge_number;
    }

    @Override
    public void setSchool_name(String school_name) {
        this.school_name=school_name;
    }

    @Override
    public void setClass(String class_) {
        this.Class=class_;
    }

    @Override
    public int getBadge_number() {
        return badge_number;
    }

    @Override
    public String getSchool_name() {
        return school_name;
    }

    @Override
    public String getClass_() {
        return Class;
    }
}
