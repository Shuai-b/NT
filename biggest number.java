//program to demonstrate the bigger digit in a number                         7-08-17
import java.io.*;
import java.util.*;
class loop
{
	int n,big=0,d;
	public static void main(String args[])
	{
		loop obj=new loop();
		obj.display();
	}//end of main
	void display()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		n=sc.nextInt();
		while(n!=0)
		{
			d=n%10;
			if(d>big)
			big=d;
			n=n/10;
		}//end of loop
		System.out.println("The biggest digit of the number is" +d);	
	}//end of display
}//end of class
/* output :
Enter  a number
253
The biggest digit of the number is 5*/

