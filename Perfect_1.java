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
					int s = 0; int p=n;
					for (int i = 1;i<=n;i++) 
					{
						if(n%i==0)
							s=s+i ; 
					} 
						if (s==p) 
							System.out.println("Its A perfect Number ") ;
							else  
								System.out.println("its nOt a perfect Number ") ; 
		}
}