//Program to find the product of the even digits
import java.io.*;
import java.util.*;
class even 
{   int n,dup,d,pro;
	public static void main(String args[])
	{
		even obj=new even();
		obj.display();
	}//End of main()
	
	void display()
	{
		Scanner br=new Scanner(System.in);
        System.out.println ("Enter a number");
        n=br.nextInt();
        dup=n;
        pro=1;
        while(n!=0)
        {
        	d=n%10;
        	if((d%2)==0)
        	pro*=d;
        	n=n/10;	
        }
      System.out.println ("The product of the digits of "+dup+" is "+pro);
	}//End of display()
}//End of class
/* Output
Enter a number
2749
The product of the digits of 2749 is 8
*/