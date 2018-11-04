import java.util.Scanner;

/**
 * <h1>Calculator for addition, subtraction, multiplication and division!</h1>
 * this program implements an application that simply
 * add,multiply,subtract and divide two given integer
 * numbers and prints the output on the screen.
 * 
 * @author Niaz Bin Siraj
 * @since 30.10.2018
 * @version 1.0
 *
 */

public class annotationPractice {

	/**
	 * This method add two integers.
	 * @param num1 this is first integer
	 * @param num2 this is second integer
	 * @return it returns the sum of num1 and num2
	 */
	
	public static int add(int num1, int num2)
	{
		return num1 + num2;
	}
	
	
	/**
	 * This method subtract two integers.
	 * @param num1 this is first integer 
	 * @param num2 this is second integer
	 * @return it returns the subtraction of num1 and num2
	 */
	public static int subtract(int num1, int num2)
	{
		return (num1 - num2);
	}
	
	/**
	 * This method multiply two integers.
	 * @param num1 this is first integer
	 * @param num2 this is second integer
	 * @return it returns the product of num1 and num2
	 */
	public static int multiply(int num1, int num2)
	{
		return num1 * num2;
	}
	
	/**
	 * This method devides two integers.
	 * @param num1 this is first integer
	 * @param num2 this is second integer
	 * @return it returns the division of num1 and num2
	 */
	public static double divide(int num1, int num2)
	{
		return (double) num1 / (double) num2;
	}
	
	/**
	 * This is Main method.
	 * @param args take input as string which remains unused.
	 */
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		scan.close();
		
		System.out.println("Sum = " + add(num1, num2));
		System.out.println("Subtract = " + subtract(num1, num2));
		System.out.println("Product = " + multiply(num1, num2));
		System.out.println("Division = " + divide(num1, num2));

	}

}
