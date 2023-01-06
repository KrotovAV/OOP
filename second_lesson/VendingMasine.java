package second_lesson.second_2_HW;

import java.util.ArrayList;

public class VendingMasine {
    private ArrayList<Product> products = new ArrayList<>();
    private final static ArrayList<Product> initProducts = new ArrayList<>();

    static {
        initProducts.add(new Product("Пуст", 0));
    }

    public VendingMasine() {
        this(initProducts);
    }

    public VendingMasine(ArrayList<Product> products) {
        this.products = products;
    }

    public VendingMasine(String name, int cost) {
        this.products = new ArrayList<>();
        products.add(new Product(name, cost));
    }

    public Product getProduct(String findName) {
        for (Product product : products) {
            if (product.getName().equals(findName)) {
                return product;
            }
        }
        // if (product.size() == 0) {
        return null;
        // }
    }
    public Product getProduct(int findCost) {
        for (Product product : products) {
            if (Integer.toString(product.getCost()).equals(Integer.toString(findCost))) {
                return product;
            }
        }
        // if (product.size() == 0) {
        return null;
        // }
    }
    @Override
    public String toString() {
        String result = "";
        for(Product product: products) {
            result = result + product.toString() + "\n"; 
        }
        return result;
    }
}
 
