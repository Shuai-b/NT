import java.io.*;
import java.util.*;
class martix
{
	public static void main(String args[])
    matrix obj=new matrix();
    obj.display();
}
void display()
{Scanner sc=new Scanner(System.in);
int a[][]=new int[10][10];
int n=sc.nextInt();
System.out.println("enter the element");
for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{
a[i][]j]=sc.nextInt();
}}

int b[]=new int[n*n];
int c=0;
for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{
	b[c++]=a[i][j];
}
	}
	for(int i=0;i<n;i++)
	{
		System.out.println(a[i]);
	}
}

	