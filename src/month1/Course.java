package month1;

public class Course {
    private String courseName;
    private String instructor;
    private double credit;

    public Course(String courseName, String instructor, double credit) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.credit = credit;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }
}
