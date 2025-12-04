package ItemManager;

public class Product {
    private String name;
    private int quantity;
    private String category;
    private boolean purchased;
    public Product(String name, int quantity, String category, boolean purchased) {
        this.name = name;
        this.quantity = quantity;
        this.category = category;
        this.purchased = false;
    }

    public void showProductInfo() {
        System.out.println(name + " (" + quantity + " szt.) - " + category + " [" + ((purchased) ? "KUPIONE" : "NIEKUPIONE") + "]");
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                ", category='" + category + '\'' +
                ", purchased=" + purchased +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isPurchased() {
        return purchased;
    }

    public void setPurchased(boolean purchased) {
        this.purchased = purchased;
    }
}
