/**
 * Traversal Methods Homework
 * @author Keanu
 */
public class Mar14TraversalMethodsHomework 
{
	public static void main(String[] args) 
	{
		int[] intArr = {2, 6, 3, 9, 1, 1, 4};
		System.out.println(findHighestInt(intArr)); //print out highest value of intArr (prints out 9)
		
		double[] doubleArr = {3.1, 4.2, 5.0, 6.2, 6.9};
		System.out.println(findDoubleAverage(doubleArr)); //print out average double of doubleArr (prints out 5.08)
		
		int[] intArrNoEvens = {1, 5, 7};
		int[] intArrSomeEvens = {1, 6, 9};
		int[] intArrAllEvens = {4, 2, 18};
		System.out.println(checkForAnyEvens(intArrNoEvens)); //print out if intArrNoEvens has any even values (prints out false)
		System.out.println(checkForAnyEvens(intArrSomeEvens)); //print out if intArrSomeEvens has any even values (prints out true)
		System.out.println(checkForAllEvens(intArrSomeEvens)); //print out if intArrSomeEvens has all even values (prints out false)
		System.out.println(checkForAllEvens(intArrAllEvens)); //print out if intArrAllEvens has all even values (prints out true)
		
		double[] doubleArrNoConsecutive = {3.1, 7.1, 6.6, 9.3};
		double[] doubleArrHasConsecutive =  {2.0, 8.8, 8.8, 8.8, 9.0, 3.1};
		System.out.println(checkForThreeConsecutiveEquals(doubleArrNoConsecutive)); //print out if doubleArrNoConsecutive has three consecutive, equal values (prints out false)
		System.out.println(checkForThreeConsecutiveEquals(doubleArrHasConsecutive)); //print out if doubleArrHasConsecutive has three consecutive, equal values (prints out true)
	}

	/**
	 * findHighestInt method: finds the highest integer value in an array
	 * @param arr, the integer array being checked
	 * @return the highest value of the array
	 */
	public static int findHighestInt (int[] arr)
	{
		int highest = arr[0]; //declare integer, named highest, to store the highest integer value in the array, and have it hold the first integer value of the array
		int traverser; //declare integer, named traverser, to traverse the array
		for (traverser = 1; traverser < arr.length; traverser++) //for loop, which sets traverser to 1 and increments it until it is not less than the length of the array, to traverse the array
		{
			if (arr[traverser] > highest) //if statement to check if the current integer element is both not equal to and greater than the highest value
			{
				highest = arr[traverser]; //change value of highest to current integer element if it is greater than the highest value
			}
		}
		return highest; //return the highest value
	}
	
	/**
	 * findDoubleAverage method: finds the average value out a set of double array values
	 * @param arr, the double array being checked
	 * @return the average double value
	 */
	public static double findDoubleAverage (double[] arr)
	{
		double sum = 0; //declare double, named sum, to store the combined value of the double elements
		int traverser; //declare integer, named traverser, to traverse the array
		for (traverser = 0; traverser < arr.length; traverser++) //for loop, which sets traverser to 0 and increments it until it is not less than the length of the array, to traverse the array
		{
			sum += arr[traverser]; //adds the current double element to the sum
		}
		return sum / arr.length; //return the average double value, which is the sum divided by the length of the array
	}
	
	/**
	 * checkForAnyEvens method: checks if an integer array has any even values
	 * @param arr, the integer array being checked
	 * @return whether or not there is an even value in the array
	 */
	public static boolean checkForAnyEvens (int[] arr)
	{
		int traverser; //declare integer, named traverser, to traverse the array
		for (traverser = 0; traverser < arr.length; traverser++) //for loop, which sets traverser to 0 and increments it until it is not less than the length of the array, to traverse the array
		{
			if (arr[traverser] % 2 == 0) //if statement to check if the current integer element is even, by checking if it is divisible by 2
			{
				return true; //return true if the current integer value is even
			}
		}
		return false; //return false if none of the integer values are even
	}
	
	/**
	 * checkForAllEvens method: checks if an integer array has all even values
	 * @param arr, the integer array being checked
	 * @return whether or not all values in an array are even
	 */
	public static boolean checkForAllEvens (int[] arr)
	{
		int traverser; //declare integer, named traverser, to traverse the array
		for (traverser = 0; traverser < arr.length; traverser++) //for loop, which sets traverser to 0 and increments it until it is not less than the length of the array, to traverse the array
		{
			if (arr[traverser] % 2 != 0) //if statement to check if the current integer element is odd, by checking if it is not divisible by 2
			{
				return false; //return true if the current integer value is odd
			}
		}
		return true; //return false if all of the integer values are even (none were odd when checked)
	}
	
	/**
	 * checkForThreeConsecutiveEquals method: checks if three consecutive, equal double values appear in a double array
	 * @param arr, the double array being checked
	 * @return whether or not there are three consecutive, equal values
	 */
	public static boolean checkForThreeConsecutiveEquals (double[] arr)
	{
		int traverser; //declare integer, named traverser, to traverse the array
		for (traverser = 2; traverser < arr.length; traverser++) //for loop, which sets traverser to 2 and increments it until it is not less than the length of the array, to traverse the array
		{
			if (arr[traverser] == arr[traverser-1] && arr[traverser] == arr[traverser-2]) //if statement to check if the current double value is equal to the previous two values
			{
				return true; //returns true if the current double value is equal to the previous two values
			}
		}
		return false;
	}
}
