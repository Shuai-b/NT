import java.io.*;
import java.util.*;
class small
{
	public static void main(String args[])
	{
		small obj=new small();
		obj.display();
	}
	
	void display()
	{   Scanner br=new Scanner(System.in);
	System.out.println("Enter a Number");
		int n=br.nextInt();
			int small=n;
			int d;
			while(n!=0)
			{
				d=n%10;
				if(d<small)
					small=d;
					n=n/10;
			}
		
				System.out.println(small+" is the smallest digit");
			
	}
}