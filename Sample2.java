//program to demonstrate escape sequences
import java.io.*;
import java.util.*;
class num
{
	public static void main(String args[])
	{
		num obj =new num();
		obj.display();
	}//end of main
	void display()
	{
               System.out.println("Welcome to\n wonderla”);
System.out.println("Welcome to "+"\t"+	"wonderla");
System.out.println("Welcome to "+"\v"+	"wonderla"); 
System.out.println("Welcome to \”St.John’s High School’\\"”);
System.out.println("Welcome to \’St.John’s High School’\");
System.out.println("Welcome to"+" \f" + "	wonderla");
System.out.println("Welcome to "+"\r" +   "	St.John’s High School");
System.out.println("Welcome to " + " \b" +" 	wonderla");
System.out.println("Welcome to \0	St.John’s High School");
System.out.println("Welcome to \\	St.John’s High School");
}//end of display()
}//end of class
