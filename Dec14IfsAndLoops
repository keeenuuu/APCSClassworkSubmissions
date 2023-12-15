import java.util.Scanner; //import Scanner
/**
 * IfsAndLoops class: utilizes if statements and loops to perform tasks on user-inputted numbers:
 * @author Keanu
 */
public class Dec14IfsAndLoops 
{
	public static void main(String[] args) 
	{
		// TASK 1
		Scanner consoleReader = new Scanner(System.in); //instantiate Scanner object, named consoleReader
		System.out.println("What is your first number?"); //print statement to indicate user to input first integer
		Integer x = consoleReader.nextInt(); //scan in first integer and store it in an Integer object, named x
		System.out.println("What is your second number?"); //print statement to indicate user to input second integer
		Integer y = consoleReader.nextInt(); //scan in second integer and store it in another Integer object, named y
		consoleReader.close(); //close consoleReader
		
		System.out.println("");
		// TASK 2
		printEvenOrOdd(x, y); //call printEvenOrOdd method and pass it x and y, to print whether or not x and y are even or odd
		
		// TASK 3
		System.out.println("");
		printExpTable(x, y); //call printExpTable method and pass it x and y, to print the exponent table of x to the y (if both numbers are positive)
		
		//TASK 4
		System.out.println("");
		int factorial = getFact(x); //call getFact method and pass it x, to return the factorial of x
		System.out.println("The factorial of " + x + " is " + factorial + "."); //print out the factorial
	}
	/**
	 * printEvenOrOdd method: prints whether or not Integer x and Integer y are even or odd
	 * @param x
	 * @param y
	 */
	public static void printEvenOrOdd(Integer x, Integer y)
	{
		if (2 * (x/2) == x && 2 * (y/2) == y) //if statement to check if both x and y are even
		//if Integer is even, dividing it in half and re-multiplying it by 2 would result in the original number
		//if Integer is odd, dividing it in half and re-multiplying it by 2 would result in a different number, as Integers truncate after the decimal
		{
			System.out.println(x + " and " + y + " are both even."); //print statement to display result
		}
		else if (2 * (x/2) != x && 2 * (y/2) == y) //else if statement to check if x is odd and y is even
		{
			System.out.println(x + " is odd, and " + y + " is even."); //print statement to display result
		}
		else if (2 * (x/2) == x && 2 * (y/2) != y) //else if statement to check if x is even and y is odd
		{
			System.out.println(x + " is even, and " + y + " is odd."); //print statement to display result
		}
		else //else statement will run when both x and y are odd
		{
			System.out.println(x + " and " + y + " are both odd."); //print statement to display result
		}
	}
	/**
	 * printExpTable method: prints the exponent table of x to the y (if both numbers are positive)
	 * @param x
	 * @param y
	 */
	public static void printExpTable(Integer x, Integer y)
	{
		if (x >= 0 && y >= 0) //if statement to check if both numbers are positive
		{
			for (int i = 0; i <= y; i++) //create a for loop, which declares i as 0 and increments it until it is not less than or equal to y
				//this ensures that the x is exponentiated for the correct amount of times
			{
				System.out.println(x + " to the " + i + " is " + (int)Math.pow(x, i)); //prints statement
				//uses pow method in the Math class to calculate exponentiation for each iteration, and
				//casts pow method result as an integer
			}
		}
		else 
		{
			System.out.println("Sorry, this computer is unable to compute negative numbers."); //prints statement if either number is negative.
		}
	}
	/**
	 * getFact method: returns the factorial of x if it is a positive number.
	 * if it is a negative number, print out an error message and return -1.
	 * @param x
	 * @return the factorial, or -1 if the parameter is negative
	 */
	public static int getFact(Integer x)
	{
		if (x >= 0) //if statement to check if x is a positive number
		{
			int constant = x; //declare constant as x, to hold original value during calculation
			for (int i = 1; i < constant; i++) //create for loop, which declares i as 1 and increments i until it is not less than the constant
			{
				x *= (constant-i); //multiply x by the difference of the constant and i
				//subtracting the constant by the increment number ensures the number is multiplied by each previous number before it
			}
			return x; //return factorial
		}
		else //else statement when x is not a positive number
		{
			System.out.println("Sorry, this computer is unable to compute the factorial of negative numbers."); //print error statement
			return -1; //return -1
		}
	}
}
