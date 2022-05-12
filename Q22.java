//Program to check whether a number is an Automorphic Number or not
import java.io.*;
import java.util.*;
class automorphic
{   int n,dup,s,end,sq,c;
	public static void main(String args[])
	{
		automorphic obj=new automorphic();
		obj.display();
	}//End of main()
	
	void display()
	{
		Scanner br=new Scanner(System.in);
		System.out.println ("Enter a number");
		n=br.nextInt();
		dup=n;
		sq=n*n;
		while(dup>0)
		{
			c++;
			dup/=10;
		}
		
		int end=sq%(int)Math.pow(10,c);
		
		if(n==end)
			System.out.println (n+" is an Automorphic number");
			else
				System.out.println (n+" is not an Automorphic number");
	}//End of display()
}//End of class
/* Output
Enter a number
8
8 is not an Automorphic number

Enter a number
25
25 is an Automorphic number
*/