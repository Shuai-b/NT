// To Demonstrate Evaluation of expression 
import java.io.*;
import java.util.*;
class Expression
{
	public static void main(String args[])
    {
		Expression obj=new Expression ();
		  obj.add();
	}// End of Main 
	void add()
	{
		int a=5; int b=3;
		 int c=(a++)+(++a)+b--;
		System.out.println("The Result Of the expression =" + c);
	} // End of add()
}//End of class
