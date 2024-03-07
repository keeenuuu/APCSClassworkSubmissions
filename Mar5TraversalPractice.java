/*
  Traverser Practice
  @author Keanu
  
  For each method, answer the following tasks:

  1. What is passed to the method?
  2. What does the method return?
  3. What variable is used to traverse the array? 
  4. On first glance, what does the method look like it is supposed to do? 

  5. Now, go through each line and exlplain what each line (or each part of the method) does. 
  6. What is the purpose of the method?
*/

/**
* 1. the method is passed an integer array, named arr.
* 2. the method returns newArr, a double array.
* 3. the integer i is used to traverse the array.
* 4. The method creates a double array whose values come from the integer array it was passed.
* 6. the purpose of the method is to create a new array, similar to the original integer array, but with values that are doubles.
*/
public static double[] traverserOne( int[] arr ) //5. declare new method, named traverserOne, which is passed an integer array, arr, and returns a double array
	{
		double[] newArr = new double[arr.length]; //5. declare new double array, named newArr, and assign it  the same length as the integer array
		
		for (int i = 0; i < arr.length; i++) //5. create a for loop which sets integer i to zero and increments it until it is not less than the length of the integer array. this is used for traversing
		{
			newArr[i] = ( (double) (arr[i]) ); //5. the ith element of the double array is assigned the ith element of the integer array, cast as a double
		}
		
		return newArr; //5. returns the new double array
	}
	
/**
* 1. the method is passed an integer array, arr, and an integer, n.
* 2. the method returns arr.
* 3. the integer index is used to traverse the array.
* 4. this method adds the integer n to each element of the array.
* 6. the purpose of the method is to increase the elements of an array by a specified value.
*/
public static int[] traverserTwo( int[] arr , int n ) //5. declare new method, named traverserTwo, which is passed an integer array, arr, and an integer, n, and returns an integer array
	{
		for (int index = 0; index < arr.length; index++) //5. create a for loop, which sets integer index to 0 and increments it until it is not less than the length of the array. this is used for traversing
		{
			arr[index] = ( arr[index] + n ); //5. the index'th element of the array is increased by the value of n
		}
		
		return arr; //5. returns the new, updated array
	}
	
/**
* 1. the method is passed a double array, arr.
* 2. the method returns c, an integer.
* 3. the integer j is used to traverse the array.
* 4. this method counts how many elements of an array are equal to 4.0.
* 6. the puepose of the method is to count the number of time 4.0 appears in a specified array.
*/
public static int traverserThree( double[] arr ) //5. declare new method, named transverserThree, which is passed a double array, arr, and returns an integer
	{
		int c = 0; //5. declare an integer, named c, and assign it 0
		
		for (int j = 0; j <= arr.length-1; j++) //5. create for loop, which sets integer j to 0 and increments it until it is not less than or equal to the array length minus 1. this is used for traversing
		{
			if ( arr[j] == 4.0 ) //5. if statement to check if the jth element of the array is equal to 4.0
			{
				c++; //5. increments c by 1 if the jth element is equal to 4.0
			}
		}
		return c; //5. returns final value of c
	}
