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
			System.out.println("Enter A number " ) ; 
				int n = br.nextInt() ; 
					int d ; int dup=n ; int s = 0 ; 
						while (n!=0 )
						{
							d=n%10;
							s=s*10+d ;
							n=n/10;
							
							
						}
						if (dup==s)
							System.out.println("It is a palindrome "+d+s) ;
							else 
							System.out.println("It is Not a palindrome Number"+d+s);		}
}
/*Enter A number 
101
It is a palindrome 

Process completed.

*/
