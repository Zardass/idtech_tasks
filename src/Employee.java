public class Employee extends Person {
    private double salary;


    public Employee( String name, double salary,int age) {
        super(age, name);
        this.salary = salary;
    }
}
