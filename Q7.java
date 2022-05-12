//Program to check whether the number is a Perfect Number or not
import java.io.*;
import java.util.*;
class perfect
{   int n,dup,d,sum;
	public static void main(String args[])
	{
		perfect obj=new perfect();
		obj.display();
	}//End of main()
	
	void display()
	{
		Scanner br=new Scanner(System.in);
        System.out.println ("Enter a number");
        n=br.nextInt();
        dup=n;
        for(int i=1;i<n;i++)
        {
        	d=n%i;
        	if(d==0)
        		sum+=i;
        }
        
        if(sum==dup)
        	System.out.println(dup+" is a Perfect Number");
        	else
        		System.out.println(dup+" is not a Perfect Number");
	}//End of display()
}//End of class

/* Output
Enter a number
4
4 is not a Perfect Number

Enter a number
28
28 is a Perfect Number