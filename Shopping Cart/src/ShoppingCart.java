import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShoppingCart {
    private List<Product> products;

    public ShoppingCart() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }

    public int totalPrice() {
        return this.products.stream().map(product -> product.getPrice())
        .reduce((acc, precio) -> acc + precio).orElse(0);
    }

    public int discount() {
        if (products.size() > 4)
            return this.totalPrice() - this.totalPrice() * 10 / 100;
        else
            return this.totalPrice();
    }

    public void freeItems(){
        int precioFinal = this.totalPrice();
        Map<String, Integer> count = new HashMap<>();

        products.forEach(product -> {
            if(count.containsKey(product.getName())) {
                    count.replace(product.getName(), count.get(product.getName() + 1));
            } else {
                count.put(product.getName(), 1);
            }
        });

        count.keySet().forEach(key -> {
            if (count.get(key)/4 >= 1){
                int cantidadQueRegalamos = (count.get(key)/4);
                int precioDelObjeto = products.stream().filter(producto -> producto.getName() == key).findFirst().get().getPrice();

                precioFinal = precioFinal - (cantidadQueRegalamos * precioDelObjeto);
            }
        });
        return precioFinal;
    }
}

hola caracola