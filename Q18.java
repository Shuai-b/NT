//Program to print the decimal equivalent of a binary number
import java.io.*;
import java.util.*;
class binary
{
	public static void main(String args[])
	{
		binary obj=new binary();
		obj.display();
	}//End of main()
	
	void display()
	{
		Scanner br=new Scanner(System.in);
        System.out.println ("Enter a binary number");
        int n=br.nextInt();
                 int decimal=0,p=0;
            
            while(n!=0)
            {
                decimal+=((n%10)*Math.pow(2,p));
                n=n/10;
                p++;
            }
            
            System.out.println("Binary value "+decimal);
        
	}//End of display()
}//End of class
/*Output
Enter a binary number
1001001
Decimal value 73
*/