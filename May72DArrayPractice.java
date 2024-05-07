/**
 * 2DArrayPractice class
 * @author Keanu
 */
public class May72DArrayPractice 
{
	public static void main(String[] args) 
	{
		String[][] stringArr = {{"fl", "eh", "fl", "eh", "fl", "eh"},
								{"he", "qi", "he", "qi", "he", "qi"},
								{"dy", "ds", "dy", "ds", "dy", "ds"},
								{"fl", "eh", "fl", "eh", "fl", "eh"},
								{"he", "qi", "he", "qi", "he", "qi"},
								{"dy", "ds", "dy", "ds", "dy", "ds"},
								{"fl", "eh", "fl", "eh", "fl", "eh"}}; //declare 2D String array, named stringArr, with 7 rows and 6 columns, with specified String elements
		print2DArray(stringArr); //print stringArr using print2D array
		double[][] doubleArr = new double[4][6]; //declare 2D double array, named doubleArr, which creates a null 2D double array with 4 rows and 6 columns
		double[][] doubleArr2 = (allOnesDoubleArray(doubleArr)); //declare 2D double array, named doubleArr2, which creates a 2D double array of 1.0s based on doubleArr, using the allonesDoubleArray method
	}
	
	/**
	 * print2DArray method: prints a 2D Array (in row-major order)
	 * @param arr, the 2D array of Strings being printed
	 */
	public static void print2DArray(String[][] arr)
	{
		for (int i = 0; i < arr.length; i++) //for loop, which sets i to 0 and increments it until it is not less than the length of arr (to traverse the rows)
		{
			for (int j = 0; j < arr[0].length; j++) //for loop, which sets j to 0 and increments it until it is not less than the length of the 0th index of arr (to traverse the columns)
			{
				System.out.print(arr[i][j] + " "); //print each element, in row-major order, allowing spacing between them
			}
			System.out.print("\n"); //line break for rows
		}
	}
	
	/**
	 * allOnesDoubleArray method: creates a 2D array of doubles based off a reference, and fills it with 1.0s
	 * @param arr, the 2D array of doubles being referenced
	 * @return copyArr, a new transformed 2D array
	 */
	public static double[][] allOnesDoubleArray(double[][] arr)
	{
		double[][] copyArr = new double[arr.length][arr[0].length]; //instantiate a 2D double array, named copyArr, whose rows and columns match with the reference arr
		for (int i = 0; i < arr.length; i++) //for loop, which sets i to 0 and increments it until it is not less than the length of arr (to traverse the rows)
		{
			for (int j = 0; j < arr[0].length; j++) //for loop, which sets j to 0 and increments it until it is not less than the length of the 0th index of arr (to traverse the columns)
			{
				copyArr[i][j] = 1.0; //set each element to 1.0
			}
		}
		return copyArr; //return copyArr
	}
}
