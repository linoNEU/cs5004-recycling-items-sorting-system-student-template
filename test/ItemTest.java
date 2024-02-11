import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import recycling.Item;
import recycling.Material;

/**
 * Test class for the Item class.
 */
public class ItemTest {

  private Item bottle;
  private Item can;
  private Item paper;
  private Item container;
  private Item other;

  /**
   * Set up the test.
   */
  @Before public void setUp() {
    bottle = new Item("Bottle", 1, Material.GLASS, 0.5, true);
    can = new Item("Can", 2, Material.ALUMINUM, 0.3, true);
    paper = new Item("Paper", 3, Material.PAPER, 0.2, true);
    container = new Item("Container", 4, Material.PLASTIC, 0.4, true);
    other = new Item("Other", 5, Material.OTHER, 0.6, false);
  }

  /**
   * Test the constructor and getters.
   */
  @Test public void testConstructorAndGetters() {
    assertEquals("Bottle", bottle.getName());
    assertEquals(1, bottle.getId());
    assertEquals(Material.GLASS, bottle.getMaterialType());
    assertEquals(0.5, bottle.getWeight(), 0.01);
    assertTrue(bottle.isRecyclable());
  }

  /**
   * Test the toString() method.
   */
  @Test public void testToString() {
    assertEquals("Name: Bottle, ID: 1, Material: GLASS, Weight: 0.5 Kg, Recyclable: true",
        bottle.toString());
    assertEquals("Name: Can, ID: 2, Material: ALUMINUM, Weight: 0.3 Kg, Recyclable: true",
        can.toString());
    assertEquals("Name: Paper, ID: 3, Material: PAPER, Weight: 0.2 Kg, Recyclable: true",
        paper.toString());
    assertEquals("Name: Container, ID: 4, Material: PLASTIC, Weight: 0.4 Kg, Recyclable: true",
        container.toString());
    assertEquals("Name: Other, ID: 5, Material: OTHER, Weight: 0.6 Kg, Recyclable: false",
        other.toString());
  }

  /**
   * Test the hashCode() method.
   */
  @Test public void testHashCode() {
    Item item1 = new Item("Bottle", 1, Material.GLASS, 0.5, true);
    Item item2 = new Item("Bottle", 1, Material.GLASS, 0.5, true);
    Item item3 = new Item("Can", 2, Material.ALUMINUM, 0.3, false);

    assertEquals(item1.hashCode(), item2.hashCode());
    assertNotEquals(item1.hashCode(), item3.hashCode());
  }

  /**
   * Test the equals() method.
   */
  @Test public void testEquals() {
    Item item1 = new Item("Bottle", 1, Material.GLASS, 0.5, true);
    Item item2 = new Item("Bottle", 1, Material.GLASS, 0.5, true);
    Item item3 = new Item("Can", 2, Material.ALUMINUM, 0.3, false);

    assertEquals(item1, item2);
    assertNotEquals(item1, item3);
  }
}