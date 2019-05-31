public class Main {

    public static void main(String[] args) {
        Car ford = new Car("Ford", "Mondeo", 0);
        System.out.println(ford.status());
        ford.accelerate(50);
        System.out.println(ford.status());
        ford.accelerate(100);
        System.out.println(ford.status());
        ford.brake(100);
        System.out.println(ford.status());
        ford.stop();
        System.out.println(ford.status());
        ford.running();
        System.out.println(ford.running());

        Car ferrari = new Car ("Ferrari", "Testarossa", 0);
        ferrari.accelerate(200);
        System.out.println(ferrari.status());

        TV samsung = new TV("Samsung", 1, 50);
        System.out.println(samsung.status());
        samsung.increase(150);
        System.out.println(samsung.status());
        samsung.decrease(150);
        System.out.println(samsung.status());
        samsung.setChannel(200);
        System.out.println(samsung.status());
        samsung.reset();
        System.out.println(samsung.status());
    }
}
