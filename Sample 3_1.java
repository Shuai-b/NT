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
               System.out.println(“Welcome to\n St.John’s High School”);
System.out.println(“Welcome to \t St.John’s High School”);
System.out.println(“Welcome to \v St.John’s High School”); 
System.out.println(“Welcome to \”St.John’s High School’\”);
System.out.println(“Welcome to \’St.John’s High School’\”);
System.out.println(“Welcome to \f St.John’s High School”);
 System.out.println(“Welcome to \rSt.John’s High School”);
System.out.println(“St.John’s High Schoool\b Welcome to”);
System.out.println(“Welcome to \0St.John’s High School”);
System.out.println(“Welcome to \\St.John’s High School\\”);
}//end of display()
}//end of class 



