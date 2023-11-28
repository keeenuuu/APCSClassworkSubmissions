/**
 * BakeryMain class: instantiate baked goods and print info about baked goods
 * @author Keanu
 */
public class BakeryMain 
{
	public static void main(String[] args) 
	{
		giveCake(); //call giveCake method to instantiate Cake object
	}
	/**
	 * giveCake method: instantiates Cake object and runs functionalities
	 */
	public static void giveCake()
	{
		Cake myCake = new Cake("Apple", 3); //instantiates Cake object, named myCake, with Apple flavor and 3 layers 
		System.out.println(myCake.getFlavor()); //print result of getFlavor method to tell flavor of myCake
		System.out.println(myCake.getLayers()); //print result of getLayers method to tell amount of layers of myCake
		myCake.setFlavor("Pumpkin"); //call setFlavor method to set flavor of myCake to Pumpkin
		System.out.println(myCake.getFlavor()); //print new result of getFlavor method to tell new flavor of myCake
		Cake.tellIfTasty(); //call tellIfTasty method to determine if Cake is tasty
		System.out.println(myCake.incrementLayer()); //print result of incrementLayer method to add a layer to myCake
		System.out.println(myCake.getLayers()); //print result of getLayers method to tell new amount of layers of myCake
	}
}
