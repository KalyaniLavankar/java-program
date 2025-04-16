package package1;

public class ThrowsKeyword 
{

	public static void main(String[] args) throws InterruptedException 
	{
		for(int i=1;i<10;i++)
		{
			System.out.println(i);
			Thread.sleep(2000); //give the exception
		}

	}

}
