//Program to check whether a number a number is divisible by 11 by a special method
import java.io.*;
import java.util.*;
class eleven
{   int n,p,d,c,f,sum1,sum2,diff;
	public static void main(String args[])
	{
		eleven obj=new eleven();
		obj.display();
	}//End of main()
	
	void display()
	{
		Scanner br=new Scanner(System.in);
        System.out.println("Enter a number");
        n=br.nextInt();
        p=n;
        while(n!=0)
        {
        	d=n%10;
        	c++;
        	n=n/10;
        }
        
        for(int i=1;i<=c;i++)
        {
        	f=p%10;
        	if(i%2==0)
        		sum1=sum1+f;
        		else
        			sum2=sum2+f;
        			p=p/10;
        }
        
        if(sum1>sum2)
        	diff=sum1-sum2;
        	else
        		diff=sum2-sum1;
        
        if(diff%11==0)
        	System.out.println("Yes");
        	else
        		System.out.println ("no");		
        
	}//End of display()
}//End of class