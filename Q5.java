//Program to check if whether amicable number or not
import java.io.*;
import java.util.*;
class amicable
{
	public static void main(String args[])
	{
		amicable obj=new amicable();
		obj.display();
	}//End of main()
	
	void display()
	{
	 Scanner br=new Scanner(System.in);
        int fact=0;
	    int count=0;
	    int a=0;
	    int b=0;
	    System.out.println("Enter two numbers");
	    
	    int n=br.nextInt();
	    int m=br.nextInt();
	    
	    for(int i=1;i<=n;i++)
	    {   fact=n%i;
	    	if(fact==0)
	    	{
	    		a=a+i;
	    	}
	    }
	    
	    for(int j=1;j<=m;j++)
	    {   count=m%j;
	    	if(count==0)
	    	{
	    		b=b+j;
	    	}
	    } 
	    if(a==b)
	    	System.out.println(n+" and "+m+" are amicable numbers");	
	    	else
	    		System.out.println("They are not amicable numbers");
	}//End of display()
}//End of class
/*Output
Enter two numbers
220
284
220 and 284 are amicable numbers

Enter two numbers
256
345
They are not amicable numbers
*/