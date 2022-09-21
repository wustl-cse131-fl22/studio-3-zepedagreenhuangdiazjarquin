package studio3;

import java.util.Arrays;
import java.util.Scanner;

public class Sieve_of_Eratosthenes {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int index = 0;
		Boolean[] numberArray = new Boolean[40];
		Arrays.fill(numberArray, Boolean.FALSE);
		System.out.println(numberArray[39]);
		for ( index = 2; index< numberArray.length; index +=2)
		{
			if(index<39)
			{
			numberArray[index] = true;
			}
		}
		for ( index = 3; index< numberArray.length; index +=3)
		{
			
			if(index<39)
			{
			numberArray[index] = true;
			}
			}
		for ( index = 5; index< numberArray.length; index +=5)
		{
			if(index<39)
			{
			numberArray[index] = true;
			}
			}
		for ( index = 7; index< numberArray.length; index +=7)
		{
			if(index<39)
			{
			numberArray[index] = true;
			}
			}
		
		
		for( index = 1; index<numberArray.length; index++);
		{
			if (numberArray[index] == true)
			{
			System.out.println(numberArray[index]);
			}
		}
		
	}
}
		/*for (int i = 1; i < input; i++)
		{
			
			numberArray =
				if(num % mult == 0) {
					System.out.println(num +" not prime");
				}
		}
	}
				
			}
			
		*/
		
