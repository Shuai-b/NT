import java.io.*;
import java.util.*;
class neon
{
	public static void main(String args[])
	{
		neon obj=new neon();
		obj.display();
	}
	
	void display()
	{
		Scanner br=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=br.nextInt();
		int sq=n*n;
		int s=0;
		int d=0;
		while(sq!=0)
		{
			 d=sq%10;
			 s=s+d;
			 	sq=sq/10;
		}
		if(s==n)
		System.out.println("It is a neon number");
		else
			System.out.println("It is not a neon number");
	}	}
