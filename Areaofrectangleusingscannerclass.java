package package1;

import java.util.Scanner;

public class Areaofrectangleusingscannerclass 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of l");
		double l = sc.nextDouble();
		System.out.println("Enter the value of b");
		double b = sc.nextDouble();
		double area= l*b;
		System.out.println("The area of rectangle"+ area);
		double Circumference = 2*(l+b);
		System.out.println("The circumference of rectangle "+Circumference);
		sc.close();
		
	}

}
