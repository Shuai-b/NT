//Program to find and extract an ISBN
import java.io.*;
import java.util.*;
class stat
{   int n,d,sum,e,count,sup;
	public static void main(String args[])
	{
		stat obj=new stat();
		obj.display();
	}//End of main()
	
	void display()
	{
		Scanner br=new Scanner(System.in);
        System.out.println ("Enter ther number to be checked");
        n=br.nextInt();
        sup=n;
        while(sup!=0)
        {
        	d=sup%10;
        	count++;
        	sup=sup/10;
        }
        
        if(sup==10)
        {
        	for(int i=10;i!=0;i--)
        	{
        		e=n%10;
        		sum=sum+(i*e);
        		n=n/10;
        	}
        	if((sum%11)==0)
        		System.out.println ("Legal ISBN");
        		else
        			System.out.println ("Illegal ISBN");
        }
        
        else
        	System.out.println ("Illegal ISBN");
	}//End of display()
}//End of class