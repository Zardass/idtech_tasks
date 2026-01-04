public class Circle extends Shape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void area() {
        System.out.println("Area of Circle " + Math.PI *radius * radius);
    }
}
