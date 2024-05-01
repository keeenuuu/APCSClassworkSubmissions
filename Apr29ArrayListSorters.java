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
		nums.add(25);
		nums.add(34);
		nums.add(9);
		nums.add(17);
		nums.add(2);
		System.out.println(nums);
		bubbleSortNumbers(nums);
		System.out.println(nums);
		ArrayList<String> names = new ArrayList<String>(); //instantiate an ArrayList of Strings, named names
		names.add("Alice");
		names.add("James");
		names.add("Phil");
		names.add("Richard");
		names.add("Max");
		System.out.println(names);
		bubbleSortStrings(names);
		System.out.println(names);
	}
	
	/**
	 * bubbleSortNumbers method: bubble sorts an ArrayList of Integers
	 * @param arr, the ArrayList of Integers
	 */
	public static void bubbleSortNumbers(ArrayList<Integer> arr)
	{
		for (int i = 0; i < arr.size(); i++)
		{
			for (int j = 0; j < arr.size() - 1; j++)
			{
				if (Integer.compare(arr.get(j), arr.get(j+1)) > 0)
				{
					Integer temp = arr.set(j+1, arr.get(j));
					arr.set(j, temp);
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
		for (int i = 0; i < arr.size(); i++)
		{
			for (int j = 0; j < arr.size() - 1; j++)
			{
				if (arr.get(j).compareTo(arr.get(j+1)) > 0)
				{
					String temp = arr.set(j+1, arr.get(j));
					arr.set(j, temp);
				}
			}
		}
	}
}
