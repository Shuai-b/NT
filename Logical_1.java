import java.io.*;
class c 
{
	public static void main (String args [] ) 
	{
		c obj = new obj () ; 
			obj.display() ; 
				
	} 
		 void display () 
		 {
		 	Scanner br= new Scanner (System.in) ;
		 	System.out.println(" Enter a number ") ; 
		 		int n = br.nextInt() ;
		 		int d , d1; int count  ; double sum ; 
		 			while(n!=0)
		 			{
		 				d= n%10 ;
		 				count ++ ;
		 				n=n/10 ;
		 				
		 			}
		 			  
		 			
		 				int d1 = n%10 ;
		 				sum= Math.pow(d1,count) ;
		 				count --;
		 				n=n/10 ; 
		 					
		 			
		 			if (sum == n ) 
		 				System.out.println("Super no.");
		 				else 
		 						System.out.println("not a Super no.");
		 }
}