/**
 * printPrevNextElement
 * @author Keanu
 */
public class Mar1PrintPrevNextElement 
{
	public static void main(String[] args) 
	{
		double[] arr = {2.45, 5.28, 3.19, 1.73, 4.64, 8.24, 9.89}; //declare double array, named arr, and assign it double data types
		int index = 3; //declare int, named index, and assign it 3
		printPrevNextElement(arr, index); //call printPrevNextElement, passing it arr and index
	}
	
	/**
	 * printPrevNextElement method: prints out the number before and after a given element of an array.
	 * precondition: the method will never be passed an index that creates an ArrayIndexOutOfBoundsException error.
	 * @param nums, the array being utilized
	 * @param n, the index used for reference
	 */
	public static void printPrevNextElement(double[] nums, int n)
	{
		System.out.println("The number before index " + n + " is " + nums[n-1] + "."); //print statement to display number before specified index
		System.out.println("The number after index " + n + " is " + nums[n+1] + "."); //print statement to display number after specified index
	}
}
