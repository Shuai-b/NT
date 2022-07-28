import java.io.*;
import java.util.*;
class Arithmetic 
{
	Scanner br = new Scanner (System.in);
	public static void main (String args [] ) 
	{
		Arithmetic obj = new Arithmetic() ; 
			obj.operate();
			
	}
	void operate ()
	{
		System.out.println("Enter your Choice");
		System.out.println("1.Binary Operaters ");
		System.out.println("2.Unary operater");
		System.out.println("3.Terinary Operator ");
		System.out.println("4.Math class ");
		System.out.println("5.Escape Sequence ");
		int ch = br.nextInt();
		
	
	switch (ch)
	{
		case 1: 
		{
			System.out.println("Enter 2 Number ");
			System.out.println("The Following numbers WIll be Printed in five types of formats i.e. Binary Operators i.e +,-,/,*,%");
			int a=br.nextInt() ; 
				int b = br.nextInt();
				int c= a+b ; 
					int d = a-b ;
					int e = a/b;
						int f = a*b ; 
							int g = a%b;
								System.out.println("" +" " + c + " " + d + " " + e + " " + f + " " + g );
								break ; 
		}
		case 2: 
		{
			System.out.println("They Two Types Of Unary Operater i.e = +, - For EXAMPLE  ");
		int a = 10;
		int b = a++;
		int c = a-- ; 
		System.out.println( b + " " + a );
		System.out.println( c + " " + a );
		break;
		
	}
		case 3 :
		{
			System.out.println(" They are 3 types of terinary Programs i.e && || and != ,, Which Are Used For Comparisons And Conditions ");
			break ; 
		}
		case 4 :
		{
			System.out.println("There are many Types of Math Class Out Of Which Here Are few ");
				System.out.println("Power of 2,5= "+ Math.pow(2,5));
					System.out.println("Rint of 5.8= "+ Math.rint(5.8));
						System.out.println("ceil  of 5.7 = "+ Math.ceil(5.7));
							System.out.println("Floor of 10.2  = "+ Math.floor(10.2));
								System.out.println("Absolute Of -256  = "+ Math.abs(-256));
									System.out.println("Random of  = "+ Math.random()) ;
									break ; 
		} 
			case 5:
			{
				System.out.println("Names \"Complete pk\" ");
				System.out.println("GaMING \'lAZY gENERAL\' ");
				System.out.println("Complete " + "\t" + "\t" +"Pk");
				System.out.println("Java " + "\n" + "ISC");
			}
		default:
	
	}
	
}
}