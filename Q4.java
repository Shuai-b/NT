//Program to check if whether number is Duck number or not
import java.io.*;
import java.util.*;
class duck
{   int n,dup,m;
    boolean b;
	public static void main(String args[])
	{
		duck obj=new duck();
		obj.display();
	}//End of main()
	
	void display()
	{
		Scanner br=new Scanner(System.in);
		System.out.println("Enter a number");
		n=br.nextInt();
		dup=n;
		
		while(n!=0)
		{
			m=n%10;
			if(m==0)
				b=true;
			n=n/10;
		}
		
		if(b==true)
			System.out.println(dup+" is a Duck number");
			else
				System.out.println(dup+" is not a Duck number");
		
	}//End of display()
}//End of class

/* Output
Enter a number
2907
2907 is a Duck number

Enter a number
297
297 is not a Duck number
*/