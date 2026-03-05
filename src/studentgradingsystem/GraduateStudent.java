package studentgradingsystem;

import java.util.Random;

public class GraduateStudent extends Student {

    public GraduateStudent(String name, double grade) {
        super(name, grade);
    }

    @Override
    public double getFinalGrade(){
        Random random =  new Random();
        int bonus = random.nextInt(1) + 20;
        return bonus + getGrade();
    }
}
