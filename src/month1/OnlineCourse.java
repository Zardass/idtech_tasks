package month1;

public class OnlineCourse  extends Course {
        private String platform;
        private int duration;

    public OnlineCourse(String courseName, String instructor, double credit, int duration, String platform) {
        super(courseName, instructor, credit);
        this.platform = platform;
        this.duration = duration;
    }

    public void displayInfo(){
        System.out.println("course details:");
        System.out.println("Name: " + this.getCourseName());
        System.out.println("Instructor: " + this.getInstructor());
        System.out.println("Credit: " + this.getCredit());
        System.out.println("Duration: " + this.duration);
        System.out.println("Platform: " + this.platform);
    }

    public void eligible(int duration){
        if (this.duration == duration){
            System.out.println("Successfully course certification!");
        }
        else{
            System.out.println("Failed course certification!");
        }
    }
}
