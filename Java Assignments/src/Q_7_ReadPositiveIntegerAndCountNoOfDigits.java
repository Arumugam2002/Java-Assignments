/* Write a Java program that reads a positive integer and count the number of digits the
number.   */

import java.util.Scanner;

public class Q_7_ReadPositiveIntegerAndCountNoOfDigits {
	
	public static void main(String[] args)
	{
		
		int count = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number:- ");
		
		int num = sc.nextInt();
		
		while(num!=0)
		{
			
			num=num/10;
			count++;
			
		}
		
		
		
		System.out.println("Number of digits in number are " + count);
	}
	
	
}
