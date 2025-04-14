package package1;

public class Average_No_Array 
{   
                         //Average= sum/divided by total no 
	public static void main(String[] args) 
	{
		int rollno[]=new int[4];
		    rollno[0]=10;
		    rollno[1]=10;
		    rollno[2]=10;
		    rollno[3]=10;
		    int sum=0;
		    double average=0;
		for(int i=0;i<=3;i++)
		    {
		    	sum=sum+rollno[i];//0=0+10
		    }
		System.out.println(sum);
		average=sum/rollno.length;//average=40/4
		System.out.println(average);
		
	}

}
