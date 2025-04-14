package package1;

import java.util.Scanner;

public class Areaoftriangleusingscanner 
{

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the breath of triangle");
		double b= sc.nextDouble();
		System.out.println("Enter the height of triangle");
		double h= sc.nextDouble();
		double area= 0.5*b*h;
		System.out.println("The area of the triangle"+area);
		System.out.println("Enter the length of a");
		double a= sc.nextDouble();
		System.out.println("Enter the length of d");
		double d= sc.nextDouble();
		System.out.println("Enter the length of c");
		double c= sc.nextDouble();
		double circumference=a+d+c;
		System.out.println("The circumference of the triangle"+circumference);
		sc.close();
		
	}

}
