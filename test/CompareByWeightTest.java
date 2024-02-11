import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import recycling.CompareByWeight;
import recycling.Item;
import recycling.Material;

/**
 * Test class for the CompareByWeight class.
 */
public class CompareByWeightTest {

  private CompareByWeight compareByWeight;
  private Item bottle;
  private Item can;
  private Item paper;

  /**
   * Set up the test.
   */
  @Before public void setUp() {
    compareByWeight = new CompareByWeight();
    bottle = new Item("Bottle", 1, Material.GLASS, 0.5, true);
    can = new Item("Can", 2, Material.ALUMINUM, 0.3, true);
    paper = new Item("Paper", 3, Material.PAPER, 0.2, true);
  }

  /**
   * Test the compare() method.
   */
  @Test public void testCompare() {
    assertTrue(compareByWeight.compare(bottle, can) > 0);
    assertTrue(compareByWeight.compare(can, bottle) < 0);
    assertTrue(compareByWeight.compare(paper, can) < 0);
    assertEquals(0, compareByWeight.compare(bottle, bottle));
  }
}