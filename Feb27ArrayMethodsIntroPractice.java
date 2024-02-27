/**
 * Array Methods Intro Practice
 * @author Keanu
 */
public class Feb27ArrayMethodsIntroPractice 
{
	public static void main(String[] args) 
	{
		int[] arr = {6, 8, 4, 10, 14, 18}; //declare new integer array, named arr, and assign it 6 values
		divideElementByTwo(arr, 3); //call divideElementByTwo, which will divide the 3rd element of arr by two
		int[] firstAndLast = giveFirstAndLastArray(arr); //declare new integer array, named firstAndLast, and assign it the first and last values of arr, calling giveFirstAndLastArray
	}
	
	/**
	 * TASK 1: Create a method divideElementByTwo that is passed an integer array arr and and integer n.
	 * The method will change arr such that its nth element is divided by two.
	 * @param arr, the integer array being changed.
	 * @param n, the index of the array that will be divided by two
	 */
	public static void divideElementByTwo(int[] arr, int n)
	{
		arr[n] /= 2;
	}
	
	/**
	 * TASK 2: Create a method giveFirstAndLastArray that if passed an array, will return an array consisting of only the first and last elements.
	 * @param arr, the array, from which the method will grab the first and last elements
	 * @return firstAndLast, a new array consisting of the first and last elements of the original array
	 */
	public static int[] giveFirstAndLastArray(int[] arr)
	{
		int[] firstAndLast = {arr[0], arr[arr.length-1]};
		return firstAndLast;
	}
}
