/**
 * sumArrElements and makeEveryOtherOne classwork
 * @author Keanu
 */
public class Mar7TraversalMethodsClasswork 
{
	public static void main(String[] args) 
	{
		int[] intArr = {2, 10, 67, 8, 17, 34}; //declare integer array, named intArr
		double[] doubleArr = {3.4, 15.0, 23.6, 58.9}; //declare double array, named doubleArr
		System.out.println(sumArrElements(doubleArr)); //print out the sum of the double array using sumArrElements method
		makeEveryOtherOne(intArr); //make every other element of the integer array equal to 1 using makeEveryOtherOne method
	}
	
	/**
	 * 1) sumArrElements method: sums up the elements of an array of doubles
	 * @param arr, the double array whose elements are being summed up
	 * @return sum, the sum of the double array elements
	 */
	public static double sumArrElements(double[] arr)
	{
		double sum = 0; //declare double, named sum, to store sum of elements; default value is zero
		int traverser; //declare integer, named traverser, to traverse the array
		for (traverser = 0; traverser < arr.length; traverser++) //create a for loop, which sets traverser equal to 0 and increments it until it is not less than the length of the array
		{
			sum += arr[traverser]; //add the value of the element at the traverser index to the sum
		}
		return sum; //return sum of elements
	}
	
	/**
	 * 2) makeEveryOtherOne method: assign every other element of an array to 1
	 * @param arr, the integer array being transformed
	 */
	public static void makeEveryOtherOne(int[] arr)
	{
		int traverser; //declare integer, named traverser, to traverse the array
		for (traverser = 1; traverser < arr.length; traverser += 2) //create a for loop, which sets traverser equal to 1 and increments it by 2 until it is not less than the length of the array
		{
			arr[traverser] = 1; //set the element at the traverser index of the array equal to 1
		}
	}
}
