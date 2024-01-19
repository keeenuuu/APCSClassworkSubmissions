/**
 * Cake class: creates a Cake object, with a specific flavor and amount of layers
 * @author Keanu
 */
public class Cake
{
	/**
	 * attributes of Cake object: flavor and amount of layers
	 */
	String flavor; //declare String named flavor
	int layerAmount; //declare int named layerAmount
	/**
	 * Cake object: instantiates Cake
	 * @param flavor
	 * @param layerAmount
	 */
	public Cake(String flavor, int layerAmount)
	{
		this.flavor = flavor; //declare this.flavor to be flavor parameter
		this.layerAmount = layerAmount; //declare this.layerAmount to be layerAmount parameter
	}
	/**
	 * second Cake object: instantiates Cake with only one layer
	 * @param flavor
	 */
	public Cake(String flavor)
	{
		this.flavor = flavor; //declare this.flavor to be flavor parameter
		this.layerAmount = 1;; //declare this.layerAmount to be 1
	}
	/**
	 * getFlavor method: returns flavor of Cake object
	 * @return this.flavor
	 */
	public String getFlavor()
	{
		return this.flavor; //return this.flavor
	}
	/**
	 * getLayers method: returns amount of layers of Cake object
	 * @return this.layerAmount
	 */
	public int getLayers()
	{
		return this.layerAmount; //return this.layerAmount
	}
	/**
	 * setFlavor method: takes in another flavor and returns new flavor
	 * @param newFlavor
	 * @return this.Flavor
	 */
	public String setFlavor(String newFlavor)
	{
		this.flavor = newFlavor; //reassigns this.flavor to newFlavor parameter
		return this.flavor; //returns this.flavor
	}
	/**
	 * tellIfTasty method: prints out "This cake is yummy!"
	 */
	public static void tellIfTasty()
	{
		System.out.println("This cake is yummy!"); //print statement
	}
	/**
	 * incrementLayer method: adds another layer to Cake object and returns new amount
	 * @return this.layerAmount
	 */
	public int incrementLayer()
	{
		this.layerAmount++; //adds one to layerAmount
		return this.layerAmount; //returns layerAmount
	}
}
