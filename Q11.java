//Program to find the Smallest digit
import java.io.*;
import java.util.*;
class small
{   int n,dup,d,s;
	public static void main(String args[])
	{
		small obj=new small();
		obj.display();
	}//End of main()
	
	void display()
	{
		Scanner br=new Scanner(System.in);
        System.out.println ("Enter a number");
        n=br.nextInt();
        dup=n;
        s=n;
        while(n!=0)
        {
        	d=n%10;
        	if(d<s)
        		s=d;
        	n=n/10;
        }
        System.out.println ("The Smallest Digit of "+dup+" is "+s);
	}//End of display()
}//End of class
/* Output
Enter a number
528
The Smallest Digit of 528 is 2
*/