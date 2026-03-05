package studentgradingsystem;

public class Main {
    public static void main(String[] args) {

        Student student1= new GraduateStudent("Zarda",98);
        Student student2 = new UndergraduateStudent("Salim",34);

        System.out.println(student1.getFinalGrade());
        System.out.println(student2.getFinalGrade());
    }
}
