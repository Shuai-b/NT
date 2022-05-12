//Program to reverse a number and find the sum of the products of the reverse number's digits with its preceeding number
import java.io.*;
import java.util.*;
class preceding
{   int n,m,d,e,j;
	public static void main(String args[])
	{
       preceding obj=new preceding();
          obj.display();
	}//End of main()
	
	void display()
	{
		Scanner br=new Scanner(System.in);
		System.out.println("Enter a number");
		m=br.nextInt();

		while(m!=0)
		{
			e=m%10;
			j=e*(e-1)+j;
			m=m/10;
		}
		System.out.println (j);
	}//End of display()
}//End of class
/* Output
Enter a number
856
106
*/