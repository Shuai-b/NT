import java.io.*;
import java.util.*;
class s 
{ 
	int sum  ;
	public static void main (String args []) 
	{
		s obj = new s () ;
		obj.display() ;
		
	}//End Of main 
	void display () 
	{
		Scanner Sc= new Scanner (System.in) ;
		System.out.println("Enter A number "); 
			int n = Sc.nextInt() ; 
		for (int i =1 ;i<=10 ;i++) 
		{	sum=n*i;
			System.out.println(n+"*"+i+" = "+sum);}
	}//End Of display()
}//End Of Class 
/*Output :
9*1 = 9
9*2 = 18
9*3 = 27
9*4 = 36
9*5 = 45
9*6 = 54
9*7 = 63
9*8 = 72
9*9 = 81
9*10 = 90 */