//Program to check whether a number is Armstrong number
import java.io.*;
import java.util.*;
class armstrong
{   int n,dup,d,s;
	public static void main(String args[])
	{
		armstrong obj=new armstrong();
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
        	s+=(int)Math.pow(d,3);
        	dup=dup/10;
        }
        
        if(s==n)
        	System.out.println (n+" is an Armstrong Number");
        	else
        		System.out.println (n+" is not an Armstrong Number");
	}//End of display()
}//End of class
/* Output
Enter a number
153
153 is an Armstrong Number

Enter a number
143
143 is not an Armstrong Number
*/