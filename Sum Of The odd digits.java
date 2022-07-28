import java.io.*;
import java.util.*;
class s
{
	public static void main (String args [] ) 
	{
		s obj = new s ();
			obj.display() ;
			
	}
	void display() 
	{
		Scanner sc = new Scanner (System.in) ;
			System.out.println("Enter A number " ) ;
			int n = sc.nextInt();
			int d,s=0 ;
			while (n!=0)
			{
			 	d=n%10;
			 	if(d%2!=0)
			 	{
			 		s=s+d;
			 	}
			 	n=n/10;
			}
			System.out.println("Sum of the odd digits = " + s);
	}
}