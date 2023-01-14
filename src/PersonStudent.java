public class PersonStudent extends Person implements Student{
    private int Badge_number;
    private String School_name;
    private String Class;
    public PersonStudent(String name, String surname, String security_number, String sex, int badge_number, String school_name, String aClass){
        super(name,surname, security_number,sex);
        this.Badge_number=badge_number;
        this.School_name=school_name;
        this.Class=aClass;
    }
    @Override
    public int getBadge_number(){
        return Badge_number;
    }
    @Override
    public String getSchool_name(){
        return School_name;
    }
    @Override
    public String getClass_(){
        return Class;
    }
    @Override
    public void setBadge_number(int badge_number){
        this.Badge_number=badge_number;
    }

    @Override
    public void setSchool_name(String school_name) {
        this.School_name=school_name;
    }

    @Override
    public void setClass(String class_) {
        this.Class=class_;
    }
}
