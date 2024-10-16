import java.util.ArrayList;

public class Catalog {
    ArrayList<Product> products = new ArrayList<>();

    public Catalog() {
        Groceries tomato = new Groceries("tomato", 22.24);
        Groceries cheese = new Groceries("cheese", 33.51);
        Groceries sauce = new Groceries("sauce", 19.25);
        Clothes skirt = new Clothes("skirt", 400.4);
        Clothes shirt = new Clothes("shirt", 40.5);
        Toys car = new Toys("car", 40.77);
        Toys tiger = new Toys("tiger", 49.77);
    }
    public void addProduct(Product product) {
        products.add(product);
    }

}
