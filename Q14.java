//Program to find the sum of the digits
import java.io.*;
import java.util.*;
class sum
{   int n,dup,d,s;
	public static void main(String args[])
	{
		sum obj=new sum();
		obj.display();
	}//End of main()
	
	void display()
	{
		Scanner br=new Scanner(System.in);
        System.out.println ("Enter a number");
        n=br.nextInt();
        dup=n;
        while(dup!=0)
        {
        	d=dup%10;
        	s+=d;
        	dup=dup/10;
        }
        System.out.println ("The sum of the digits of "+n+" is "+s);
	}//End of display()
}//End of class
/* Output
Enter a number
293
The sum of the digits of 293 is 14
*/
