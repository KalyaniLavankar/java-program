package package1;

import java.util.Scanner;

public class WapareaofcircleScannerclass 
{
 
	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the radius of the circle");
		double r = s1.nextDouble();
		double pi = Math.PI;
		double area =pi*r*r;
		System.out.println("Enter the area of the circle"+ area);
		double circumference= 2*pi*r;
		System.out.println("Enter the area of circumference"+ circumference);
		s1.close();
		
		
	}

}
