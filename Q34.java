//Program to check whether a number is a Anon Prime Number or not
import java.io.*;
import java.util.*;
class anon
{   int d,e,count,sum,g,fact;
	public static void main(String args[])
	{
		anon obj=new anon();
		obj.display();
	}//End of main()
	
	void display()
	{
		Scanner br=new Scanner(System.in);
        System.out.println ("Enter a Number");
        int n=br.nextInt();
        
        for(int i=1;i<=n;i++)
        {
        	d=n%i;
        	if(d==0)
        		count++;
        }
        
        if(count==2)
        {
        	while(n!=0)
        	{
        		e=n%10;
        		sum+=e;
        	
        		n=n/10;
        	}
        		for(int j=1;j<=e;j++)
        		{
        			g=e%j;
        			if(g==0)
        				fact+=j;
        		}
        		fact=fact*3;
        	
        	if(sum==fact)
        		System.out.println ("Entered number is an Anon Prime Number");
        		else
        			System.out.println ("Entered number is not an Anon Prime Number");
        }
        	else
        			System.out.println ("Entered number is not an Anon Prime Number");
	}//End of display()
}//End of class