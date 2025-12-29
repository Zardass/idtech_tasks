package studentgradingsystem;

public class UndergraduateStudent extends Student {

    public UndergraduateStudent(String name, double grade) {
        super(name, grade);
    }

    @Override
  public double getFinalGrade(){
        return getGrade();
    }
}
