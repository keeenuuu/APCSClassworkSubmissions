import java.util.ArrayList; //import ArrayList
/**
 * ArrayListSorters class
 * @author Keanu
 */
public class Apr29ArrayListSorters 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> nums = new ArrayList<Integer>(); //instantiate an ArrayList of Integers, named nums
		nums.add(25); //add 25 to nums
		nums.add(34); //add 34 to nums
		nums.add(9); //add 9 to nums
		nums.add(107); //add 107 to nums
		nums.add(2); //add 2 to nums
		System.out.println(nums); //print out nums
		bubbleSortNumbers(nums); //sort nums using bubbleSortNumbers method
		System.out.println(nums); //print out nums, now sorted
		ArrayList<String> names = new ArrayList<String>(); //instantiate an ArrayList of Strings, named names
		names.add("Alice"); //add Alice to names
		names.add("James"); //add James to names
		names.add("Phil"); //add Phil to names
		names.add("Richard"); //add Richard to names
		names.add("Max"); //add Max to names
		System.out.println(names); //print out names
		bubbleSortStrings(names); //sort names using bubbleSortStrings method
		System.out.println(names); //pint out names, now sorted
	}
	
	/**
	 * bubbleSortNumbers method: bubble sorts an ArrayList of Integers
	 * @param arr, the ArrayList of Integers
	 */
	public static void bubbleSortNumbers(ArrayList<Integer> arr)
	{
		for (int i = 0; i < arr.size(); i++) //for loop that sets integer i to 0 and increments it until it is not less than the length of the ArrayList
		{
			for (int j = 0; j < arr.size() - 1; j++) //for loop that sets integer j to 0 and increments it until it is not less than the length of the ArrayList, minus 1
			{
				if (Integer.compare(arr.get(j), arr.get(j+1)) > 0) //if statement to check if the current element being checked is greater than the next one, using the compare() method
				{ //if true, swap the current element with the next element
					Integer temp = arr.set(j+1, arr.get(j)); //declare an Integer, named temp, which stores the current Integer at index j+1 of the ArrayList
					//the j+1 index of the ArrayList will also be set to the Integer at index j of the ArrayList
					arr.set(j, temp); //set the Integer at index j of the ArrayList to the temp
				}
			}
		}
	}
	
	
	/**
	 * bubbleSortStrings method: bubble sorts an ArrayList of Strings
	 * @param arr, the ArrayList of Strings
	 */
	public static void bubbleSortStrings(ArrayList<String> arr)
	{
		for (int i = 0; i < arr.size(); i++) //for loop that sets integer i to 0 and increments it until it is not less than the length of the ArrayList
		{
			for (int j = 0; j < arr.size() - 1; j++) //for loop that sets integer j to 0 and increments it until it is not less than the length of the ArrayList, minus 1
			{
				if (arr.get(j).compareTo(arr.get(j+1)) > 0) //if statement to check if the current element being checked is greater than the next one, using the compareTo() method
				{ //if true, swap the current element with the next element
					String temp = arr.set(j+1, arr.get(j)); //declare a String, named temp, which stores the current String at index j+1 of the ArrayList
					//the j+1 index of the ArrayList will also be set to the String at index j of the ArrayList
					arr.set(j, temp); //set the Integer at index j of the ArrayList to the temp
				}
			
			}
		}
	}
}
