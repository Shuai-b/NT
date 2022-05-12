//Program to whether number is a special number or not
import java.io.*;
import java.util.*;
class special
{
	public static void main(String args[])
	{
		special obj=new special();
		obj.display();
	}//End of main()
	
	void display()
	{
		Scanner br=new Scanner(System.in);
        System.out.println("Enter the number to be checked.");
        int num=br.nextInt();
        int sum=0;int temp=num;
        while(temp!=0)
        {
            int a=temp%10;int fact=1;
            for(int i=1;i<=a;i++)
            {
                fact=fact*i;
            }
            sum=sum+fact;
            temp=temp/10;
        }
        if(sum==num)
        {
            System.out.println(num+" is a Special Number.");
        }
        else
        {
            System.out.println(num+" is not a Special Number.");
        }
	}//End of display()
}//End of class
/*Output
Enter the number to be checked.
145
145 is a Special Number.

Enter the number to be checked.
175
175 is not a Special Number.
*/