package package1;
abstract class cook
{
	abstract void add();
	abstract void sub();
}

public class AbstractClassAndMethod extends cook
{
void add()
{
	int a =10;
	int b =20;
	int c= a+b;
	System.out.println("real implementation of add"+c);
}
void sub()
{
	int a =200;
	int b =20;
	int c= a-b;
	System.out.println("real implementation of sub"+c);
}	
	
	
	public static void main(String[] args) 
	{
		AbstractClassAndMethod a1 = new AbstractClassAndMethod();
		a1.add();
		a1.sub();
		
	}

}
