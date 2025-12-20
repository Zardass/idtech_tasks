package inheritance;

public class Main {
    public static void main(String[] args) {


        //exercise 1
        Animal animal = new Cat();
        Animal animal2 = new Dog();

        animal.sound();
        animal2.sound();

        //exercise 2
         Shape circle =  new Circle(2);
        Shape square = new Square(3);

        System.out.println("area of circle " + circle.area());
        System.out.println("area of square " + square.area());

        //exercise 3
        Car car = new Car();
        car.refuel();
        Vehicle vehicle = new Vehicle();
        vehicle.move();
        ElectricCar electricCar = new ElectricCar();
        electricCar.chargeBattery();
        electricCar.move();

        EmployeeExercise3[] employees ={
                new  Manager(),
                new Developer()
        } ;
        for (EmployeeExercise3 e: employees){
            System.out.println(e.calculateSalary());
        }



    }
}

