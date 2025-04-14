package package1;

import java.util.Scanner;

public class Array_usingScannerRuntime 
{

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Please enter the size of array");//enter the value of total no of array
		int age[]= new int [s1.nextInt()];//create array 
		for(int i=0;i<age.length;i++) 
		{
			System.out.println("Please enter the value at index"+i);
			age[i]=s1.nextInt();
		}
		s1.close();
	}

}
