/**
 * BubbleSorter class
 * @author Keanu
 */
public class Apr2BubbleSorter 
{
	public static void main(String[] args) 
	{
		int[] nums = makeRandom(); //declare integer array, named nums, and assign it the array produced by the makeRandom method
		bubbleSort(nums); //sort nums array using bubbleSort method
		printArr(nums); //print nums array using printArr method
	}
	
	/*
	 * makeRandom method: creates an array containing 2000 large numbers
	 * @return bigNums, the array created
	 */
	private static int[] makeRandom() {
		
		int[] bigNums = new int[2000]; //declare integer array, named bigNums, with a length of 2000
		int len = bigNums.length; //declare integer, named len, which is the length of bigNums
		for (int i = 0; i < len; i++) //for loop, which sets integer i to 0 and increments it until it is not less than len
		{
			int randomNumber = (int) ((Math.random() * 1000) + 1); //declare integer, named randomNumber, which generates a random integer from 1 to 1000
			bigNums[i] = randomNumber; //make the ith index of the bigNums array to be the randomNumber generated
			
		}
		return bigNums; //return bigNums
	}
	
	/**
	 * bubbleSort method: bubble sorts an integer array
	 * @param arr, the integer array being sorted
	 */
	public static void bubbleSort(int[] arr)
	{
		for (int i = 0; i < arr.length; i++) //for loop that sets integer i to 0 and increments it until it is not less than the length of the array
		{
			for (int j = 0; j < arr.length-1; j++) //for loop that sets integer j to 0 and increments it until it is not less than the length of the array, minus 1
			{
				if (arr[j] > arr[j+1]) //if statement to check if the current element being checked is greater than the next one
				{ //if true, swap the current element with the next element
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	
	/**
	 * printArr method: prints out an array
	 * @param arr
	 */
	public static void printArr(int[] arr)
	{
		int traverser;
		for (traverser = 0; traverser < arr.length; traverser++)
		{
			System.out.println(arr[traverser]);
		}
	}
}
