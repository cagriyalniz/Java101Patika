package metotlar_siniflar_diziler_OOP;

public class Main {
    public static void main(String[] args) {

        Car myCar = new Car("beyaz");
        Car boscar = new Car();

        myCar.model = "my car";
        myCar.speed = 200;
        System.out.println(myCar.model + " hızı" + myCar.speed);
        myCar.increaseSpeed(100);
        System.out.println(myCar.model + " hızı" + myCar.speed);
        myCar.printSpeed();
        myCar.printInfo();

    }
}
