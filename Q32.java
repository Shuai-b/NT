//Program to check if whether two numbers are Twin Prime Numbers
import java.io.*;
import java.util.*;
class twin
{   int d,e,count,count1,fin;
	public static void main(String args[])
	{
		twin obj=new twin();
		obj.display();
	}//End of main()
	
	void display()
	{
		Scanner br=new Scanner(System.in);
        System.out.println ("Enter two numbers");
        int n=br.nextInt();
        int m=br.nextInt();
     
        for(int i=1;i<=n;i++)
        {
        	d=n%i;
        	if(d==0)
        		count++;
        }
        
        if(count==2)
        {
        	for(int j=1;j<=m;j++)
        	{
        		e=m%j;
        		if(e==0)
        			count1++;
        	}
        	if(count1==2)
        	{
        		if(n>m)
        		{
        			fin=n-m;
        	    }
        	     else
        	     	fin=m-n;
        	   if(fin==2)
        	   	System.out.println ("Entered Numbers are Twin Prime Numbers");
        	   else
        	   	System.out.println ("Entered Numbers are not Twin Prime Numbers");
        	    	 	
        }
        else
        System.out.println ("Entered numbers are not Twin Prime Numbers");	
        }
        else
       System.out.println ("Entered numbers are not Twin Prime Numbers");
	}//End of display()
}//End of class
/* Output
Enter two numbers
11
13
Entered Numbers are Twin Prime Numbers

Enter two numbers
13
17
Entered Numbers are not Twin Prime Numbers

Enter two numbers
13
15
Entered numbers are not Twin Prime Numbers
*/