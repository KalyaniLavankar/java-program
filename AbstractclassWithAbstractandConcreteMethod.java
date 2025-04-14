package package1;
abstract class Logic
{
	abstract void login();
	abstract void logout();
	void logic()  // abstract method
	{
		System.out.println("Logic to expose");
	}
	static void logic1()  //concrete method
	{
		System.out.println("Logic to expose");
	}
}

public class AbstractclassWithAbstractandConcreteMethod extends Logic
{
void login()    // abstract method implementation
{
	String name= "Kalyani";
	String password="Kalyani@123";
	System.out.println("Logic to keep"+name+password);	
}
void logout()    // abstract method implementation
{
	System.out.println("logic to keep");
}

	public static void main(String[] args) 
	{
		AbstractclassWithAbstractandConcreteMethod a1 = new AbstractclassWithAbstractandConcreteMethod();
		a1.login(); //call the abstract method
		a1.logout();  //call the abstract method
        a1.logic();   //call abstract method from parent abstract class
        logic1();      // //call concrete method from parent abstract class
	}

}
