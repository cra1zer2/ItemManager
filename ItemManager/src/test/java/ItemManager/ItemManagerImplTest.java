package ItemManager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

class ItemManagerImplTest {

    private ItemManagerImpl itemManager;

    @BeforeEach
    void setUp() {
        itemManager = new ItemManagerImpl();
    }

    @Test
    void testProductConstructor() {
        Product p = new Product("TestItem", 5, "TestCat", false);
        assertEquals("TestItem", p.getName());
        assertEquals(5, p.getQuantity());
        assertEquals("TestCat", p.getCategory());
        assertFalse(p.isPurchased());
    }

    @Test
    void testProductSetPurchased() {
        Product p = new Product("TestItem", 1, "Cat", false);
        p.setPurchased(true);
        assertTrue(p.isPurchased());
    }

    @Test
    void testAddItem() {
        itemManager.addItem("Apple", 10, "Fruit");
        List<Product> items = itemManager.getAllItems();
        assertEquals(1, items.size());
        assertEquals("Apple", items.getFirst().getName());
    }

    @Test
    void testRemoveItem() {
        itemManager.addItem("Apple", 10, "Fruit");
        itemManager.removeItem("Apple");
        assertEquals(0, itemManager.getAllItems().size());
    }

    @Test
    void testRemoveNonExistentItem() {
        itemManager.addItem("Apple", 10, "Fruit");
        itemManager.removeItem("Banana");
        assertEquals(1, itemManager.getAllItems().size());
    }

    @Test
    void testFindItem() {
        itemManager.addItem("Banana", 5, "Fruit");
        Product p = itemManager.findItem("Banana");
        assertNotNull(p);
        assertEquals("Banana", p.getName());

        Product notFound = itemManager.findItem("Ghost");
        assertNull(notFound);
    }

    @Test
    void testMarkItemAsPurchased() {
        itemManager.addItem("Milk", 1, "Dairy");
        itemManager.markAsPurchased(1);

        Product p = itemManager.findItem("Milk");
        assertTrue(p.isPurchased());
    }

    @Test
    void testMarkItemAsPurchasedInvalidIndex() {
        itemManager.addItem("Milk", 1, "Dairy");
        itemManager.markAsPurchased(0);
        itemManager.markAsPurchased(2);

        Product p = itemManager.findItem("Milk");
        assertFalse(p.isPurchased());
    }
}
