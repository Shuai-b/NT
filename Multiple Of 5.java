//Program to print multiplication table of 5
import java.io.*;
import java.util.*;
class ten
{
	public static void main(String args[])
	{
		ten obj=new ten();
		obj.display();
	}//End Of main()
	
	void display()
	{   int n=5;
	    int m=0;
		for(int i=1;i<=10;i++)
		{   m=n*i;
			System.out.println(n+" x "+i+" = "+m );
		}
	}//End of display()
}//End of class
/*Output
5 x 1 = 5
5 x 2 = 10
5 x 3 = 15
5 x 4 = 20
5 x 5 = 25
5 x 6 = 30
5 x 7 = 35
5 x 8 = 40
5 x 9 = 45
5 x 10 = 50
*/