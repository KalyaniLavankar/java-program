package package1;
public class ThisCallingStatement //we create this calling statement in single class so we did not use extend here
{
	ThisCallingStatement()
	{
		this("Kalyani");
		System.out.println("1");
	}
	ThisCallingStatement(String a)
	{
		this('K');
		System.out.println("2");
	}
	ThisCallingStatement(char a)
	{
		System.out.println("3");
	}
	public static void main(String[] args) 
	{
		new ThisCallingStatement();

	}

}
