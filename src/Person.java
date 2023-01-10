public abstract class Person implements Human{
    private String name:
    private String surname;
    private String security_number;
    private String sex;
    public Person(String name, String surname, String security_number, String sex){
        this.name=name;
        this.surname=surname;
        this.security_number=security_number;
        this.sex=sex;
    }
    @Override
    public void setName(String name){

    }
    @Override
    public void setSurname(String surname){

    }
    @Override
    public void setSecurity_number(String security_number){

    }
    @Override
    public void setSex(String sex){

    }
    @Override
    public String getName(){
        return name;
    }
    @Override
    public String getSurname(){
        return surname;
    }
    @Override
    public String getSecurity_number(){
        return security_number;
    }
    @Override
    public String getSex(){
        return sex;
    }
    public String StampaTutto(){
        return "name: "+name+"\n" +
                " surname: "+surname+"\n" +
                " security number: "+security_number+"\n" +
                " sex: "+sex;
    }
}
