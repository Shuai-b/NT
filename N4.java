/* To demonstrate   5 5 5 5 5 
					4 4 4 4 
					3 3 3 
					2 2 
					1 */

class nested 
{
public static void main(String args[])
{
nested obj= new nested();
obj.display();
}
void display()
{ for(int i=5;i>=1;i--)
{
for(int j=1;j<=i;j++)
System.out.print(i+" ");
System.out.println();
}
}
}
/* Output 
 		5 5 5 5 5 
		4 4 4 4 
		3 3 3 
		2 2 
		1 
*/


