import java.io.*;
import java.util.*;
class bubble
{
		public static void main(String args[])
	{
	bubble obj=new bubble();
	obj.bubble();
	}
void bubble()
{	Scanner sc=new Scanner(System.in);
	int a[]=new int[6];
	System.out.println("Enter Elements");
	for (int i=0;i<6;i++)
	{
		a[i]=sc.nextInt();
	}
	int temp;
	for(int i=0;i<5;i++)
	{
		for (int j=0;j<5-1;j++)
		{
			if(a[i]>a[j+1])
			{
				temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
	}
	System.out.println("The Sorted elements are ");
	 for(int k=0 ; k<6;k++)
	 {
	 	System.out.print(a[k]+"\t");
	 }
}
}
