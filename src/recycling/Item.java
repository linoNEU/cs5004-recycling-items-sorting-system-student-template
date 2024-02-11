package recycling;

/**
 * This is the Item class. Items have a name, id, materialType (glass, plastic, paper, aluminum),
 * weight, and information on whether is recyclable or not.
 */
public class Item {
  private final String name;
  private final int id;
  private final Material materialType;
  private final double weight;
  private final boolean isRecyclable;

  /**
   * Constructor for the Item class.
   *
   * @param name         the name of the item
   * @param id           the id of the item
   * @param materialType the material type of the item
   * @param weight       the weight of the item
   * @param isRecyclable whether the item is recyclable or not
   */
  public Item(String name, int id, Material materialType, double weight, boolean isRecyclable) {
    this.name = name;
    this.id = id;
    this.materialType = materialType;
    this.weight = weight;
    this.isRecyclable = isRecyclable;
  }

  /**
   * Returns the name of the item.
   *
   * @return the name of the item
   */
  public String getName() {
    return name;
  }

  /**
   * Returns the id of the item.
   *
   * @return the id of the item
   */
  public int getId() {
    return id;
  }

  /**
   * Returns the material type of the item.
   *
   * @return the material type of the item
   */
  public Material getMaterialType() {
    return materialType;
  }

  /**
   * Returns the weight of the item in Kilograms.
   *
   * @return the weight of the item
   */
  public double getWeight() {
    return weight;
  }

  /**
   * Returns whether the item is recyclable or not.
   *
   * @return true if the item is recyclable, false otherwise
   */
  public boolean isRecyclable() {
    return isRecyclable;
  }

  /**
   * Returns the information of the item in a formatted string.
   *
   * @return the information of the item in a formatted string
   */
  public String toString() {
    return "Name: " + name + ", ID: " + id + ", Material: " + materialType + ", Weight: " + weight
        + " Kg, Recyclable: " + isRecyclable;
  }

  /**
   * Returns the hash code of the item.
   *
   * @return the hash code of the item
   */
  public int hashCode() {
    // TODO Write this method.
    return 0;
  }

  /**
   * Returns whether the item is equal to another item.
   *
   * @param obj the other item
   * @return true if the item is equal to the other item, false otherwise
   */
  public boolean equals(Object obj) {
    // TODO Write this method.
    return false;
  }
}
