//To Demonstrate Niven number 
import java.io.*;
import java.util.*;
class c 
{
	public static void main(String args[]) 
	{
		c obj = new c () ;
			obj.display() ;
			
	} 
		void display() 
		{
			Scanner br = new Scanner (System.in) ;
			System.out.println("Enter a number " ) ; 
				int n = br.nextInt() ; 
					int d,s=0 ;int p=n;
					while(n!=0) 
					{
						d=n%10 ;
						s=s+d ;
						n=n/10;
						
					}
					if (p%s==0)
						System.out.println("It is A Niven Number ") ;
						else 
							System.out.println("It ain't a number ");
		}
}
/*
 Enter a number 
9
It is A Niven Number 

Process completed.
*/