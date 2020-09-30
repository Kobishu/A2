package pos.praxis;

import java.util.ArrayList;

public class Cart {
    ArrayList<Product> cart;

    public Cart() {
        this.cart = new ArrayList<>();
    }

    public void add(Product product) {
        cart.add(product);
    }

    public void showCart() {
        for (Product product : cart) {
            System.out.println(product.toString());
            System.out.println("Master test für Conflict");
        }
    }


}
