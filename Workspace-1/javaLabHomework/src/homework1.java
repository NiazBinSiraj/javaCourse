//A run is a sequence of adjacent repeated values. Write a program that
//generates a sequence of 20 random die tosses in an array and that prints
//the die values, marking the runs by including them in parentheses, like this:
// 1 2 (5 5) 3 1 4 3 (2 2 2 2) 3 6 (5 5) 6 3 1

import java.util.Random;

public class homework1 {

	public static void main(String[] args) {
		Random rand = new Random();
		int[] numbers;
		int value;
		numbers = new int[25];
		for(int i=0; i<20; i++) {
			value = rand.nextInt(7);
			numbers[i] = value;
		}
		
		boolean inRun = false;
		
		for(int i=0; i<20; i++)
		{
			if(inRun == false && numbers[i] == numbers[i+1]) {System.out.print("("); inRun = true;}
			System.out.print(numbers[i]);
			if(inRun == true && numbers[i] != numbers[i+1]) {System.out.print(") "); inRun = false;}
			else System.out.print(" ");
		}
	}
}
