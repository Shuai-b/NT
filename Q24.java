//Program to find the sum of the odd digits
import java.io.*;
import java.util.*;
class odd 
{   int n,dup,d,sum;
	public static void main(String args[])
	{
		odd obj=new odd();
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
        	if((d%2)!=0)
        	sum+=d;
        	n=n/10;	
        }
      System.out.println ("The sum of the digits of "+dup+" is "+sum);
	}//End of display()
}//End of class
/* Output
Enter a number
2749
The product of the digits of 2749 is 8
/* Output
Enter a number
743
The sum of the digits of 743 is 10
*/