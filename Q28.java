//To find if whether a number is a Happy Numer or not
import java.io.*;
import java.util.*;
class happy
{   
	public static void main(String args[])
	{
		happy obj=new happy();
		obj.display();
	}//End of main()
	
	void display()
	{
		Scanner br=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=br.nextInt();
		int sum=0;
		int rem;
		while(num>0)
		{
			rem=num%10;
			sum+=rem*rem;
			num=num/10;
			if(num==0&&sum>9)
			{
				num=sum;
				sum=0;
			}
				
		}
		
		if(sum==1)
			System.out.println("It is a Happy Number");
			
			else
				System.out.println("It is not a Happy Number");
	
}//End of display()
}//End of class
/* Output
Enter a number
18
It is not a Happy Number

Enter a number
139
It is a Happy Number
*/
