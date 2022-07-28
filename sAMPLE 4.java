//program to demonstrate the greater of three numbers using simple if
import java.io.*;
import java.util.*;
class num
{
             int a,b,c;
	public static void main(String args[])
	{
		num obj =new num();
		obj.display();
	}//end of main
	void display()
	{
  	Scanner sc=new Scanner(System.in);
 System.out.println("Enter three numbers");
 	  a=sc.nextInt();
 b=sc.nextInt();
 c=sc.nextInt();
 if(a>b&&a>c)
 {
 
 System.out.println(a);
 }
 	if(b>a&&b>c)
 	{
 		System.out.println(b);
 	}
   if(c>a&&c>b)
   {
System.out.println(c);
   }	
               
}//end of display()
}//end of class
