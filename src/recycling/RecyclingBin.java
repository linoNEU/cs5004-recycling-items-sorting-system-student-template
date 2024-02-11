package recycling;

import java.util.Comparator;

/**
 * The RecyclingBin Interface defines a recycling bin that can hold items and sort them.
 */
public interface RecyclingBin {

  /**
   * Adds an item to the recycling bin.
   *
   * @param item the item to be added
   * @throws IllegalArgumentException if the item is null, if the item is not recyclable, or if the
   *                                  ID of the item is already in the recycling bin.
   */
  void addItem(Item item) throws IllegalArgumentException;

  /**
   * Removes an item from the recycling bin.
   *
   * @param id the id of the item to be removed
   * @return the removed item
   */
  Item removeItem(int id);

  /**
   * Returns the number of items in the recycling bin.
   *
   * @return the number of items in the recycling bin
   */
  int size();

  /**
   * Sorts the items in the recycling bin using the given comparator.
   *
   * @param comparator the comparator to be used
   */
  void sortItems(Comparator<Item> comparator);

  /**
   * Prints the items in the recycling bin.
   *
   * @return the items in the recycling bin
   */
  String printItems();
}
