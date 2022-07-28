//program to demonstrate Duck number                                                                                9/08/17
import java.io.*;
import java.util.*;
class loop
{
	int n,d,p=0;
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
		 if(d==0)
		 {
		 	p++;
		 }
			n=n/10;
		}//end of loop
		if(p>0)
			System.out.println("The number is a Duck number");
			else
                                    System.out.println("The number is not a Duck number");
	}//end of display
}//end of class
/* output:
Enter a number
809
The number is a Duck number*/

