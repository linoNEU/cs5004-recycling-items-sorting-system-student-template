import recycling.CompareById;
import recycling.CompareByWeight;
import recycling.Item;
import recycling.Material;
import recycling.RecyclingBin;
import recycling.RecyclingBinImpl;

/**
 * Driver class for the program. We create a recycling bin and add items to it. We then sort the
 * items in the recycling bin by their weight and ID. We also print the items.
 */
public class Main {

  /**
   * Main method.
   *
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Create a recycling bin
    RecyclingBin bin = new RecyclingBinImpl();

    // Create some items and add them to the recycling bin
    Item bottle = new Item("Bottle", 1, Material.GLASS, 0.5, true);
    addItemIfAllowed(bin, bottle);
    Item can = new Item("Can", 2, Material.ALUMINUM, 0.3, true);
    addItemIfAllowed(bin, can);
    Item container = new Item("Container", 4, Material.PLASTIC, 0.4, true);
    addItemIfAllowed(bin, container);
    Item can2 = new Item("Another Can", 2, Material.ALUMINUM, 0.3, true);
    addItemIfAllowed(bin, can2);
    Item paper = new Item("Paper", 3, Material.PAPER, 0.2, true);
    addItemIfAllowed(bin, paper);
    Item other = new Item("Other", 5, Material.OTHER, 0.6, false);
    addItemIfAllowed(bin, other);
    addItemIfAllowed(bin, null);

    // Print the items in the recycling bin
    System.out.println("\nItems in the recycling bin in the order they were added:");
    System.out.println(bin.printItems());

    // Sort the items in the recycling bin by weight and ID
    bin.sortItems(new CompareByWeight());
    System.out.println("\nItems in the recycling bin sorted by weight:");
    System.out.println(bin.printItems());

    bin.sortItems(new CompareById());
    System.out.println("\nItems in the recycling bin sorted by ID:");
    System.out.println(bin.printItems());
  }

  /**
   * Adds an item to the recycling bin if it is allowed.
   *
   * @param bin  the recycling bin
   * @param item the item to add
   */
  private static void addItemIfAllowed(RecyclingBin bin, Item item) {
    try {
      bin.addItem(item);
    } catch (IllegalArgumentException e) {
      System.out.println(e.getMessage());
    }
  }
}
