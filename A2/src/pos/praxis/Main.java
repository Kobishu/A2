package pos.praxis;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Cart c1 = new Cart();

        Product p1 = new Product ("Fernseher", 11, 1, "Elektroartikel");
        Product p2 = new Product("Kartoffel", 2, 5, "Lebensmittel");
        Product p3 = new Product("Regenschirm", 5, 1, "Utensilien");

        c1.add(p1);
        c1.add(p2);
        c1.add(p3);


        c1.showCart();
    }
}
