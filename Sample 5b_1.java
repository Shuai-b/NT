//To demonstrate Escape Sequences                                                                                                       26/6/2017
import java.io.*;
class prece
{
	public static void main(String args[])
	{
		prece obj=new prece();
		obj.display();
	}//End of main 
	void display()
	{
		int a=5;
		int b=6;
		System.out.println("My name is \t Leander ");
		System.out.println("My name is \\ Leander ");
                            System.out.println("My name is \" Leander \" ");
		System.out.println("My name is \' Leander \' ");
                             System.out.println("My name is \v Leander  ");
		System.out.println("My name is \n Leander ");
		System.out.println("My name is \f Leander ");
		System.out.println("My name is \r Leander ");
		System.out.println(" This is the value \b comes before");
		System.out.println("My name is \0Leander ");
	}//End of display
}//End of class
/* Output
My name is   Leander 
My name is \ Leander 
My name is " Leander " 
My name is 
 Leander 
My name is 




Leander 
My name is 
 Leander 
 This is the value comes before
My name is
*/

