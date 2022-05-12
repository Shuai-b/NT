//Program to find the product of the digits
import java.io.*;
import java.util.*;
class pro
{   int n,dup,d,s;
	public static void main(String args[])
	{
		pro obj=new pro();
		obj.display();
	}//End of main()
	
	void display()
	{
		Scanner br=new Scanner(System.in);
        System.out.println ("Enter a number");
        n=br.nextInt();
        dup=n;
        s=1;
        while(dup!=0)
        {
        	d=dup%10;
        	s*=d;
        	dup=dup/10;
        }
        System.out.println ("The Product of the digits of "+n+" is "+s);
	}//End of display()
}//End of class
/* Output
Enter a number
293
The Product of the digits of 293 is 54
*/