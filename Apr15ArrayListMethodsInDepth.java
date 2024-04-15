import java.util.ArrayList; //import ArrayList
/**
 * ArrayListMethodsInDepth
 * @author Keanu
 */
public class Apr15ArrayListMethodsInDepth 
{
	public static void main(String[] args) 
	{
		ArrayList<String> foods = new ArrayList<String>(); //instantiate an ArrayList of Strings, named foods
		foods.add("Apples"); //add Apples to foods
		foods.add("Bread"); //add Bread to foods
		foods.add("Cookies"); //add Cookies to foods
		
		System.out.println(foods.size()); //print out the length of foods
		//the .size() method gets the length of the ArrayList (in this case, 3),
		//and returns the length (in this case, 3)
		
		System.out.println(foods.add("Dole Whip")); //add Dole Whip to foods - will print true
		//the .add(E) method adds another element to an ArrayList (in this case, Dole Whip) attached to the end,
		//and returns a boolean (in this case, true)
		System.out.println(foods.size());
		
		System.out.println(foods.set(1, "Butter")); //change Bread in foods to Butter - will print Bread
		//the .set(int, E) method replaces the element of an ArrayList at the specified index (in this case, Bread at index 1),
		//replaces it with a new element (in this case, Butter),
		//and returns the element which was removed (in this case, Bread)
		System.out.println(foods.size());
		
		System.out.println(foods.remove(2)); //remove Cookies from foods - will print Cookies
		//the .remove(int) method removes an element from an ArrayList at the specified index (in this case, Cookies at index 2),
		//and returns the element which was removed (in this case, Cookies)
		System.out.println(foods.size());
	}
}
