//Write a program that generates a sequence of 20 random die tosses in an array
//and that prints the die values, marki9ng only the longest run, like this:
//1 2 5 5 3 1 2 4 3 (2 2 2 2) 3 6 5 5 6 3 1

import java.util.Random;
public class homework2 {

	public static void main(String[] args) {
		Random rand = new Random();
		int value;
		int[] numbers;
		numbers = new int[25];
		
		for(int i=0; i<20; i++)
		{
			value = rand.nextInt(5);
			numbers[i] = value;
		}
		
		int endIndex = 0;
		int maxLength = -1;
		int temp = 1;
		
		for(int i=0; i<19; i++)
		{
			if(numbers[i] == numbers[i+1]) temp++;
			else
			{
				if(temp > maxLength)
				{
					maxLength = temp;
					endIndex = i;
				}
				temp = 1;
			}
		}
		
		for(int i=0; i<20; i++)
		{
			if(i == endIndex-maxLength+1) System.out.print("(");
			System.out.print(numbers[i]);
			if(i == endIndex) System.out.print(")");
			System.out.print(" ");
		}
		
	}

}
