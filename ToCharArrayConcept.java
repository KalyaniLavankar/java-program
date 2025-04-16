package package1;

public class ToCharArrayConcept 
{

	public static void main(String[] args) 
	{
		String input="Jai Shree Mahakal";
		char[] c1= input.toCharArray();
		System.out.println(c1[0]); //J
		System.out.println(c1[1]); //a
		System.out.println(c1[2]); //i
		System.out.println(c1[3]); //space
		System.out.println(c1[4]);//S
		System.out.println(c1[5]);//h
		System.out.println(c1[6]);//r
		System.out.println(c1[7]);//e
		System.out.println(c1[8]);//e
		System.out.println(c1[9]);//space
		System.out.println(c1[10]);//M
		System.out.println(c1[11]);//a
		System.out.println(c1[12]);//h
		System.out.println(c1[13]);//a
		System.out.println(c1[14]);//k
		System.out.println(c1[15]);//a
		System.out.println(c1[16]);//l
		
		//If i remove println and only use print then output will be Jai Shree Mahakal come in single line
	}

}
