package package1;

public class Thiskeyword 
{
    String name;        //Global Variable declaration
    double salary;     //Global Variable declaration
    int age;           //Global Variable declaration
    long mobileno;   //Global Variable declaration
    void employee_details(String name,double salary,int age,long mobileno)
    {
    	this.name=name;
    	this.salary=salary;
    	this.age=age;
    	this.mobileno=mobileno;
    	System.out.println("Hi my name is"+" "+ name);
    	System.out.println("my salary is"+" "+ salary);
    	System.out.println("my age is"+" "+ age);
    	System.out.println("my mobileno is"+" "+ mobileno);
    }
	public static void main(String[] args) 
	{
		Thiskeyword t1=new Thiskeyword();
		t1.employee_details("Kalyani",40000,28,800728106);
		
	}

}
