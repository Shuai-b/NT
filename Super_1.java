import java.io.*;
import java.util.*;
class su
{
	public static void main(String args[] ) 
	{
		su obj = new su () ;
			obj.display();
			
	}
	void display() 
	{
		Scanner sc = new Scanner (System.in) ;
		System.out.println("Enter a Number " ); 
			int n=sc.nextInt();
			int p=n ;
			int d,sum=0 ; int count=0;
				while(n!=0) 
				{
					 d= n%10 ; 
						count++;
						n=n/10;
				}
				int p1=p,temp,sas=0;
					while(count>0)
					{
						temp=p1%10;
						sas=sas+(int)Math.pow(temp,count);
						count--;
						p1=p1/10;
						}
						if(p==sas)
							System.out.println("It is a super number");
								else
									System.out.println("It is not a super number");
}
}
/*Enter a Number 
175
It is a super number

Process completed.
*/
