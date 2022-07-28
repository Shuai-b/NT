import java.io.*;
import java.util.*;
class s 
{
	public static void main (String args [] ) 
	{
		s obj = new s () ;
			 obj.display() ;
			 	
	}
	void display () 
	{
		Scanner br = new Scanner (System.in) ; 
			System.out.println( "Enter a number between 45 and 99  " )  ; 
				int n = br.nextInt() ; 
					int p ,o ; int  sum = 0  ;double  r ,q ,; 
						q = Math.pow(n,2 ) ;
						 	r=q%100 ; 
						 		q=q/100 ; 
						 			o=q+r ; 
						 				if (o==n)
						 					System.out.println("it is Karprekar ="+ o) ;
						 					else 
						 							System.out.println("it is not Karprekar ="+ o) ;
						 			
					
						 
	}
}