package metotlar_siniflar_diziler_OOP;

public class Car {
    String type;
    String model;
    String color = "kirmizi";
    int speed;
    int speedLimit = 230;

    Car(String color){
        this.color = color;
        System.out.println(color);
        //System.out.println(this.color);
    }

    Car(){
        System.out.println("bos kurucu metot olusturuldu");

    }

    void increaseSpeed(int increment){
        if ((this.speed + increment) < speedLimit){
            this.speed += increment;
        }
        else {
            this.speed = speedLimit;
        }
    }

    void decreaseSpeed(int decrease){
        if (this.speed > 0){
            this.speed -= decrease;
        }
        else {
            this.speed = 0;
        }
    }

    void printSpeed(){
        System.out.println("hızınız: " + this.speed);
    }

    void printInfo(){
        System.out.println("model:\t" + this.model);
        System.out.println("rengi:\t" + this.color);
        System.out.println("hizi\t" + this.speed);
    }
}
