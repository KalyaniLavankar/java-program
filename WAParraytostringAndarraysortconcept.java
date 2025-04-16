package package1;

import java.util.Arrays;

public class WAParraytostringAndarraysortconcept 
{

	public static void main(String[] args) 
	{
		String a1="kalyani";//string should in same small letter for anagram
		String a2="lavankar";//string should in same small letter for anagram
		char [] c1= a1.toCharArray(); //convert string to char
		char [] c2= a2.toCharArray(); //convert string to char
		
		Arrays.sort(c1); //sort char according alphabetic order
		System.out.println("After sorting"+Arrays.toString(c1));//by using Array.to string we can convert string into char
		//System.out.println(c1);// we can write this way as well
		Arrays.sort(c2); //sort char according alphabetic order
		System.out.println("After sorting"+Arrays.toString(c2));//by using Array.to string we can convert string into char
		
	}

}
