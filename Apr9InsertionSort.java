/**
 * Insertion Sort class
 * @author Keanu
 */
public class Apr8InsertionSort 
{
	public static void main(String[] args) 
	{
		int[] arr = {1, 5, 8, 10, 3, 7, 2}; //declare an integer array of numbers, named arr
		insertionSort(arr); //sort arr using the insertionSort method
	}
	
	/**
	 * arrayShifter method: sorts an element of an array at a given index by comparing it to the previous elements
	 * @param arr, the array which the element is taken from
	 * @param index, the index which the element is taken from
	 */
	public static void arrayShifter(int[] arr, int index)
	{
		int last = arr[index]; //declare integer, named last, which takes the element at the specified index
		for (int i = index-1; i >= 0; i--) //for loop which sets integer i to the index minus 1, and decrements it until it is not less than or equal to 0
		{
			if (last < arr[i]) //if statement to check if the element of the specified index is less than the current index element being traversed
			{
				//if true, switch the two elements
				int temp = last;
				arr[i+1] = arr[i];
				arr[i] = temp;
				last = arr[i]; //reassign last value to the current element being checked
			}
		}
	}
	
	/**
	 * insertionSort method: sorts an array using insertion sort, checking and moving each element down until it is in the right place
	 * @param arr, the array being sorted
	 */
	public static void insertionSort(int[] arr)
	{
		for (int i = 1; i < arr.length; i++) //for loop which sets integer i to 1 and increments it until it is not less than the length of the array
		{
			arrayShifter(arr, i); //checks and sorts each element of the array using the arrayShifter method
		}
	}
}
