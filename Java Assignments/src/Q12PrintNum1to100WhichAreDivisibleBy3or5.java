/* Write a Java program to print numbers between 1 to 100 which are divisible by 3, 5 
and by both.           */

public class Q12PrintNum1to100WhichAreDivisibleBy3or5 {
	public static void main(String[] args)
	{
		
		System.out.println("Numbers which are divisible by 3 are:- ");
		for(int i=0;i<=100;i++)
		{
			if(i%3 == 0)
			{
				System.out.print(i + " ");
			}
				
		}
		
		
		System.out.println("\nNumbers which are divisible by 5 are:- ");
		for(int i=0; i<=100; i++)
		{
			 if(i%5 == 0)
			{
				System.out.print(i + " ");
			}
		}
		
		System.out.println("\nNumbers which are divisible by 3 and 5 both are:- ");
		
		for(int i=0;i<=100;i++)
		{
			if(i%3 ==0 && i%5 == 0 )
			{
				System.out.print(i + " ");
			}
		}
	}
}
