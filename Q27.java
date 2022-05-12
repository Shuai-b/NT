//Program to check if whether a number is a Magical Number or not
import java.io.*;
import java.util.*;
class magic
{   
	public static void main(String args[])
	{
	    magic obj=new magic();
		obj.display();
	}//End of main()
	
	void display()
	{
		Scanner br=new Scanner(System.in);
        System.out.println ("Enter a number");
        int n=br.nextInt();
        int sum=0,num=n;
        while(num>9)
        {
            sum=num;int s=0;
            while(sum!=0)
            {
                s=s+(sum%10);
                sum=sum/10;
            }
            num=s;
        }
        if(num==1)
        {
            System.out.println(n+" is a Magic Number.");
        }
        else
        {
            System.out.println(n+" is not a Magic Number.");
        }

	}//End of display()
}//End of class
/* Output
Enter a number
235
235 is a Magic Number.

Enter a number
122
122 is not a Magic Number.
*/