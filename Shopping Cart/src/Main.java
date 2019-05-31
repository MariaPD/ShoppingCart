public class Main {

    public static void main (String[] args) {

        Product p1 = new Product("vacuum cleaner", 100);
        Product p2 = new Product("pencil", 3);
        Product p3 = new Product("bike", 300);
        Product p4 = new Product("pencil", 3);
        Product p5 = new Product("pencil", 3);
        Product p6 = new Product("pencil", 3);
        Product p7 = new Product("pencil", 3);
        Product p8 = new Product("pencil", 3);
        Product p9 = new Product("pencil", 3);
        Product p10 = new Product("pencil", 3);
        Product p11 = new Product("pencil", 3);
        Product p12 = new Product("pencil", 3);
        Product p13 = new Product("bike", 300);
        Product p14 = new Product("bike", 300);
        Product p15 = new Product("bike", 300);
        Product p16 = new Product("bike", 300);
        Product p17 = new Product("bike", 300);
        Product p18= new Product("bike", 300);

        ShoppingCart cart = new ShoppingCart();

        cart.addProduct(p1);
        cart.addProduct(p2);
        cart.addProduct(p3);
        cart.addProduct(p4);
        cart.addProduct(p5);
        cart.addProduct(p6);
        cart.addProduct(p7);
        cart.addProduct(p8);
        cart.addProduct(p9);
        cart.addProduct(p10);
        cart.addProduct(p11);
        cart.addProduct(p12);
        cart.addProduct(p13);
        cart.addProduct(p14);
        cart.addProduct(p15);
        cart.addProduct(p16);
        cart.addProduct(p17);
        cart.addProduct(p18);
    }
}
