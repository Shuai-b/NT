import java.io.*;
import java.util.*;
class Arithmetic 

{
	int a,b,c,d,e,f,g ; 
	Scanner br = new Scanner (System.in);
	public static void main (String args [] ) 
	{
		Arithmetic obj = new Arithmetic() ; 
			obj.operate();
			
	}//End of main 
	void operate ()
	{
		Scanner br = new Scanner (System.in);
			System.out.println("Enter 2 Number ");
			System.out.println("The Following numbers WIll be Printed in five types of formats i.e. Binary Operators i.e +,-,/,*,%");
			     a=br.nextInt() ; 
				 b = br.nextInt();
				 c= a+b ; 
				 d = a-b ;
				 e = a/b;
				 f = a*b ; 
				 g = a%b;
								System.out.println("" +" " + c + " " + d + " " + e + " " + f + " " + g );
	}//end of operate 
}//End of class 
