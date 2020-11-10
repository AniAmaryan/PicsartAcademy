package Homework4;

public class StudentRunner {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setFirstName("Ani");
        student1.setLastName("Amaryan");
        student1.setEmail("aaaa@mail.com");
        student1.setMark(150);
        student1.setYear(1998);
        student1.printName();
        student1.printBirth();

        System.out.println();

        Student student2 = new Student();
        student2.setFirstName("Babken");
        student2.setLastName("Gevorgyan");
        student2.setEmail("bbbb@mail.com");
        student2.setMark(74);
        student2.setYear(1995);
        student2.printName();
        student2.printBirth();

    }
}
