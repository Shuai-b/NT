/* To Demonstrate   1 
					2 2 
					3 3 3 
					4 4 4 4 
					5 5 5 5 5 */

class nested 
{ 	public static void main(String args[])
{
		nested obj= new nested();
			obj.display();
}
	void display()
{	 for(int i=1;i<=5;i++)
{
for(int j=1;j<=i;j++)
System.out.print(i+" ");
System.out.println();
}
}
}
/* Output
  		    1 
			2 2 
			3 3 3 
			4 4 4 4 
			5 5 5 5 5 	*/ 

