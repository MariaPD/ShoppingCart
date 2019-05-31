public class Product {
    private String name;
    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String toString() {
        return this.name + " " + this.price + "€";
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
