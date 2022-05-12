//Program to print n terms for Fibonacci Series
import java.io.*;
import java.util.*;
class fibo
{   int n,fib,d;
	public static void main(String args[])
	{
		fibo obj=new fibo();
		obj.display();
	}//End of main()
	
	void display()
	{
		Scanner br=new Scanner(System.in);
        System.out.println ("Enter limit");
        	n=br.nextInt();
         int n1=0,n2=1,n3,i;    
        System.out.print(n1+" "+n2);  
    
        for(i=2;i<n;++i)   
 {    
         n3=n1+n2;    
         System.out.print(" "+n3);    
         n1=n2;   
         n2=n3;    
 }   
        	
	}//End of display()
}//End of class
/* Output
Enter limit
15
0 1 1 2 3 5 8 13 21 34 55 89 144 233 377
*/