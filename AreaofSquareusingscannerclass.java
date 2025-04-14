package package1;

import java.util.Scanner;

public class AreaofSquareusingscannerclass 
{

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the length of square");
		double a= sc.nextDouble();
		double area= a*a;
		System.out.println("The area of Square"+area);
		System.out.println("Enter the side of square");
		double s= sc.nextDouble();
		double Circumference= 4*s;
		System.out.println("The Circumference of square"+Circumference);
		sc.close();
		
	}

}
