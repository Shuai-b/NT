// To Demonstrate Simple Interest
import java.io.*;
import java.util.*;
class simpleinterest
{
	public static void main(String args[])
    {
		simpleinterest obj=new simpleinterest();
		  obj.add();
	}// End of Main 
	void add()
	{
		int p=500; int t =2; int r = 10 ;
		 
		 double c=(p*t*r)/100;
		System.out.println("Interest =  " + c);

	} // End of add()
}//End of class 