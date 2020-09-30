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
<<<<<<< HEAD
            System.out.println("Test für Git");
            System.out.println("Zweiter test auf Feature Branch");
=======
            System.out.println("Master test für Conflict");
            System.out.println("Zweiter Test Master");
>>>>>>> 9ed4d8727b297d24eaf5b1e03eb0b2d2494acdb0
        }
    }


}
