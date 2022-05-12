//Program to print the binary equivalent of a decimal number
import java.io.*;
import java.util.*;
class decimal
{
	public static void main(String args[])
	{
		decimal obj=new decimal();
		obj.display();
	}//End of main()
	
	void display()
	{
		Scanner br=new Scanner(System.in);
        System.out.println ("Enter a decimal number");
        int n=br.nextInt();
                 int a;
                 String x="";
            
            while(n!=0)
            {
                 a = n % 2;
            x = x + "" + a;
            n = n / 2;
            }
            
            System.out.println("Binary value "+x);
        
	}//End of display()
}//End of class
/*Output
Enter a decimal number
73
Binary value 1001001
*/