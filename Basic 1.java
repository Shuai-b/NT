import java.io.*;
class c
{
	public static void main (String args [])
	{
		c obj = new c ();
		 obj.display();
	}
	void display()
	{
		int a =10;
		int b = a++;
		System.out.println( b + " " + a );
	}
}