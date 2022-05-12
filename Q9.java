//Program to check if whether a number is Prime or not
import java.io.*;
import java.util.*;
class prime
{   int n,d,count;
	public static void main(String args[])
	{
		prime obj=new prime();
		obj.display();
	}//End of main()
	
	void display()
	{
		Scanner br=new Scanner(System.in);
        System.out.println("Enter a number");
        n=br.nextInt();
        for(int i=1;i<=n;i++)
        {
        	d=n%i;
        	if(d==0)
        		count++;
        }
        if(count<=2)
        	System.out.println(n+" is a Prime Number");
        	else
        		System.out.println (n+" is not a Prime Nmber");
	}//End of display()
}//End of class
/* Output
Enter a number
11
11 is a Prime Number

Enter a number
10
10 is not a Prime Nmber
*/