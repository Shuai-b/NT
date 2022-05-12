//Program to check whether nummber is a Palindrome or not
import java.io.*;
import java.util.*;
class sum
{   int n,dup,d,s;
	public static void main(String args[])
	{
		sum obj=new sum();
		obj.display();
	}//End of main()
	
	void display()
	{
		Scanner br=new Scanner(System.in);
        System.out.println ("Enter a number");
        n=br.nextInt();
        dup=n;
        while(dup!=0)
        {
        	d=dup%10;
        	s=s*10+d;
        	dup=dup/10;
        }
        if(s==n)
        System.out.println (n+ " is a Palindrome");
        else
        	System.out.println (n+" is not a Palindrome");
	}//End of display()
}//End of class
/* Output
Enter a number
1101
1101 is not a Palindrome

Enter a number
12021
12021 is a Palindrome
*/