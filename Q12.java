//Program to find the Biggest digit
import java.io.*;
import java.util.*;
class big
{   int n,dup,d,b;
	public static void main(String args[])
	{
		big obj=new big();
		obj.display();
	}//End of main()
	
	void display()
	{
		Scanner br=new Scanner(System.in);
        System.out.println ("Enter a number");
        n=br.nextInt();
        dup=n;
        while(n!=0)
        {
        	d=n%10;
        	if(d>b)
        		b=d;
        	n=n/10;
        }
        System.out.println ("The Biggest Digit of "+dup+" is "+b);
	}//End of display()
}//End of class
/* Output
Enter a number
528
The Biggest Digit of 528 is 8
*/