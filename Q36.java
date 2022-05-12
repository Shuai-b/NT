//Program to check whether a number is a special 2-digit number
import java.io.*;
import java.util.*;
class digit
{   int n,dup,d,sum,pro,fin;
	public static void main(String args[])
	{
		digit obj=new digit();
		obj.display();
	}//End of main()
	
	void display()
	{
		Scanner br=new Scanner(System.in);
        System.out.println ("Enter a 2-Digit Number");
        n=br.nextInt();
        dup=n;
        pro=1;
        
        while(dup!=0)
        {
        	d=dup%10;
        	sum=sum+d;
        	pro=pro*d;
            dup=dup/10;
        }
        fin=sum+pro;
        if(fin==n)
        	System.out.println ("Special 2-Digit Number");
        	else
        	System.out.println ("Not a Special 2-Digit Number");
	}//End of display()
}//End of class
/* Output
Enter a 2-Digit Number
59
Special 2-Digit Number
*/