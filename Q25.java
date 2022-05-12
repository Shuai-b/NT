//Program to check whether a number is Neon or not 
import java.io.*;
import java.util.*;
class neon
{   int n,sq,d,sum;
	public static void main(String args[])
	{
		neon obj=new neon();
		obj.display();
	}//End of main()
	
	void display()
	{
		Scanner br=new Scanner(System.in);
        System.out.println ("Enter a number");
        n=br.nextInt();
        sq=n*n;
        while(sq!=0)
        {
        	d=sq%10;
        	sum+=d;
        	sq=sq/10;
        }
        
        if(sum==n)
        	System.out.println (n+" is a Neon Number");
        	else
        		System.out.println (n+" is not a Neon Number");
	}//End of display()
}//End of class
/* Output
Enter a number
9
9 is a Neon Number

Enter a number
7
7 is not a Neon Number
*/