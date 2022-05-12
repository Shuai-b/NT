//Program to find the factorial of a number
import java.io.*;
import java.util.*;
class factorial
{
	public static void main(String args[])
	{
	factorial obj=new factorial();
		obj.display();
	}//End of main()
	
	void display()
	{
		Scanner br=new Scanner(System.in);
			System.out.println("Enter a number");
			int n=br.nextInt();
			int fact=1;
			for(int i=1;i<=n;i++)
			{
				fact=fact*i;
			}
			System.out.println("Factorial of "+n+" is "+fact);
	}//End of display()
}//End of class
/* Output
Enter a number
5
Factorial of 5 is 120
*/