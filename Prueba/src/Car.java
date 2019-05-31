public class Car {
    private String brand;
    private String model;
    private int speed;

    public Car(String brand, String model, int speed) {
        this.brand = brand;
        this.model = model;
        this.speed = speed;
    }

    public void accelerate (int amount) {
        this.speed += amount;
    }

    public void brake (int amount) {
        this.speed -= amount;
        if(this.speed < 0) this.speed = 0;
    }

    public void stop () {
        this.speed = 0;
    }

    public boolean running () {
        return this.speed > 0;
    }

    public String status () {
        return this.brand + " " + this.model + " running at " + this.speed + " km/h";
    }
}