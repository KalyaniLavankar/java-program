package package1;
import java.util.InputMismatchException;
import java.util.Scanner;
public class TryCatchTwoExceptionsinSingleClass 
{
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		try 
		{
		System.out.println("Enter a number");
		int num =s1.nextInt();
		int result = 100 / num; // May throw ArithmeticException
        System.out.println("Result: " + result);
		}
		catch(InputMismatchException a1)
		{
		 System.out.println("Dont enter string value");
		}
		catch(ArithmeticException a2)
		{
			System.out.println("Cannot divided by zero");
		}
		
	}
}				
		