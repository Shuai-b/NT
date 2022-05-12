//Program to print the product of the first and last digits of a number
import java.io.*;
import java.util.*;
class pro
{   int n,d,product;
	public static void main(String args[])
	{
		pro obj=new pro();
		obj.display();
	}//End of main()
	
	void display()
	{
		Scanner br=new Scanner(System.in);
        System.out.println("Enter a number");
        n=br.nextInt();
        d=n%10;
        product=d;
        while(n!=0)
        {
        d=n%10;
        n=n/10;
        if(n==0)
        	product*=d;
        }
        
        System.out.println("The product of the 1st and last numbers are "+product);
        
        
	}//End of display()
}//End of class
/* Output
Enter a number
3757
The product of the 1st and last numbers are 21
*/