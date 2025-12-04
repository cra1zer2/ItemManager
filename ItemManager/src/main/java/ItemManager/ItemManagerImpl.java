package ItemManager;

import java.util.ArrayList;
import java.util.List;

public class ItemManagerImpl implements ItemManager {

    private ArrayList<Product> productList;

    public ItemManagerImpl() {
        this.productList = new ArrayList<Product>();
    }

    public void showList(ArrayList<Product> productList) {
        int index = 1;
        for (Product product : productList) {
            System.out.println(index + ". " + product.getName());
            index++;
        }
    }

    public void markAsPurchased(int index) {
        if (index < 1 | index > productList.size()) {
            return;
        }
        productList.get(index - 1).setPurchased(true);
    }

    public void addItem(String name, int quantity, String category) {
        productList.add(new Product(name, quantity, category, false));
    }

    public void removeItem(String name) {
        Product productToRemove = findItem(name);
        if (productToRemove != null) {
            productList.remove(productToRemove);
        }
    }

    public Product findItem(String name) {
        for (Product p : productList) {
            if (p.getName().equals(name)) {
                return p;
            }
        }
        return null;
    }

    public List<Product> getAllItems() {
        return productList;
    }


}
