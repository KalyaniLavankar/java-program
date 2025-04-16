package package1;

public class Updatinglocalglobalvalue 
{
    static double pi=3.14;
    static void add()
    {
    	int a = 10;
    }
	public static void main(String[] args) 
	{
		pi=10.2;
		int a = 20;
		System.out.println(pi);
		System.out.println(a);

	}

}
