package package1;

public class CallstaticMethodinMainMethod 
{
    static void add()
    {
    	int a=10;
    	int b=40;
    	int sum=a+b;
    	System.out.println(sum);
    }
  
	public static void main(String[] args) 
	{
		add();
	}

}
