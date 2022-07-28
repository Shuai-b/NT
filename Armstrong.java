//To demonstrate Armstrong Number 
import java.io.*;
import java.util.*;
class s 
{
	public static void main(String args[] ) 
	{
		s obj = new s () ;
			obj.armstrong();
			
	}
	void armstrong() 
	{
		Scanner sc = new Scanner (System.in) ;
		System.out.println("Enter a Number " ); 
			int n=sc.nextInt() ;
			int p=n;
			int sum=0 ;int d,s;
			while(n!=0) 
			{
				d=n%10;
			 s=(int)Math.pow(d,3) ; 
					sum=sum+s;
					n=n/10 ;
						
			}
			if (p==sum)
				System.out.println("it is a armstrong");
				else 
					System.out.print("It ain't a armstrong number ") ;
			
	}
}
 /*Enter a Number 
153
it is a armstrong

Process completed.