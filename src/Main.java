public class Main {
    public static void main(String[] args) {
        PersonStudent student= new PersonStudent("john", "rogan", "asjflaijsdlj", "male", 223411234, "joko", "2ai");
        PersonEmployee employee= new PersonEmployee("john", "lavog", "fljkashdfjhwquoi", "male", "architecture",1122);
        PersonStudentEmployee fullguy= new PersonStudentEmployee("sean", "lavog", "asdjfkljasdljf", "male", 12047812, "joko", "3ba", "player", 2222222);
        System.out.println(fullguy.getSecurity_number()+"; "+fullguy.getSalary());
    }
}
