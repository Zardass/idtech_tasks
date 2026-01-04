public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(2,3);
        rectangle.area();
        Shape circle = new Circle(2);
        circle.area();

        Person person = new Person("Zarda",21);
        Person person2 = new Person("Rahiba",25);
        System.out.println(person);
        System.out.println(person2);

        ElectronicsProduct electronicsProduct = new ElectronicsProduct(1,"laptop",2000);
        System.out.println(electronicsProduct);
        electronicsProduct.applyDiscount(20);
        WashingMachine washingMachine = new WashingMachine(2,"samsung",4000,2);
        washingMachine.applyDiscount(20);
        washingMachine.extendWarrantyPeriod(3);

        OnlineCourse course = new OnlineCourse("Java","Zarda",2,3,"Udemy");
        course.displayInfo();
        course.eligible(3);

    }
}
