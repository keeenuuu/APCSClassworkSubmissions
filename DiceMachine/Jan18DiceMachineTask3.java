public class DiceMachine 
{
	public static void main(String[] args) 
	{
	printNums("2d10"); //call printNums method, which takes in dice input "2d10" (two 10-sided dice)
	}
	/**
	 * printNums method: prints the two number components of a dice input, and prints their sum.
	 * @param str = the dice input, in #d#
	 */
	public static void printNums(String str)
	{
		String num1 = str.substring(0, str.indexOf('d')); //declares a String, named num1, which takes the substring of the dice input from index 0 to the index of the d character
		String num2 = str.substring(str.indexOf('d')+1); //declares a String, named num2, which takes the substring of the dice input from the index succeeding 'd' onward
		System.out.println("The 1st number is " + num1 + " and the 2nd number is " + num2 + "."); //prints the two number components
		int a = Integer.valueOf(num1); //declares an int, named a, which takes the Integer value of num1
		int b = Integer.valueOf(num2); //decares an int, named b, which takes in the Integer value of num2
		System.out.println(a + " + " + b + " = " + (a+b)); //prints the sum of a and b
	}
}
