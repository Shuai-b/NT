//Program to check whether a number is a Super Number or not 
import java.io.*;
import java.util.*;
class supe
{   int n,d,count,i,e,s;
	public static void main(String args[])
	{
		supe obj=new supe();
		obj.display();
	}//End of main()
	
	void display()
	{
		Scanner br=new Scanner(System.in);
        System.out.println ("Enter a Number");
        n=br.nextInt();
        int dup=n;
        int sup=n;
        e=1;
        while(n!=0)
        {
        	d=n%10;
        	count++;
        	n=n/10;
        }
        while(sup!=0)
        {   e=sup%10;
        	s=s+(int)Math.pow(e,count);
        	sup=sup/10;
        	count--;
        }
        
        if(s==dup)
        	System.out.println (dup+" is a Super Number");
        	else
        		System.out.println (dup+" is not a Super Number");
	}//End of display()
}//End of class
/* Output
Enter a Number
145
145 is not a Super Number

Enter a Number
175
175 is a Super Number
*/