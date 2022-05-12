//Program to count the number od digits in a number
import java.io.*;
import java.util.*;
class count
{
	public static void main(String args[])
	{
		count obj=new count();
		obj.display();
	}//End of main()
	
	void display()
	{
		Scanner br=new Scanner(System.in);
		System.out.println ("Enter a number");
		int n=br.nextInt();
		int count=0,d;
		int dup=n;
		while(n!=0)
		{
			d=n%10;
			count++;
			n=n/10;
		}
		
		System.out.println ("The number of digits in "+dup+" is "+count);
     
	}//End of display()
}//End of class
/* Output
Enter a number
3486
The number of digits in 3486 is 4
*/