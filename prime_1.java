import java.io.*;
import java.util.*;
class s
{
	public static void main (String args [])
	{
		s obj = new s () ;
			obj.display() ;
			
	}
	void display() 
	{
		Scanner sc= new Scanner (System.in) ;
		System.out.println("Enter  A NUMBER") ;
		int a = sc.nextInt() ;
		int b,c =0;
			for (b=2;b<=a/2;b++)
			{
				if (a%b==0) 
				{
					c=1;
					break;
				}
				
			}
			if (c==0)
				System.out.println("Prime Number ") ; 
					else
						System.out.println("Not A prime Number" ) ; 
							
	}
}